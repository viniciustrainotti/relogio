package relogio;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Window extends JPanel{
	
	public void paint(Graphics g) {
		
	    Graphics2D g2 = (Graphics2D) g;
	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	    RenderingHints.VALUE_ANTIALIAS_ON);
	    Font font = new Font("Serif", Font.PLAIN, 96);
	    g2.setFont(font);

	    g2.drawString(" ", 40, 120); 
	  }

}
