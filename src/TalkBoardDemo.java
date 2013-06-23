import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TalkBoardDemo 
{
    public static void main(String[] argv)
    {
        Window window = new Window();
        window.setVisible(true);
    }
}

class Window extends JFrame
{
    TalkBoard box;

    public Window()
    {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        box = new TalkBoard("img/shooter.jpg", "doc/talk.txt");
        add(box);
    
        addKeyListener(new KeyAdapter()	{
            public void keyPressed(KeyEvent k) 
            {
			    if (k.getKeyCode() == KeyEvent.VK_ENTER) {
                    box.changeLine();
                }
            }
        });

        Thread thread = new Thread(new Runnable(){
            public void run()
            {
                while(true) {
                    try{
                        Thread.sleep(100);
                        repaint();
                    }
                    catch (Exception e) {}
                }
            }
        });
        thread.start();
        
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        box.paintComponent(g);
    }
}
