import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Player extends JPanel {
	protected Image[] u = new Image[3];
	protected Image[] d = new Image[3];
	protected Image[] l = new Image[3];
	protected Image[] r = new Image[3];
	protected int x,y,i = 0;
	public int scrx,scry;

	public void paint(Graphics g, JFrame frame, int face) {
		if(i==3)
			i = 0;
		switch(face) {
			case 0: g.drawImage(u[i++], scrx, scry+24 , frame); break;
			case 1: g.drawImage(r[i++], scrx, scry+24 , frame); break;
			case 2: g.drawImage(d[i++], scrx, scry+24 , frame); break;
			case 3: g.drawImage(l[i++], scrx, scry+24 , frame); break;
			default:g.drawImage(d[i++], scrx, scry+24 , frame); break;
		}
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int a) {
		x = a;
	}
	public void setY(int b) {
		y = b;
	}
	public void moveLeft() {
		x--;
	}
	public void moveRight() {
		x++;
	}
	public void moveUp() {
		y--;
	}
	public void moveDown() {
		y++;	
	}
}