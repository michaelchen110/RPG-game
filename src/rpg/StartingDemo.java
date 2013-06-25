package rpg;
import javax.swing.*;                     
import java.awt.*;                                            
import java.awt.event.*;  

public class StartingDemo
{
    public static void main(String[] args)
    {
        StartFrame frame = new StartFrame();
        frame.setVisible(true);
    }
}

class StartFrame extends JFrame
{
    Starting start;
    public StartFrame()
    {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        start = new Starting();
        add(start);

        Thread thread = new Thread (new Runnable(){
            public void run()
            {
                    try {
                        Thread.sleep(5500);
                        start.next();
                        repaint();
                        Thread.sleep(3000);
                        start.next();
                        repaint();
                        
                        Thread.sleep(5000);
                        start.next();
                        repaint();
                        Thread.sleep(3000);
                        start.next();
                        repaint();
                        
                        Thread.sleep(1700);
                        start.next();
                        repaint();

                        Thread.sleep(2500);
                        start.next();
                        repaint();
                        Thread.sleep(1500);
                        start.next();
                        repaint();

                        Thread.sleep(6000);
                        start.next();
                        repaint();
                        Thread.sleep(2000);
                        start.next();
                        repaint();
                    
                        Thread.sleep(1000);
                        start.next();
                        repaint();
                        Thread.sleep(6000);
                        start.next();
                        repaint();
                    }
                    catch (Exception e) {}
            }
        
        });
        thread.start();

    }
    

    public void paint(Graphics g)
    {
        //super.paint(g);
        System.out.println("Frame paint");
        start.paint(g, this);
    }
}
