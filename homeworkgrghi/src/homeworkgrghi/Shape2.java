package homeworkgrghi;

import javax.swing.*;
import java.awt.*;


public class Shape2 extends JFrame {
	
	public Shape2() {
		super("drowTree");
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape2 G = new Shape2();
	}
	
	public void paint(Graphics g ) {
		g.drawLine(120, 100,350, 100);//1 main line
		g.drawLine(350, 100, 350, 160);//2 Connect
		g.drawLine(200, 160,350, 160);//3 main line
		g.drawLine(200, 160, 200, 220);//4  Connect
		g.drawLine(200, 220,300, 220);//5 main line
		g.drawLine(300, 220, 300, 280);//6 Connect 
		g.drawLine(200, 280,300, 280);//7 main line
		g.drawLine(200, 280, 200, 380);//8 Connect
		g.drawLine(120, 380,200, 380);//9 main line
		g.drawLine(120, 380,120, 100);//10 Connect

		
		

		}

	
}
