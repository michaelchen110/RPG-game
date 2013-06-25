package rpg;
import javax.swing.*;                     
import java.awt.*;                                            
import java.awt.event.*;  

public class Starting extends JPanel
{
    private int scene;
    private int line1, line2, line3;
    private String[] text1 = new String[30];
    private String[] text2 = new String[30];

    public Starting()
    {
        line1 = 0;
        line2 = 0;
        scene = 1;
        text1 = Chinese.getText("doc/scene1.txt");
        text2 = Chinese.getText("doc/scene2.txt");
        MusicPlayer mp3 = new MusicPlayer("sound/starting.wav");
        mp3.play();
    }

    public void next()
    {
        if (text1[line1+1] != null) {
            line1++;
        }
        else if (text2[line2+1] != null) {
            scene = 2;
            line2++;
        }
    }

    public void paint(Graphics g)
    {
        System.out.println("Panel paint");
        if (scene == 1) {
            g.setFont(new Font("標楷體", Font.BOLD, 32));

            g.drawString(text1[line1], 50, 120);
        }
        else if (scene == 2) {
            g.setFont(new Font("標楷體", Font.BOLD, 32));
            g.drawString(text2[line2], 100, 400);

        }
    }
}
