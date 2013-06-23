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
        gateway = new Map[6]; 				nx = new int[6]; 	ny = new int[6];
        gateway[0] = new IceLand(this); 	nx[0] = 81; 		ny[0] = 94;

	}
}