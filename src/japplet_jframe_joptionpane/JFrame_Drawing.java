package japplet_jframe_joptionpane;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class JFrame_Drawing extends JFrame{
	
	//Bow constants
	public static final int CIR_DIAMETER = 20;
	public static final int X_CIR = 320;
	public static final int Y_CIR = 320;
	
	public JFrame_Drawing() {
		setSize(650,650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		JFrame_Drawing guiWindow = new JFrame_Drawing();
		guiWindow.setVisible(true);
	}
		
		public void paint(Graphics canvas) {
			canvas.setColor(Color.CYAN);
			//Draw a bow
			for(int i = 0; i < 10; i++) {
			canvas.drawOval(X_CIR - 10 * i, Y_CIR - 10 * i, CIR_DIAMETER * i , CIR_DIAMETER * i );
			}
			
		}	
}
