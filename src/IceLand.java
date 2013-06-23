import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IceLand extends Map {
	public IceLand(Map src) {
        bg = getToolkit().getImage("img/map/iceland.png");
        mini = getToolkit().getImage("img/map/mini_iceland.jpg");
        minX = -2400;
        minY = -2568;
        maxX = 100;
        maxY = 100;
        gateway = new Map[11];
        sx = new int[11]; sy = new int[11]; dx = new int[11]; dy = new int[11];
        gateway[0] = src;
        sx[0] = 81; sy[0] = 95; dx[0] = 35; dy[0] = 12;
	}
}