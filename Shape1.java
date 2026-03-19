package homeworkgrghi;


 import javax.swing.*;
 import java.awt.*;
 
 
public class Shape1 extends JFrame {
	
	public Shape1() {
		super("drowTree");
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape1 G = new Shape1();
	}

	public void paint(Graphics g ) {
	g.setColor((Color.GREEN));
	g.fillOval(135, 55,70, 150);
	g.setColor(new Color(139,69,19));
	g.fillRect(160, 200, 20, 120);
	}

	
	
	
	
	
	
}
