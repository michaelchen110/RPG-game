package rpg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.io.*;
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
	private Image black;
	private TalkBoard box;
	private Map all, map;
	private Player p1;
	private int state, pos, atMap;
	private boolean mini_map = false, bag = false, menu1 = true, init=true, alone=true, isStart = true;
	private Image[] bagimg = new Image[2];
	private MusicPlayer mp4;
	private File file;
	private Starting start;
	private Image big;
	private Image kite;
	private Image fuck;
	private int scene2;

	public MainWindow() {
		setTitle("JVMRpg");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		background = getToolkit().getImage("img/enternce.jpg");
		black = getToolkit().getImage("img/black.jpg");
		big = getToolkit().getImage("img/big.jpg");
		kite = getToolkit().getImage("img/kite.jpg");
		fuck = getToolkit().getImage("img/fuck.jpg");
		menu = new StartMenu();
		box = new TalkBoard("img/kenny.jpg", "npc/kenny.txt", this);
		bagimg[0] = getToolkit().getImage("img/uncheckbag.jpg");
		bagimg[1] = getToolkit().getImage("img/checkbag.jpg");
		addKeyListener(new KeyList());
		mp4 = new MusicPlayer("sound/OP.wav");
		mp4.play();
		all = new World();
		map = all;
		state = 1;
		scene2 = 0;
		p1 = new Boat();
		screenAdjust(p1,map);
		file = new File("record");
		atMap = 20;
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
						menu1 = false;
						isStart = true;
						start = new Starting();
						add(start);
						Thread thread = new Thread(new Runnable(){
								public void run(){
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
								Thread.sleep(3500);
								start.next();
								repaint();

								Thread.sleep(3000);
								start.next();
								repaint();

								scene2 = 1;
								Thread.sleep(3000);
								start.next();
								repaint();
								Thread.sleep(3000);
								start.next();
								repaint();

								scene2 = 2;
								Thread.sleep(3000);
								start.next();
								repaint();

								scene2 = 3;
								Thread.sleep(3000);
								start.next();
								repaint();

								scene2 = 0;
								Thread.sleep(3000);
								start.next();
								repaint();
								MusicPlayer roar = new MusicPlayer("sound/roar.wav");
								roar.play();
								Thread.sleep(3000);
								start.next();
								repaint();

								isStart = false;
								repaint();
								box = new TalkBoard("img/kenny.jpg", "npc/kenny.txt", MainWindow.this);
								mp4 = new MusicPlayer("sound/loveyou.wav");
								mp4.cycle();
								}
								catch (Exception e) {}
								}
						});
						thread.start();

					}
					else if (menu.chosen() == 1) {
						mp4.stop();
						try {
							Thread.sleep(3000);
						}
						catch (Exception e) {}
						menu1 = false;
						Thread thread = new Thread(new Runnable(){
								public void run(){
								int i, j;
								try {
									box = new TalkBoard("img/kenny.jpg", "npc/null.txt", MainWindow.this);
									RandomAccessFile raFile = new RandomAccessFile(file, "rw");
									isStart = false;
									mp4 = new MusicPlayer("sound/loveyou.wav");
									mp4.cycle();
									raFile.seek(0);
									for(i=0;i<19;i++){
										j = (int)raFile.readChar() - 48;
										if(j==1) p1.state[i] = true;;
									}
									p1.setX(raFile.readInt());
									p1.setY(raFile.readInt());
									atMap = raFile.readInt();
									if(atMap == 20);
									else if(atMap==19) map = map.gateway[0];
									else map = map.gateway[0].gateway[atMap];
									raFile.close();
									repaint();
									repaint();
								}
								catch (Exception e) {}
								}
						});
						thread.start();
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
							//System.out.println("new talk");
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
					else if (k.getKeyCode() == KeyEvent.VK_F){
						p1.state[14] = true;
						p1.state[17] = true;
					}
					else if (k.getKeyCode() == KeyEvent.VK_S){
						int i, j;
						try{
							RandomAccessFile raFile = new RandomAccessFile(file, "rw");
							raFile.seek(0);
							for(i=0;i<19;i++){
								j=0;
								if(p1.state[i]) j=1;
								raFile.writeChar((char)(j + 48));
							}
							raFile.writeInt(p1.getX());
							raFile.writeInt(p1.getY());
							raFile.writeInt(atMap);
							raFile.close();
						} catch(IOException ie){
							System.out.print(ie);
						}
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
		if((map.op[p1.getY()*map.getmaxX() + p1.getX()] == 4)||(map.op[p1.getY()*map.getmaxX() + p1.getX()] == 5)) {
			for(int i = 0; i <map.gateway.length; i++) {
				if(p1.getX() == map.sx[i] && p1.getY() == map.sy[i]) {
					p1.setX(map.dx[i]);
					p1.setY(map.dy[i]);
					map = map.gateway[i];
					if(atMap!=20) atMap = i;
					else atMap = 19;
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
		else if(isStart) {
			if (scene2 == 0) {
				System.out.println("is start");
				g.drawImage(black, 0, 0, this);
				g.setColor(Color.WHITE);
				start.paint(g);
			}
			else if (scene2 == 1) {
				MusicPlayer fight1 = new MusicPlayer("sound/fight1.wav");
				fight1.play();
				//MusicPlayer fight2 = new MusicPlayer("sound/fight2.wav");
				//fight2.play();
				g.drawImage(big, 0, 0, this);
				g.setColor(Color.WHITE);
				start.paint(g);

			}
			else if (scene2 == 2) {
				MusicPlayer fight3 = new MusicPlayer("sound/fight3.wav");
				fight3.play();
				g.drawImage(kite, 0, 0, this);
				g.setColor(Color.WHITE);
				start.paint(g);

			}
			else if (scene2 == 3) {
				MusicPlayer shit = new MusicPlayer("sound/fuck.wav");
				shit.play();
				g.drawImage(black, 0, 0, this);
				g.drawImage(fuck, 0, 0, this);
				g.setColor(Color.WHITE);
				start.paint(g);
			}
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
				if(p1.state[18])
					g.drawImage(bagimg[1], 160, 120, this);
				else
					g.drawImage(bagimg[0], 160, 120, this);
			}
			if (box.isTalking()){
				box.paintComponent(g);
				//System.out.println("print talkboard");
			}
		}
		/*try {
		  Thread.currentThread().sleep(500);
		  }
		  catch(InterruptedException ie) {}*/
	}
}
