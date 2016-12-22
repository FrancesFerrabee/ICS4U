
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * @version Nov. 2015
 * 
 * @author Christina Kemp adapted from Sam Scott
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, MouseListener {
	int width = 1920;
	int height = 1024;
	public int counts=0;
	int clickNumber=0;
	/**
	 * The number of balls on the screen.
	 */
	int numBalls =30;
	int fast=10;
	// the speed of the balls and squares
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 50;
	/**
	 * An array of balls.
	 */
	FlashingBall[] ball = new FlashingBall[numBalls];
	Square[] square= new Square[numBalls];
	/** main program (entry point) */
	public static void main(String[] args) {

		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Dodgeball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 300));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();
		
	}

	public GamePanel(){
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.black);
		for (int i = 0; i < numBalls; i++) {
			ball[i] = new FlashingBall(50, 50, 0, width, 0, height);
			ball[i].setXSpeed(Math.random() * fast-8);
			ball[i].setYSpeed(Math.random() * fast-8);
			ball[i].setColor(new Color((int) (Math.random() * 256), (int) (Math
					.random() * 256), (int) (Math.random() * 256)));
			square[i] = new Square(50, 50, 0, width, 0, height);
			square[i].setXSpeed(Math.random() * fast-8);
			square[i].setYSpeed(Math.random() * fast-8);
			square[i].setColor(new Color((int) (Math.random() * 256), (int) (Math
					.random() * 256), (int) (Math.random() * 256)));
			// sets the speed and color of the balls and squares
		}
		
		Thread gameThread = new Thread(this);
		gameThread.start();
		addMouseListener (this);
	}

	/**
	 * Repaints the frame periodically.
	 */
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(pauseDuration);
			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < numBalls; i++) {
			ball[i].draw(g);
			square[i].draw(g);
			g.drawString("counter: "+counts,45,  45);
		}
	}
// draws the squares and circles along with the score.
	@Override
	public void mouseClicked(MouseEvent e) {
		clickNumber++;
		if(clickNumber>15)
		{
			fast=fast++;
		}
		else
		{
		fast= fast+5;
		}
		for (int i = 0; i < numBalls; i++) {
			
			ball[i].setXSpeed(Math.random() * fast-8);
			ball[i].setYSpeed(Math.random() * fast-8);
			square[i].setXSpeed(Math.random() * fast-8);
			square[i].setYSpeed(Math.random() * fast-8);
		}
	
		
		int d;
		int j; 
		int k;
		int q;
		int f;
		int w;
		int p;
		int r;
		int h;
		int s;
		int z;
		int l;
		
		int x = e.getX ();
		int y = e.getY ();
		// gets the x and y position of the mouse
		for( int i=0; i<ball.length;i++)
		{
			j=(int)ball[i].getX();
			k=(int)ball[i].getY();
			r= (int)ball[i].getRadius();
			// gets the x, radius and y position of the ball
			s=(int)square[i].getX();
			z=(int)square[i].getY();
			l= (int)square[i].getRadius();
			// gets the x, radius and y position of the ball
			q=x-j;
			w= x-s;
		// the difference between the x value of the mouse and the x value of the square or ball.
			if(q<0|| w<0)
			{
				q=q*-1;
				w=w*-1;
				// make the difference positive
			}
			p= y-k;
			f= y-z;
			// the difference between the y value of the mouse and the y value of the square or ball.
			if(p<0||f<0)
			{
				p= p*-1;
				f=f*-1;
				// make the difference positive
			}
			d=(int) Math.pow((p*p+q*q), 0.5);
			h=(int) Math.pow((w*w+f*f), 0.5);
			// pythagorean theory to find the hypoteneuse.
			if(d<(r+1))
			{
				ball[i].setColor(new Color((int) (1), (int) (3), (int) (5)));
				counts++;
				// makes the ball invisible
			}
			if(h<(l+1))
			{
				square[i].setColor(new Color((int) (1), (int) (3), (int) (5)));
				counts++;
				// makes the square invisible
			}
		}
		if(counts==(ball.length))
		{
			int c=(int) (Math.random() * 256);
			int b=(int) (Math.random() * 256);
			int o= (int) (Math.random() * 256);
			
			for( int i=0; i<ball.length;i++)
			{
				ball[i].setColor(new Color((int) (c), (int) (b), (int) (o)));
				square[i].setColor(new Color((int) (c), (int) (b), (int) (o)));
				// changes the color of all the balls so they are visible
			}
			counts=0;
			// restarts the points
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

}
