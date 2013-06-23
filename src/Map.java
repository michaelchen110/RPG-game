import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Map extends JPanel {
	protected Image bg = null, mini = null;
	protected int minX, minY, maxX, maxY;
	protected int[] sx,sy,dx,dy;
	protected Map[] gateway;
	public int x,y;
	public Map() {

	}
	public Image minimap() {
		return mini;
	}
	public Map go(int num) {
		return gateway[num];
	}
	public void paint(Graphics g, JFrame frame) {
		g.drawImage(bg, x, y, frame);
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
}