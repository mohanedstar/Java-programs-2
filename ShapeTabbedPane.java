import javax.swing.*;
import java.awt.*;

public class ShapeTabbedPane extends JFrame {
    public ShapeTabbedPane() {
        setTitle("Shape Drawer");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();

        tabs.addTab("Tree", new TreePanel());
        tabs.addTab("Letter F", new FPanel());
        tabs.addTab("Flower", new FlowerPanel());
        tabs.addTab("Circles in Square", new CircleSquarePanel());
        tabs.addTab("Spinning Arcs", new SpinWheelPanel());

        add(tabs);
        setVisible(true);
    }

    // Tree shape (rectangle + oval)
    class TreePanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(new Color(139, 69, 19)); // brown trunk
            g.fillRect(220, 250, 20, 100);
            g.setColor(Color.GREEN);
            g.fillOval(190, 170, 80, 100);
        }
    }

    // Letter F
    class FPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(10));
            g.drawLine(200, 100, 200, 300);
            g.drawLine(200, 100, 260, 100);
            g.drawLine(200, 180, 240, 180);
        }
    }

    // Flower shape (center + petals)
    class FlowerPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.fillOval(200, 200, 100, 100);
            g.setColor(Color.RED);
            g.fillOval(190, 170, 30, 30);
            g.fillOval(280, 170, 30, 30);
            g.fillOval(190, 300, 30, 30);
            g.fillOval(280, 300, 30, 30);
        }
    }

    // Four big circles in square + center circle
    class CircleSquarePanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.drawRect(100, 100, 300, 300);
            g.drawOval(100, 100, 150, 150);
            g.drawOval(250, 100, 150, 150);
            g.drawOval(100, 250, 150, 150);
            g.drawOval(250, 250, 150, 150);
            g.drawOval(200, 200, 100, 100); // center circle
        }
    }

    // Spin wheel using black/white arcs
    class SpinWheelPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            int x = 150, y = 150, w = 200, h = 200;
            int arcs = 12;
            for (int i = 0; i < arcs; i++) {
                g2.setColor(i % 2 == 0 ? Color.BLACK : Color.WHITE);
                g2.fillArc(x, y, w, h, i * (360 / arcs), 360 / arcs);
            }
            g2.setColor(Color.GRAY);
            g2.drawOval(x, y, w, h);
        }
    }

    public static void main(String[] args) {
        new ShapeTabbedPane();
    }
}