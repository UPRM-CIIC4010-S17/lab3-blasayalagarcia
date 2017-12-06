import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
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
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width+1, height+1);
                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
                        
//                        g.setColor(Color.GREEN);
//                        g.drawRect(x1+20, y1+20, width -40, height -40);
//                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.PINK);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.drawOval(x1, y1, width, height);
                        
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.drawPolygon(p);
                        
                     
                        g.setColor(Color.WHITE);
                        g.fillRect(0, this.getHeight()/5, this.getWidth(), ((this.getHeight())/5));
                        
                    
                        g.setColor(Color.WHITE);
                        g.fillRect(0, (3*this.getHeight()/5), this.getWidth(), (this.getHeight()/5));
                        
//                        g.setColor(Color.WHITE);
//                        g.drawRect(x1, y1, width, height);
//                        
                        
//                        
//                        Polygon line1 = new Polygon();
//                        line1.addPoint(0, (y2*(2/5)));
//                        line1.addPoint(x2, y2/5);
//                        line1.addPoint(x2, y2*(2/5));
//                        line1.addPoint(0, y2*(2/5));
//                        g.setColor(Color.WHITE);
//                        g.fillPolygon(line1);
//                        g.drawPolygon(line1);
                        
                        
                        
                        Polygon p3 = new Polygon();
                        p3.addPoint( 0, 0);
                        p3.addPoint(x2/2, y2/2);
                        p3.addPoint(0, y2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        g.drawPolygon(p3);
                        

                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(this.getWidth()/12, 11*this.getHeight()/24);
                        p2.addPoint(11*this.getWidth()/78, 11*this.getHeight()/24);
                        p2.addPoint(this.getWidth()/6, 8*this.getHeight()/24);
                        p2.addPoint(14*this.getWidth()/72, 11*this.getHeight()/24);
                        p2.addPoint(18*this.getWidth()/72, 11*this.getHeight()/24);
                        p2.addPoint(15*this.getWidth()/72, 13*this.getHeight()/24);
                        p2.addPoint(16*this.getWidth()/72,  16*this.getHeight()/24);
                        p2.addPoint(this.getWidth()/6, 14*this.getHeight()/24);
                        p2.addPoint(8*this.getWidth()/72,  16*this.getHeight()/24);
                        p2.addPoint(10*this.getWidth()/80, 13*this.getHeight()/24);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        g.drawPolygon(p2);
                        
                       // Polygon p2 = new Polygon();
//                      p2.addPoint(x1 + 25, y1 + 73);
//                      p2.addPoint(x1 + 41, y1 + 73);
//                      p2.addPoint(x1 + 47, y1 + 58);
//                      p2.addPoint(x1 + 53, y1 + 73);
//                      p2.addPoint(x1 + 69, y1 + 73);
//                      p2.addPoint(x1 + 56, y1 + 83);
//                      p2.addPoint(x1 + 61, y1 + 98);
//                      p2.addPoint(x1 + 47, y1 + 88);
//                      p2.addPoint(x1 + 34, y1 + 98);
//                      p2.addPoint(x1 + 38, y1 + 83);
//                      g.setColor(Color.WHITE);
//                      g.fillPolygon(p2);
//                      g.drawPolygon(p2);
                        
                        
            }
}