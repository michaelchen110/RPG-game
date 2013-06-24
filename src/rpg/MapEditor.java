package rpg;
import rpg.maps.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import rpg.players.*;
import rpg.maps.*;

public class MapEditor {
	public static void main(String[] args) throws Exception {
		String filename;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Input your file name: ");
		filename = scan.nextLine();
		Editor ed = new Editor("MapEditor", filename, 100, 100);
		ed.setVisible(true);
	}
}

class Editor extends JFrame {
	int[] set;
	int face;
	private Player p1;
	private Map map;
	File file;
	int h, w;
	public Editor(String title, String filename, int m, int n) throws Exception {
		setTitle(title);
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addKeyListener(new KeyList());
		map = new iwell0506(null);
		p1 = new Knight(0,0);
		screenAdjust(p1,map);
		set = new int[m*n];
		file = new File(filename);
		h=m;
		w=n;
	}
	private class KeyList extends KeyAdapter {  
		public void keyPressed(KeyEvent k) {
			System.out.println("i = " + (p1.getY()*w + p1.getX()));
			if (k.getKeyCode() == KeyEvent.VK_W){
				try{
					RandomAccessFile raFile = new RandomAccessFile(file, "rw");
					raFile.seek(0);
					for(int i=0;i<w*h;i++){
						raFile.writeChar((char)(set[i]+48));
					}
					raFile.close();
				} catch(IOException ie){
					System.out.print(ie);
				}
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
			if (k.getKeyCode() == KeyEvent.VK_0){
				set[p1.getY()*w + p1.getX()]=0;
				if(p1.getX() < w-1)
					move(1);
				else if(p1.getY() < h-1) {
					move(2);
					for(int i = 0; i < w; i++) {
						move(3);
					}
				}
			}  
			else if (k.getKeyCode() == KeyEvent.VK_1){
				set[p1.getY()*w + p1.getX()]=1;
				if(p1.getX() < w-1)
					move(1);
				else if(p1.getY() < h-1) {
					move(2);
					for(int i = 0; i < w; i++) {
						move(3);
					}
				}
			}
			else if (k.getKeyCode() == KeyEvent.VK_2){
				set[p1.getY()*w + p1.getX()]=2;
				if(p1.getX() < w-1)
					move(1);
				else if(p1.getY() < h-1) {
					move(2);
					for(int i = 0; i < w; i++) {
						move(3);
					}
				}
			}
			else if (k.getKeyCode() == KeyEvent.VK_3){
				set[p1.getY()*w + p1.getX()]=3;
				if(p1.getX() < w-1)
					move(1);
				else if(p1.getY() < h-1) {
					move(2);
					for(int i = 0; i < w; i++) {
						move(3);
					}
				}
			}
			else if (k.getKeyCode() == KeyEvent.VK_4){
				set[p1.getY()*w + p1.getX()]=4;
				if(p1.getX() < w-1)
					move(1);
				else if(p1.getY() < h-1) {
					move(2);
					for(int i = 0; i < w; i++) {
						move(3);
					}
				}
			}
			else if (k.getKeyCode() == KeyEvent.VK_5){
				set[p1.getY()*w + p1.getX()]=5;
				if(p1.getX() < w-1)
					move(1);
				else if(p1.getY() < h-1) {
					move(2);
					for(int i = 0; i < w; i++) {
						move(3);
					}
				}
			}
			else if (k.getKeyCode() == KeyEvent.VK_6){
				set[p1.getY()*w + p1.getX()]=6;
				if(p1.getX() < w-1)
					move(1);
				else if(p1.getY() < h-1) {
					move(2);
					for(int i = 0; i < w; i++) {
						move(3);
					}
				}
			}
			else if (k.getKeyCode() == KeyEvent.VK_7){
				set[p1.getY()*w + p1.getX()]=7;
				if(p1.getX() < w-1)
					move(1);
				else if(p1.getY() < h-1) {
					move(2);
					for(int i = 0; i < w; i++) {
						move(3);
					}
				}
			}
			else if (k.getKeyCode() == KeyEvent.VK_8){
				set[p1.getY()*w + p1.getX()]=8;
				if(p1.getX() < w-1)
					move(1);
				else if(p1.getY() < h-1) {
					move(2);
					for(int i = 0; i < w; i++) {
						move(3);
					}
				}
			}
			else if (k.getKeyCode() == KeyEvent.VK_9){
				set[p1.getY()*w + p1.getX()]=9;
				if(p1.getX() < w-1)
					move(1);
				else if(p1.getY() < h-1) {
					move(2);
					for(int i = 0; i < w; i++) {
						move(3);
					}
				}
			}
			if (k.getKeyCode() == KeyEvent.VK_S){
				for(int i =0; i < p1.getY()*w + p1.getX() +1; i++) {
					if(i%w == 0)
						System.out.println();
					System.out.print(set[i]);
				}
			}
			repaint();
		}  
	}
	private void move(int face) {
		switch(face) {
			case 0:	
				if(p1.getY() > 0)
					p1.moveUp();
				break;

			case 1: 
				if(p1.getX() < w-1)
					p1.moveRight();
				break;

			case 2:
				if(p1.getY() < h-1)
					p1.moveDown();	
				break;

			case 3:
				if(p1.getX() > 0)
					p1.moveLeft();
				break;

			default: break;
		}
		screenAdjust(p1,map);
		System.out.println("x = " + p1.getX() + ", y = " + p1.getY());
	}
	private void screenAdjust(Player p, Map m) {
		if(p.getX() < 12) {
			m.x = 0;
			p.scrx = 32*p.getX();
		}
		else if(p.getX() > 87) {
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
		else if(p.getY() > 90) {
			m.y = -2595;
			p.scry = 32*(p.getY() - 82);
		}
		else {
			m.y = (-32)*(p.getY() - 9);
			p.scry = 256;
		}
	}
	public void paint(Graphics g) {
		map.paint(g,this);
		p1.paint(g,this,face);
	}
}
