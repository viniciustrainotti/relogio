package relogio;

import java.awt.Window;

import javax.swing.JFrame;

public class Program{
	
	public static void main(String[] args){
		
		int width = 800;
		int height = 500;
		Window window = new Window(width, height);
		
		JFrame frame = new JFrame("Relogio");
		frame.add(window);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setFocusable(focusable);
		
		
	}

}
