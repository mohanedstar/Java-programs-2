package midterm;
import javax.swing.*;
import java.awt.*;
public class Shape_4 extends JFrame{

	
public Shape_4() {
	setSize(500,500);
	setVisible(true);
}


	    public void paint(Graphics g) {
	   
	       
	        g.setColor(Color.BLACK);

	   
	        int squareX = 50;
	        int squareY = 50;
	        int squareSize = 300;
	        g.drawRect(squareX, squareY, squareSize, squareSize);

	        int bigDiameter = squareSize;
	        int bigRadius = bigDiameter / 2;
	        int centerX = squareX + bigRadius;
	        int centerY = squareY + bigRadius;
	        g.drawOval(squareX, squareY, bigDiameter, bigDiameter);

	        double r = bigRadius / (1 + Math.sqrt(2));
	        int smallRadius = (int) r;
	        int smallDiameter = smallRadius * 2;

	        int offset = (int)(r * (1 + Math.sqrt(2) - 1));
	        int dx = (int) (offset / Math.sqrt(2));

	        int[][] centers = {
	        		   {centerX - dx, centerY - dx},
	        		   {centerX + dx, centerY - dx},
	        		   {centerX - dx, centerY + dx},
	        		   {centerX + dx, centerY + dx} 	        };

	        for (int i = 0; i < centers.length; i++) {
	            int cx = centers[i][0];
	            int cy = centers[i][1];
	            int x = cx - smallRadius;
	            int y = cy - smallRadius;

	            if (i == 1 || i == 2) {
	                g.setColor(Color.BLUE);
	                g.fillOval(x, y, smallDiameter, smallDiameter);
	                g.setColor(Color.BLACK); 	            }

	            g.drawOval(x, y, smallDiameter, smallDiameter);
	        }

	        int centerSmallRadius = (int)(smallRadius * (Math.sqrt(2) - 1));
	        int centerSmallDiameter = centerSmallRadius * 2;
	        g.drawOval(centerX - centerSmallRadius, centerY - centerSmallRadius,
	                    centerSmallDiameter, centerSmallDiameter);
	    }

	       
	    
	    
	   
	     public static void main(String[] args) {
	      
	      Shape_4  s = new Shape_4();
	      
	       
	}
	
}
