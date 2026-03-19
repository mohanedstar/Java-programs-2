package finalgrighex;

import java.awt.*;
import java.awt.geom.AffineTransform;

import javax.swing.*;
public class Q3 extends JFrame	 {
	
	public Q3() {
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
		 
		public void sq_full(double ang,int line) {
			for(int i=0;i<4;i++) {
				forward(line);
				right(ang);	
			}
		}
		public void shape(double x, int y) {
			left(45);
			sq_full(x,y);
			right(45);
			}
		
	
	public void paint(Graphics g) {
		g.drawRect(50, 50, 600, 600);
		g2d=(Graphics2D)g;
	
		moveTo(250,350);
		sq_full(90,200);

		moveTo(200,0);
		shape(-90,100);
		moveTo(0,-190);
		sq_full(90,50);
		shape(-90,25);
		moveTo(50,0);
		shape(-90,25);
		
		moveTo(20,70);
		sq_full(90,50);
		
		moveTo(50,0);
		shape(90,25);
		moveTo(0,50);
		shape(90,25);
		moveTo(-120,70);
		g2d.transform(new AffineTransform(-1,0,0,1,0,0));		
		
		moveTo(200,0);
		shape(-90,100);
		moveTo(0,-190);
		sq_full(90,50);
		shape(-90,25);
		moveTo(50,0);
		shape(-90,25);
		
		moveTo(20,70);
		sq_full(90,50);
		
		moveTo(50,0);
		shape(90,25);
		moveTo(0,50);
		shape(90,25);
		
		
	}
	
	public static void main(String[]args) {
		Q3 test= new Q3();
	}
}
