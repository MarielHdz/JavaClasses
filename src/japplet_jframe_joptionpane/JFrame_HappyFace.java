package japplet_jframe_joptionpane;

import java.awt.Graphics;

import javax.swing.JFrame;

public class JFrame_HappyFace extends JFrame {
	
	//Happy Face constants
	public static final int FACE_DIAMETER = 200;
	public static final int X_FACE = 100;
	public static final int Y_FACE = 50;
	
	public static final int EYE_WIDTH = 10;
	public static final int EYE_HEIGHT = 20;
	public static final int X_LEFT_EYE = 155;
	public static final int Y_LEFT_EYE = 100;
	public static final int X_RIGHT_EYE = 230;
	public static final int Y_RIGHT_EYE = Y_LEFT_EYE;
	
	public static final int MOUTH_WIDTH = 100;
	public static final int MOUTH_HEIGHT = 50;
	public static final int X_MOUTH = 150;
	public static final int Y_MOUTH = 160;
	public static final int MOUTH_START_ANGLE = 180;
	public static final int MOUTH_EXTENT_ANGLE = -180;
	
	public JFrame_HappyFace() {
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		JFrame_HappyFace guiWindow = new JFrame_HappyFace();
		guiWindow.setVisible(true);
	}
		
		public void paint(Graphics canvas) {
			
			//Happy Face
			canvas.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
			canvas.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
			canvas.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
			canvas.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE, MOUTH_EXTENT_ANGLE);
			
		}	

}
