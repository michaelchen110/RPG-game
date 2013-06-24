package rpg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TalkBoard extends JPanel
{
    private JFrame frame; 
    private static final int x = 0;
    private static final int y = 430;

    private int line;
    private Image character;
    private Image box;
    private String[] text = new String[30];

    public TalkBoard(String name, String filename, JFrame f)
    {   
        line = 0;
        box = getToolkit().getImage("img/woods.jpg");
        character = getToolkit().getImage(name);
        text = Chinese.getText(filename);
        frame = f;
    }

    public boolean isTalking()
    {
        if (text[line] == null) 
            return false;
        else
            return true;
    }

    public void talking()
    {
        if (isTalking()) { 
            MusicPlayer decide = new MusicPlayer("sound/decide.wav");
            decide.play();
            line = line + 2;
        }
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (text[line] != null) {
            g.setFont(new Font("標楷體", Font.BOLD, 32));
            g.setColor(Color.BLACK);
            g.drawImage(box, x, y, frame);
            g.drawImage(character, x + 620, y+5 , frame);

            g.drawString(text[line], x + 150, y + 70);
            if (text[line + 1] != null)
                g.drawString(text[line + 1], x + 150, y + 120);
        }
    }
}
