package rpg;
import javax.swing.*;                     
import java.awt.*;                                            
import java.awt.event.*;  

public class Main 
{
    public static void main(String[] args)
    {
        GameStart start = new GameStart();
        start.setVisible(true);
    }
}

class GameStart extends JFrame
{
    private StartMenu menu;
    private Image background;
    private TalkBoard box;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public GameStart()
    {
        super("JVMRPG");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        background = getToolkit().getImage("img/background1.jpg");
        menu = new StartMenu();
        box = new TalkBoard("img/shooter.jpg", "doc/null.txt", this);
        while (box.isTalking())
            box.talking();

        addKeyListener(new KeyAdapter()	{
            public void keyPressed(KeyEvent k) 
            {
                if (box.isTalking()) {
                    if (k.getKeyCode() == KeyEvent.VK_SPACE) {
                        box.talking();
                    }
                }
                else {
			        if (k.getKeyCode() == KeyEvent.VK_ENTER) {
                        MusicPlayer mp3 = new MusicPlayer("sound/decide1.wav");
                        mp3.play();
                        if (menu.chosen() == 0) {
                            box = new TalkBoard("img/shooter.jpg", "doc/talk.txt", GameStart.this);
                            add(box);
                        }
                        else if (menu.chosen() == 1) {
                        
                        }
                        else if (menu.chosen() == 2) {
                            try {
                                Thread.sleep(1000);
                                System.exit(0);
                            }
                            catch (Exception e) {}
                        }
                    }
                    else if (k.getKeyCode() == KeyEvent.VK_UP) {  
                        MusicPlayer mp3 = new MusicPlayer("sound/SE.wav");
                        mp3.play();
			            if (menu.chosen() == 1) 
                            menu.choose(0);
    			        else if (menu.chosen() == 2) 
                            menu.choose(1);
                    }
                    else if (k.getKeyCode() == KeyEvent.VK_DOWN) {  
                        MusicPlayer mp3 = new MusicPlayer("sound/SE.wav");
                        mp3.play();
    			        if (menu.chosen() == 0) 
                            menu.choose(1);
		    	        else if (menu.chosen() == 1) 
                            menu.choose(2);
                    }
                }
			    repaint();
		    }
        });

        MusicPlayer mp4 = new MusicPlayer("sound/memory.wav");
        mp4.cycle();

    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(background, -50, 0, this);
        menu.paintComponent(g,this);
        if (box.isTalking())
            box.paintComponent(g);

    }
}
