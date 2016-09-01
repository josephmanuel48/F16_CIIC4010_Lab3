import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
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
                        g.setColor(Color.DARK_GRAY);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                        //Draw a border
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1,y1,width,height);
                        
                        //Draw inside border
                        g.setColor(Color.red);
                        g.drawRect(x1+1,y1+1,width-2,height-2);
                        
                        //Draw line from top-left to bottom-right 
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        
                        //Draw line from top-right to bottom-left 
                        g.setColor(Color.GREEN);
                        g.drawLine(x1,y2, x2, y1);
                        
                        //Draw oval centered 
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval((getWidth()-55)/2,(getHeight()-55)/2,55, 55);    
                                                    
            }
}