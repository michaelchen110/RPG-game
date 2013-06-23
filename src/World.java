import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class World extends Map {
	public World() {
        bg = getToolkit().getImage("img/map/world.png");
        mini = getToolkit().getImage("img/map/mini_world.jpg");
        minX = -2400;
        minY = -2568;
        maxX = 100;
        maxY = 100;
        gateway = new Map[6];
        sx = new int[6]; sy = new int[6]; dx = new int[6]; dy = new int[6];
        gateway[0] = new IceLand(this);
        sx[0] = 35; sy[0] = 11; dx[0] = 81; dy[0] = 94;
	}
}