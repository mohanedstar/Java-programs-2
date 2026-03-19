package midterm;
import java.awt.*;

import javax.swing.JFrame;

public class Shape5 extends JFrame {

	    
	    public Shape5() {
	    	setSize(500,500);
	    	setVisible(true);
	    }
	    
	    
	    public void paint(Graphics g2) {
	       
	        g2.setColor(Color.MAGENTA);

	        int baseX = 50;
	        int baseY = 300;
	        int size = 220;

	        int[] xPoints = {baseX, baseX, baseX + size+20};
	        int[] yPoints = {baseY, baseY - size+40, baseY};
	        g2.drawPolygon(xPoints, yPoints, 3);

	        int bigSquareSize = 120;
	        int bigSquareX = baseX;
	        int bigSquareY = baseY - bigSquareSize;
	        g2.drawRect(bigSquareX, bigSquareY, bigSquareSize, bigSquareSize);

	        int c1x = bigSquareX + bigSquareSize / 2;
	        int c1y = bigSquareY + bigSquareSize / 2;
	        int r1 = bigSquareSize / 2;
	        g2.drawOval(c1x - r1, c1y - r1, r1 * 2, r1 * 2);

	       
	        int smallSquareSize = 40;
	        int smallSquareX = bigSquareX ;     
	        int smallSquareY = bigSquareY - smallSquareSize ; 
	        g2.drawRect(smallSquareX, smallSquareY, smallSquareSize, smallSquareSize);

	        
	        int c2x = smallSquareX + smallSquareSize / 2;
	        int c2y = smallSquareY + smallSquareSize / 2;
	        int r2 = smallSquareSize / 2;
	        g2.drawOval(c2x - r2, c2y - r2, r2 * 2, r2 * 2);

	       
	        int midSquareSize = 60;
	        int midSquareX = bigSquareX + bigSquareSize;
	        int midSquareY = baseY - midSquareSize;
	        g2.drawRect(midSquareX, midSquareY, midSquareSize, midSquareSize);

	        int c3x = midSquareX + midSquareSize / 2;
	        int c3y = midSquareY + midSquareSize / 2;
	        int r3 = midSquareSize / 2;
	        g2.drawOval(c3x - r3, c3y - r3, r3 * 2, r3 * 2);
	    }

	    public static void main(String[] args) {
	
	    	Shape5 s = new Shape5();
	}
	
	
	
}
