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
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public GameStart()
    {
        super("JVMRPG");
        setTitle("Window");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        background = getToolkit().getImage("../img/background1.jpg");
        menu = new StartMenu();

        addKeyListener(new KeyAdapter()	{
            public void keyPressed(KeyEvent k) 
            {
			    if (k.getKeyCode() == KeyEvent.VK_ENTER) {
                    MusicPlayer mp3 = new MusicPlayer("decide1.wav");
                    mp3.play();
                    if (menu.chosen() == 0) {       //new game
                         
                    }
                    else if (menu.chosen() == 1) {  //continue
                        
                    }
                    else if (menu.chosen() == 2) { //exit
                        try {
                            Thread.sleep(1000);
                            System.exit(0);
                        }
                        catch (Exception e) {}
                    }
                }
                else if (k.getKeyCode() == KeyEvent.VK_UP) {  
                    MusicPlayer mp3 = new MusicPlayer("SE.wav");
                    mp3.play();
			        if (menu.chosen() == 1) 
                        menu.choose(0);
			        else if (menu.chosen() == 2) 
                        menu.choose(1);
                }
                else if (k.getKeyCode() == KeyEvent.VK_DOWN) {  
                    MusicPlayer mp3 = new MusicPlayer("SE.wav");
                    mp3.play();
			        if (menu.chosen() == 0) 
                        menu.choose(1);
			        else if (menu.chosen() == 1) 
                        menu.choose(2);
                    
                }
			    repaint();
		    }
        });

        MusicPlayer mp4 = new MusicPlayer("loveyou.wav");
        mp4.cycle();

    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(background, -50, 0, this);
        menu.paintComponent(g,this);
    }
}

class StartMenu extends JPanel
{
    Image[] start = new Image[3];
    private int choice;
    private static final int x = 110;
    private static final int y = 380;

    public StartMenu()
    {
        start[0] = getToolkit().getImage("../img/NEWGAME.jpg");
        start[1] = getToolkit().getImage("../img/CONTINUE.jpg");
        start[2] = getToolkit().getImage("../img/EXIT.jpg");
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
