import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class MapEditor {
	public static void main(String[] args) {
		Editor world = new Editor("MapEditor");
		world.run();
	}
}

class Editor extends JFrame {
	int[] set, i;
	Image d;
	String name;
	BufferedReader br;
	FileWriter fw;
	private Map map;
	public Editor(String title) throws Exception {
		setTitle(title);
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		set = new int[10000];
		br = new BufferedReader(new InputStreamReader(System.in));
		i = 0;
		d = getToolkit().getImage("img/knight/d1.png");
	}
	public void run() {
		System.out.print("Input your file name: ");
		name = br.readLine();
		fw = new FileWriter(name);
	}
	private class KeyList extends KeyAdapter {  
		public void keyPressed(KeyEvent k) {  
			if (k.getKeyCode() == KeyEvent.VK_0){
				set[i++] = 0;
			}  
			if (k.getKeyCode() == KeyEvent.VK_1){
				set[i++] = 1;
			}
			if (k.getKeyCode() == KeyEvent.VK_2){
				set[i++] = 2;
			}
			if (k.getKeyCode() == KeyEvent.VK_3){
				set[i++] = 3;
			}
			map.moveLeft();
			repaint();
		}  
	}
	public void paint(Graphics g) {
		map.paint(g,this);
		if()
			g.drawImage(d, 0,0,this);
	}
}