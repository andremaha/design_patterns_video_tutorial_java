package headfirst.template_method;

import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * Example of the Template Method use inside of Java. The paint method is in fact a hook - it lets us hook into the 
 * JFrame execution.
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 27, 2013
 */
public class LoveFrame extends JFrame {
	
	public LoveFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	/**
	 * By default paint() of the JFrame does nothing. It's a hook we need to override
	 * in order to get the painting going.
	 */
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "Alpaka is the Best!";
		graphics.drawString(msg, 90, 100);
	}
	
	public static void main(String[] args) {
		LoveFrame myFrame = new LoveFrame("Love message");
	}

}
