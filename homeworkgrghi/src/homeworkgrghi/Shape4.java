package homeworkgrghi;


import javax.swing.*;
import java.awt.*;


public class Shape4 extends JFrame {
	
	public Shape4() {
		super("drowTree");
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape4 G = new Shape4();
	}
public void paint(Graphics g ) {
		
		int x, y ,xc,yc,w ,h ,l , r ,size,sm_size;
		
		x=50;   y=50;  w=100;   h=100;   l=(int)w/3;   r=l/2;
		
		xc=x+(int)w/2;  yc=y+(int)h/2;
		
		size=(int)(2*r+r);    sm_size=(int)(r+r/3);
		
		g.drawRect(x, y, w, h);// the rectangular
		g.drawOval(x, y,size,size );//1_Circuit
		g.drawOval((x+w)-size, y, size,size);//2_Circuit
		g.drawOval((x+w)-size,(h+y)-size, size, size);//3_Circuit
		g.drawOval(x, (h+y)-size, size,size);//4_Circuit
	    g.drawOval(xc-(int)sm_size/2, yc-(int)sm_size/2, sm_size, sm_size);//center_circt
	    for(int i = 0 ; i<360;i++) {
	   y=(int)(90*Math.sin((Math.PI*i/180)));
	    g.drawLine(i+xc, yc+y, i+xc, yc+y);}
	}
	
}