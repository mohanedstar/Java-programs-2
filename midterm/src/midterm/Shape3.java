package midterm;
import javax.swing.*;
import java.awt.*;
public class Shape3 extends JFrame {
	
	public Shape3() {
		setSize(600,600);
		setVisible(true);
	}
	
	int xx=100 ;
	int yy=100;
	int w=400;
	int h=400;
	int xc=xx+w/4;
	int yc= yy+h/3;
	int[] xt= {xx,xx+w,xx+w/2};
	int[] yt= {yy,yy,yy+h};
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawPolygon(xt,yt,3);
		g.drawOval(xx, yy-10,w/2,20);
		g.drawOval(xx+w/2, yy-10,w/2,20);
		g.setColor(Color.blue);
		g.drawRect(xx+w/4, yy+h/3,200, 267);
		g.drawOval(xc-52, yc-101,100,101);
		g.fillOval(xc+50, yc-101, 105, 102);
		g.drawOval(xc+152, yc-101, 100, 101);

	}
	public static void main(String[]args) {
		Shape3 ed=new Shape3();
	}
}

