import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TalkBoard extends JPanel
{
    private static final int x = 110;
    private static final int y = 280;

    int line;
    Image character;
    Image box;
    String[] text = new String[30];

    public TalkBoard(String name, String filename)
    {   
        line = 0;
        box = getToolkit().getImage("img/talkboard.jpg");
        character = getToolkit().getImage(name);
        text = Chinese.getText(filename);

    }

    public void changeLine()
    {
        if (text[line] != null) { 
            MusicPlayer decide = new MusicPlayer("sound/decide.wav");
            decide.play();
            line = line + 2;
        }
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (text[line] != null) {
            g.setFont(new Font("標楷體", Font.BOLD, 22));
            g.setColor(Color.BLACK);
            g.drawImage(box, x, y, this);
            g.drawImage(character, x, y, this);

            g.drawString(text[line], x + 150, y + 200);
            if (text[line + 1] != null)
                g.drawString(text[line + 1], x + 150, y + 230);
        }
    }
}
