package japplet_jframe_joptionpane;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

/**
Applets that display a happy face, olympic symbol and crescent moon.
Author: Paola Gloria. Programmer.
Revision of Listing 1.2 from Java book.
*/

public class JApplet_Exercices extends JApplet {
	
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
	
	public static final int NOSE_DIAMETER = 10;
	public static final int X_NOSE = 195;
	public static final int Y_NOSE = 135;
	
	public static final int MOUTH_WIDTH = 100;
	public static final int MOUTH_HEIGHT = 50;
	public static final int X_MOUTH = 150;
	public static final int Y_MOUTH = 160;
	public static final int MOUTH_START_ANGLE = 180;
	public static final int MOUTH_EXTENT_ANGLE = -180;
	
	//Olympic's Symbol constants
	public static final int CIRCLE_WIDTH = 100;
	public static final int CIRCLE_HEIGHT = CIRCLE_WIDTH;
	public static final int Y_TOP_CIRCLE = 300;
	public static final int Y_BOTTOM_CIRCLE = 360;
	public static final int X_TOP_CIRCLE_1 = 100;
	public static final int X_TOP_CIRCLE_2 = 205;
	public static final int X_TOP_CIRCLE_3 = 310;
	public static final int X_BOTTOM_CIRCLE_4 = 150;
	public static final int X_BOTTOM_CIRCLE_5 = 260;
	
	//crescent moon constants
	public static final int X_OUTER_CIRCLE = 500;
	public static final int Y_OUTER_CIRCLE = 50;
	public static final int OUTER_CIRCLE_WIDTH = 200;
	public static final int OUTER_CIRCLE_HEIGHT = OUTER_CIRCLE_WIDTH;
	public static final int OUTER_CIRCLE_START_ANGLE = 180;
	public static final int OUTER_CIRCLE_EXTENT_ANGLE = 320;
	
	public static final int X_INNER_CIRCLE = X_OUTER_CIRCLE;
	public static final int Y_INNER_CIRCLE = 65;
	public static final int INNER_CIRCLE_WIDTH = 150;
	public static final int INNER_CIRCLE_HEIGHT = INNER_CIRCLE_WIDTH;
	public static final int INNER_CIRCLE_START_ANGLE = 180;
	public static final int INNER_CIRCLE_EXTENT_ANGLE = 310;


	
	public void paint(Graphics canvas) {
		
		//Happy Face
		canvas.setColor(Color.YELLOW);
		canvas.fillOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
		canvas.setColor(Color.BLACK);
		canvas.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
		canvas.setColor(Color.BLUE);
		canvas.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
		canvas.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
		canvas.setColor(Color.BLACK);
		canvas.fillOval(X_NOSE, Y_NOSE, NOSE_DIAMETER, NOSE_DIAMETER);
		canvas.setColor(Color.RED);
		canvas.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE, MOUTH_EXTENT_ANGLE);

		
		//symbol of	the Olympics.
		canvas.setColor(Color.BLACK);
		canvas.drawOval(X_TOP_CIRCLE_1, Y_TOP_CIRCLE, CIRCLE_WIDTH, CIRCLE_HEIGHT);
		canvas.drawOval(X_BOTTOM_CIRCLE_4, Y_BOTTOM_CIRCLE, CIRCLE_WIDTH, CIRCLE_HEIGHT);
		canvas.drawOval(X_TOP_CIRCLE_2, Y_TOP_CIRCLE, CIRCLE_WIDTH, CIRCLE_HEIGHT);
		canvas.drawOval(X_BOTTOM_CIRCLE_5, Y_BOTTOM_CIRCLE, CIRCLE_WIDTH, CIRCLE_HEIGHT);
		canvas.drawOval(X_TOP_CIRCLE_3, Y_TOP_CIRCLE, CIRCLE_WIDTH, CIRCLE_HEIGHT);
		
		//crescent moon.
		canvas.drawArc(X_OUTER_CIRCLE, Y_OUTER_CIRCLE, OUTER_CIRCLE_WIDTH, OUTER_CIRCLE_HEIGHT, OUTER_CIRCLE_START_ANGLE, OUTER_CIRCLE_EXTENT_ANGLE);
		canvas.drawArc(X_INNER_CIRCLE, Y_INNER_CIRCLE, INNER_CIRCLE_WIDTH, INNER_CIRCLE_HEIGHT, INNER_CIRCLE_START_ANGLE, INNER_CIRCLE_EXTENT_ANGLE);
		
	}
}
