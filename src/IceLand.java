import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IceLand extends Map {
	public IceLand(Map src) {
        bg = getToolkit().getImage("img/map/iceland.png");
        mini = getToolkit().getImage("img/map/mini_iceland.jpg");
        minX = -2400;
        minY = -2568;
        gateway = new Map[11];
        nx = new int[11];
        ny = new int[11];
        gateway[0] = src;
        nx[0] = 35; ny[0] = 12;
	}
}