import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class JVMRpg {
	public static void main(String[] args) {
		MainWindow world = new MainWindow();
		world.setVisible(true);
	}
}

class MainWindow extends JFrame {
	private Map all, map;
	private Player p1;
	private int face = 2;
	private boolean mini_map = false;
	public MainWindow() {
		setTitle("JVMRpg");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addKeyListener(new KeyList());
		all = new World();
		map = all;
		p1 = new Boat();
		screenAdjust(p1,map);
	}
	private class KeyList extends KeyAdapter {  
		public void keyPressed(KeyEvent k) {  
			if (k.getKeyCode() == KeyEvent.VK_M){
				mini_map = !mini_map;
				repaint();
			}
			if (k.getKeyCode() == KeyEvent.VK_LEFT){
				move(3);  
				face = 3;
			}  
			if (k.getKeyCode() == KeyEvent.VK_RIGHT){
				move(1);
				face = 1;
			}
			if (k.getKeyCode() == KeyEvent.VK_UP){
				move(0);
				face = 0;
			}
			if (k.getKeyCode() == KeyEvent.VK_DOWN){
				move(2);
				face = 2;
			}
			//mypaint(getGraphics());
		}  
	}
	private void move(int face) {
		switch(face) {
			case 0:	
				if(p1.getY() > 0)
					p1.moveUp();
			break;
			
			case 1: 
				if(p1.getX() < 99)
					p1.moveRight();
			break;
			
			case 2:
				if(p1.getY() < 99)
					p1.moveDown();	
			break;

			case 3:
				if(p1.getX() > 0)
					p1.moveLeft();
			break;

			default: break;
		}
		for(int i = 0; i <map.gateway.length; i++) {
			if(p1.getX() == sx[i] && p1.getY() == sy[i]) {
				p1.setX(dx[i]);
				p1.setY(dy[i]);
				map = gateway[i];
			}
		}
		screenAdjust(p1,map);
		System.out.println("x = " + p1.getX() + ", y = " + p1.getY());
	}
	private void screenAdjust(Player p, Map m) {
		if(p.getX() < 12) {
			m.x = 0;
			p.scrx = 32*p.getX();
		}
		else if(p.getX() > (m.getmaxX() - 13)) {
			m.x = -2400;
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
			m.y = -2595;
			p.scry = 32*(p.getY() - 82);
		}
		else {
			m.y = (-32)*(p.getY() - 9);
			p.scry = 256;
		}
		repaint();
	}
	public void paint(Graphics g) {
		map.paint(g,this);
		p1.paint(g,this,face);
		if(mini_map) {
			g.drawImage(map.minimap(), 240,140,this);
			g.drawOval(240+32*p1.getX()/10,140+32*p1.getY()/10,8,8);
			g.setColor(Color.RED); 
			g.fillOval(240+32*p1.getX()/10,140+32*p1.getY()/10,8,8);
		}
		/*try {
			Thread.currentThread().sleep(500);
		}
		catch(InterruptedException ie) {}*/
	}
}

