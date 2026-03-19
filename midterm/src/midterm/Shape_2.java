package midterm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Shape_2 extends JFrame implements ActionListener{
	Polygon[]pm = new Polygon[10];
	Timer timer;
	public Shape_2() {
		setSize(550,550);
		setVisible(true);
		timer=new Timer(800,this);
		timer.start();
		
		
	}
	int x_f=50;
	int y_f=50;
	int xc=240;
	int yc=240;
	int l=50;
	int hl=(int)l/2;
	int xcc=105; int ycc=105;
	public Polygon drowply(int[]x,int[]y,Graphics g ) {
		Polygon p = new Polygon();
		for(int i=0; i<x.length;i++) {
			p.addPoint(x[i],y[i]);
		}
		return p;
	}
	

	public void paint(Graphics g) {
		g.drawRect(x_f, y_f, 2*xc, 2*yc);
		
		
		int x1[]= {x_f+xc,x_f+2*xc,x_f+xc,x_f};
		int y1[]= {y_f,y_f+yc, y_f+2*yc,y_f+yc};
		
		
		int x2[]= {x_f+xc,x_f+2*xc-l,x_f+xc,x_f+l};
		int y2[]= {y_f+l,y_f+yc, y_f+2*yc-l,y_f+yc};
		
		int x3[]= {x_f+xc,x_f+xc+hl,x_f+xc,x_f+xc-hl};
		int y3[]= {y_f,y_f+hl,y_f+l,y_f+hl};
		
		int x4[]= {x_f+2*xc,x_f+2*xc-hl,x_f+2*xc-l,x_f+2*xc-hl};
		int y4[]= {y_f+yc,y_f+yc+hl,y_f+yc,y_f+yc-hl};
		
		int x5[]= {x_f+xc,x_f+xc-hl,x_f+xc,x_f+xc+hl};
		int y5[]= {y_f+2*yc,y_f+2*yc-hl,y_f+2*yc-l,y_f+2*yc-hl};
		
		int x6[]= {x_f,x_f+hl,x_f+l,x_f+hl};
		int y6[]= {y_f+yc,y_f+yc-hl,y_f+yc,y_f+yc+hl};
		
		
		
		pm[0]=drowply(x1,y1,g);
		pm[1]=drowply(x2,y2,g);
		pm[2]=drowply(x3,y3,g);
		pm[3]=drowply(x4,y4,g);
		pm[4]=drowply(x5,y5,g);
		pm[5]=drowply(x6,y6,g);
			
	}
public void actionPerformed(ActionEvent event ) {
		Graphics g = this.getGraphics();
		for(int i =0 ; i<4;i++) {
		g.drawPolygon(pm[0]);
		g.setColor(Color.red);
		g.fillPolygon(pm[1]);
		g.fillPolygon(pm[2]);
		g.fillPolygon(pm[3]);
		g.fillPolygon(pm[4]);
		g.fillPolygon(pm[5]);
		}
		for(int i =0,m=2 ,t=30; i<9;i++,t+=30,m++) {
			g.setColor(Color.white);
			if(i==0) {g.setColor(Color.black);
			g.fillOval(x_f+xcc, y_f+ycc, 270, 270);}
			else
				if(m%2==0)g.setColor(Color.black);
		g.fillOval(x_f+xcc+t/2, y_f+ycc+t, 270-t, 270-t);

		}
	
timer.stop();
		
	}
	public static void main(String[]aegs) {
		Shape_2 ex = new Shape_2();
	}
}
