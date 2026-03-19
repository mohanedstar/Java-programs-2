package finalgrighex;
import java.awt.*;
import java.awt.geom.AffineTransform;

import javax.swing.*;



public class Q4 extends JFrame {
	
	
	public Q4() {
		setSize(700,700);
		setVisible(true);
	}

	public Graphics2D g2d;

	 void moveTo(int x, int y){
		 g2d.translate(x, y); }
		 public void forward(int length){
		 g2d.drawLine(0, 0, length, 0);
		 g2d.translate(length, 0); }
		  void right(double a){
		 g2d.rotate(a*Math.PI/180); }
		  void left(double a){
		 g2d.rotate(-a*Math.PI/180); }
		 public void forward1(int length){
		 g2d.translate(length, 0); }
		 
		 public void shape() { right(45);
			 for(int i =0;i<4;i++) {
				 right(90);
				 forward(25);
				 
			 }
			left(45);
			 
			
			 
			
			 
			 
			 
		 }
		 public void shape1() {	right(20);int r =25;
			 forward(r);
			left(45);
		forward(r);
			left(135);
				forward(r);
			left(45);
		forward(r);
			left(135);
			left(20);
			
//			 int r=25;left(90);
//		 left(45);
//		 forward(r);
//		 left(135);
//		 forward(r);
//		 left(45);
//		 forward(r);
//		 left(135);
//		 forward(r);
//			 right(90);
		 }

		 public void paint(Graphics g) {g.drawRect(50, 50, 600, 600);
			g2d=(Graphics2D)g;
			moveTo(300,350);
			
			int o=50;
			int t=((int)o/3);
			forward(t);
			//
			right(180);
			forward(t);//left
			shape1();
			right(180);
			forward(t);
			
			left(135);
			forward(o);//left_up1
			shape();
			right(180);
			forward(o);
			left(45);
			
			
			forward(t);//right
			//
			shape1();
			right(180);
			forward(t);
			right(135);
			forward(o);//right-up1
			shape();
			right(180);
			forward(o);
			right(45);
			left(90);
			
			
			forward(t);//down
			//
			shape1();
			right(180);
			forward(t);
			
		

		
			forward(t);//up
			//
			shape1();
			right(180);
			forward(t);
			left(45);
			forward(o);//down-right1
			shape();
			left(180);
			forward(o);
			right(270);
			forward(o);//down-left1
			shape();
			
			
			
			
			
		 }
	public static void main(String[] args) {

		Q4 test= new Q4();
	}

}
