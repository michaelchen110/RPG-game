package rpg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import rpg.maps.*;
import rpg.players.*;

public class JVMRpg {
	public static void main(String[] args) {
		MainWindow world = new MainWindow();
		world.setVisible(true);
	}
}

class MainWindow extends JFrame {
	private StartMenu menu;
	private Image background;
	private TalkBoard box;
	private Map all, map;
	private Player p1;
	private int state, pos;
	private boolean mini_map = false, bag = false, menu1 = true, recive = false, init=true, alone=true;
	private Image[] bagimg = new Image[2];
    private MusicPlayer mp4;

	public MainWindow() {
		setTitle("JVMRpg");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		background = getToolkit().getImage("img/enternce.jpg");
		menu = new StartMenu();
		box = new TalkBoard("img/kenny.jpg", "doc/null.txt", this);
		bagimg[0] = getToolkit().getImage("img/uncheckbag.jpg");
		bagimg[1] = getToolkit().getImage("img/checkbag.jpg");
		addKeyListener(new KeyList());
		mp4 = new MusicPlayer("sound/OP.wav");
		mp4.play();
		all = new World();
		map = all;
		state = 1;
		p1 = new Boat(35,12);
		screenAdjust(p1,map);
	}
	private class KeyList extends KeyAdapter {  
		public void keyPressed(KeyEvent k) {
			if(menu1) {
				if (k.getKeyCode() == KeyEvent.VK_ENTER) {
					MusicPlayer mp3 = new MusicPlayer("sound/decide1.wav");
					mp3.play();
					if (menu.chosen() == 0) {
                        mp4.stop();
                        try {
                            Thread.sleep(3000);
                        }
                        catch (Exception e) {}
						box = new TalkBoard("img/kenny.jpg", "doc/talk.txt", MainWindow.this);
						menu1 = false;
					    mp4 = new MusicPlayer("sound/loveyou.wav");
					    mp4.cycle();
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
				repaint();
			}
            else {  
                if (box.isTalking()) {
                    if (k.getKeyCode() == KeyEvent.VK_SPACE) {
                        box.talking();
                        repaint();
                    }
                }
                else {
                    if (k.getKeyCode() == KeyEvent.VK_SPACE){

                        int pX = p1.getX(), pY = p1.getY(), dis = p1.getY()*100+p1.getX(), pF = 2;
                        Player p;
                        if(p1.getX()>0){
                            if(map.op[dis-1] == 6){
                                alone = false;
                                pX = p1.getX()-1;
                                pF = 1;
                            }
                        }
                        if(p1.getX()<99){
                            if(map.op[dis+1] == 6){
                                alone = false;
                                pX = p1.getX()+1;
                                pF = 3;
                            }
                        }
                        if(p1.getY()>0){
                            if(map.op[dis-100] == 6){
                                alone = false;
                                pY = p1.getY()-1;
                                pF = 2;
                            }
                        }
                        if(p1.getY()<99){
                            if(map.op[dis+100] == 6){
                                alone = false;
                                pY = p1.getY()+1;
                                pF = 0;
                            }
                        }
                        System.out.println("Player x = "+ p1.getX() + ", y = " + p1.getY() + ", pX = " + pX + ", pY = "+pY);
                        if(!alone){
                            p = map.search_npc(pX, pY);
                            p.face = pF;
                            box = new TalkBoard(p.img, p.getWord(), MainWindow.this);
                            repaint();
                            System.out.println("new talk");
                        }
                    }
                    else if (k.getKeyCode() == KeyEvent.VK_M){
                        mini_map = !mini_map;
                        repaint();
                    }
                    else if (k.getKeyCode() == KeyEvent.VK_B){
                        bag = !bag;
                        repaint();
                    }
                    else if (k.getKeyCode() == KeyEvent.VK_LEFT){
                        if(init) init = !init;
                        move(3);  
                        p1.face = 3;
                    }  
                    else if (k.getKeyCode() == KeyEvent.VK_RIGHT){
                        if(init) init = !init;
                        move(1);
                        p1.face = 1;
                    }
                    else if (k.getKeyCode() == KeyEvent.VK_UP){
                        if(init) init = !init;
                        move(0);
                        p1.face = 0;
                    }
                    else if (k.getKeyCode() == KeyEvent.VK_DOWN){
                        if(init) init = !init;
                        move(2);
                        p1.face = 2;
                    }
                }
            }  
        }
    }

	private void move(int face) {
		switch(face) {
			case 0:	
				if(p1.getY() > 0) {
					if(walkable(p1,map, p1.getX(), p1.getY() - 1))
						p1.moveUp();
				}
				break;

			case 1:
				if(p1.getX() < map.getmaxX() -1) {
					if(walkable(p1,map, p1.getX() + 1, p1.getY()))
						p1.moveRight();
				}
				break;

			case 2:
				if(p1.getY() < map.getmaxY() -1) {
					if(walkable(p1,map, p1.getX(), p1.getY() + 1))
						p1.moveDown();
				}
				break;

			case 3:
				if(p1.getX() > 0) {
					if(walkable(p1,map, p1.getX() - 1, p1.getY()))
						p1.moveLeft();
				}
				break;

			default: break;
		}
		//Switch map
		if(map.op[p1.getY()*map.getmaxX() + p1.getX()] == 4){
			for(int i = 0; i <map.gateway.length; i++) {
				if(p1.getX() == map.sx[i] && p1.getY() == map.sy[i]) {
					p1.setX(map.dx[i]);
					p1.setY(map.dy[i]);
					map = map.gateway[i];
					try {
						Thread.sleep(500);
					}
					catch (Exception e) {}
				}
			}
		}
		//Update state
		state = map.op[p1.getY()*map.getmaxX() + p1.getX()];
		if(state == 1)
			p1 = new Boat(p1.getX(), p1.getY());
		if(state == 2)
			p1 = new Knight(p1.getX(), p1.getY());
		if(state == 3)
			p1 = new Invi(p1.getX(), p1.getY());

		screenAdjust(p1,map);
		System.out.println("x = " + p1.getX() + ", y = " + p1.getY());
	}
	private boolean walkable(Player p, Map m, int ax, int ay) {
		int st = m.op[ ay * m.getmaxX() + ax];
		System.out.print("op[" + (ay * m.getmaxX() + ax) +"] = "+st+", ");
		if(st == 1 || st == 2 || st == 3 || st == 4 || st == 5)
			return true;
		else
			return false;
	}
	private void screenAdjust(Player p, Map m) {
		if(p.getX() < 12) {
			m.x = 0;
			p.scrx = 32*p.getX();
		}
		else if(p.getX() > (m.getmaxX() - 13)) {
			m.x = m.getminX();
			p.scrx = 32*(p.getX() - 75);
		}
		else {
			m.x = (-32)*(p.getX() - 12);
			p.scrx = 384;
		}

		if(p.getY() < 9) {
			m.y = 22;
			p.scry = 32*p.getY();
		}
		else if(p.getY() > (m.getmaxY() - 10)) {
			m.y = m.getminY();
			p.scry = 32*(p.getY() - 82);
		}
		else {
			m.y = (-32)*(p.getY() - 9);
			p.scry = 256;
		}
		//NPC adjust
		if(m.npc_exist) {
			for(int i =0; i < m.npc.length; i++) {
				int subx = p.getX() - m.npc[i].getX();
				int suby = p.getY() - m.npc[i].getY();
				m.npc[i].scrx = p.scrx - 32*subx;
				m.npc[i].scry = p.scry - 32*suby;
			}
		}
		repaint();
	}
	public void paint(Graphics g) {
		if(menu1) {
			g.drawImage(background, 0, 0, this);
			menu.paintComponent(g,this);
			return;
		}
		else {
			map.paint(g,this);
			p1.paint(g,this);
			if(mini_map) {
				g.drawImage(map.minimap(), 240,140,this);
				g.drawOval(240+32*p1.getX()/10,140+32*p1.getY()/10,8,8);
				g.setColor(Color.RED); 
				g.fillOval(240+32*p1.getX()/10,140+32*p1.getY()/10,8,8);
			}
			if(bag) {
				if(recive)
					g.drawImage(bagimg[1], 160, 120, this);
				else
					g.drawImage(bagimg[0], 160, 120, this);
			}
			if (box.isTalking()){
				box.paintComponent(g);
				System.out.println("print talkboard");
			}
		}
		/*try {
		  Thread.currentThread().sleep(500);
		  }
		  catch(InterruptedException ie) {}*/
	}
}