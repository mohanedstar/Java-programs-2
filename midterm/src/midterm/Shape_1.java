package midterm;
import java.awt.*;
	import javax.swing.*;

public class Shape_1 extends JFrame {
	
		public Shape_1() {
			setSize(400,400);
			setVisible(true);
		}

	    @Override
		public void paint(Graphics g) {
	  
	    	 int centerX = 200;
		        int centerY = 200;
		        int innerRadius = 50;
		        int outerRadius = 100;
		        int numPoints = 20;

		        Polygon star = new Polygon();

		        for (int i = 0; i < numPoints * 2; i++) {
		            double angle = Math.PI / numPoints * i;
		            int r = (i % 2 == 0) ? outerRadius : innerRadius;
		            int x = centerX + (int) (Math.cos(angle) * r);
		            int y = centerY + (int) (Math.sin(angle) * r);
		            star.addPoint(x, y);
		        }

		        g.setColor(Color.MAGENTA);
		        g.drawPolygon(star);
	    }
	    public static void main(String[]args) {
	    	Shape_1 ed= new Shape_1();
	    }

	

	  
}

	

