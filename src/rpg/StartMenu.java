package rpg;
import javax.swing.*;                     
import java.awt.*;                                            
import java.awt.event.*; 

public class StartMenu extends JPanel
{
    Image[] start = new Image[3];
    private int choice;
    private static final int x = 40;
    private static final int y = 380;

    public StartMenu()
    {
        start[0] = getToolkit().getImage("img/NEWGAME.jpg");
        start[1] = getToolkit().getImage("img/CONTINUE.jpg");
        start[2] = getToolkit().getImage("img/EXIT.jpg");
        choice = 0;
    }
    
    public void paintComponent(Graphics g, JFrame frame)
    {
        super.paintComponent(g);
        g.drawImage(start[choice], x, y, frame);
    }

    public void choose(int c)
    {
        choice = c;
    }

    public int chosen()
    {
        return choice;
    }
}