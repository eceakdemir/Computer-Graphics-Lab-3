// Zehra Ece Akdemir
// 201811002
// section 2

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Lab3B {
	public static class AWTDemo extends Frame implements ActionListener, MouseListener {

		private static final long serialVersionUID = 1L;
		private static boolean clicked = false;
		List<Point2D.Float> points;
		public AWTDemo() {
			points = new ArrayList<Point2D.Float>();
			addWindowListener(new MyFinishWindow());
			
		}
		public void paint(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			
			if(clicked){
				g2d.drawOval(400,200,2*100,2*100);
				g2d.drawOval(300,100,2*50,2*50);
			}
			else{
				g2d.drawOval(200,200,2*100,2*100);
				g2d.drawOval(100,100,2*50,2*50);
			}
		}
		
		public AWTDemo(int a) {
			if(a == 1 ) {
				setTitle("Lab 3A");
				points = new ArrayList<Point2D.Float>();
				
			}
			else if (a == 2) {
				setTitle("Lab 3B");
				points = new ArrayList<Point2D.Float>();
				addWindowListener(new MyFinishWindow());
				addMouseListener(this);
				}
		}
		
		public class MyFinishWindow extends WindowAdapter {
		     public void windowClosing(WindowEvent e) {
		       System.exit(0);
		     }
		}
		
			
		
		public void mouseClicked(MouseEvent arg0) {
			int x = arg0.getX();
			int y = arg0.getY();
			System.out.println(x);
			System.out.println(y);
			Point2D.Float point = new Point2D.Float(x, y);
			points.add(point);
			if(clicked){
				clicked=false;
			}
			else{
				clicked=true;
			}
			
			repaint();
			// TODO Auto-generated method stub
			
		}
		
		public static void main(String[] argv) {
			AWTDemo a = new AWTDemo(2);
			
			a.setSize(500,500);
			a.setVisible(true);
		}
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
	}
}
