package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import rpg.players.*;

public class Map extends JPanel {
	protected Image bg = null, mini = null;
	protected int minX = -2400, minY = -2592, maxX = 100, maxY = 100;
	public int[] sx,sy,dx,dy,op = new int[maxX*maxY];
	public Map[] gateway;
	public Player[] npc;
	public int x,y;
	public boolean npc_exist = false;
	public Map() {
	}
	public Image minimap() {
		return mini;
	}
	public void paint(Graphics g, JFrame frame) {
		g.drawImage(bg, x, y, frame);
		if(npc_exist) {
			for(int i =0; i < npc.length; i++) {
				npc[i].paint(g,frame);
			}
		}
	}
	public int getminX() {
		return minX;
	}
	public int getminY() {
		return minY;
	}
	public int getmaxX() {
		return maxX;
	}
	public int getmaxY() {
		return maxY;
	}
	public Player search_npc(int x, int y){
		for(int i=0;i<npc.length;i++){
			if(npc[i].getX() == x && npc[i].getY() == y) {
				return npc[i];
			}
		}
		System.out.println("npc not found! error.");
		return (new Player());
	}
}
