package homeworkgrghi;

import javax.swing.*;
import java.awt.*;


public class Shape3 extends JFrame {
	
	public Shape3() {
		super("drowTree");
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape3 G = new Shape3();
	}
	public void paint(Graphics g) {
		int x ,y ,xc,yc,r,w,h;
		x=50;y=50;w=300;h=300;
		xc=x+w/2;yc=y+h/2;
		r=(int)w/8;
		g.drawRect(x, y, w, h);
		g.setColor(Color.red);
		g.fillOval(xc-2*r, yc-2*r, 4*r, 4*r);
		g.setColor(Color.blue);
		g.fillOval(xc-r, y, 2*r, 2*r);//1
		g.fillOval(xc+2*r, yc-r, 2*r, 2*r);//2
		g.fillOval(x, yc-r, 2*r, 2*r);//3
		g.fillOval(xc-r, yc+2*r, 2*r, 2*r);//4

	}
	
}