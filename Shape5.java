package homeworkgrghi;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;


public class Shape5 extends JFrame implements ActionListener {
	
	Timer timer ;
	int xc=200,yc=200;

	int g,i;
	
	int y= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of ARCS ","For the Cycle",3));
	
	int m =  (int)(360/y); 
	public Shape5() {
		super("drowTree");
		setSize(400,400);
		setVisible(true);
		
		timer= new Timer(100,this);
		timer.start();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape5 G = new Shape5();
	}
	public void paint(Graphics g) {
		for(int i =100  ; i<110;i+=1)
		g.drawOval(xc-i,yc-i,i*2,i*2);
	}
	
	public void actionPerformed(ActionEvent event ) {
		Graphics gg = this.getGraphics();
		if(i<=360){
			if(g%2==0)
			gg.setColor(Color.white);
			gg.fillArc(100, 100, 200, 200, i, m);
			i+=m;g++;
			}
		else
		timer.stop();
		}

	}
