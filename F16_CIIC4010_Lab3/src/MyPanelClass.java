import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.red);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                        //Draw a border
                        //g.setColor(Color.YELLOW);
                        //g.drawRect(x1,y1,width,height);
                        
                        //Draw inside border
                        //g.setColor(Color.red);
                        //g.drawRect(x1+1,y1+1,width-2,height-2);
                        
                        //Draw line from top-left to bottom-right 
                        //g.setColor(Color.WHITE);
                        //g.drawLine(x1, y1, x2, y2);
                        
                        //Draw line from top-right to bottom-left 
                        //g.setColor(Color.GREEN);
                        //g.drawLine(x1,y2, x2, y1);
                        
                        //Draw oval centered 
                        //g.setColor(Color.LIGHT_GRAY);
                        //g.fillOval((getWidth()-55)/2,(getHeight()-55)/2,55, 55); 
                        
                        //Draw the arrow 
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                      
                        //Draw first white line
                        Polygon pw= new Polygon();
                        pw.addPoint(0, 34);
                        pw.addPoint(0, 68);
                        pw.addPoint(299,68);
                        pw.addPoint(299,34);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(pw);
                        
                      //Draw second white line
                        Polygon pa= new Polygon();
                        pa.addPoint(0, 102);
                        pa.addPoint(0, 136);
                        pa.addPoint(299,136);
                        pa.addPoint(299,102);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(pa);
                        
                        
                        //Draw triangle
                        Polygon ph= new Polygon();
                        ph.addPoint(0,0);
                        ph.addPoint(x1+150,y1+85);
                        ph.addPoint(0,y1+170);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(ph);
                        
                        //Draw the star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                        //Draw a border
                        g.setColor(Color.BLACK);
                        g.drawRect(x1,y1,299,169);
                               
                        
			}
}


                            