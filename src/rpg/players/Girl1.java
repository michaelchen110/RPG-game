package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Girl1 extends Player {
	public Girl1(int a, int b) {
		u[0] = getToolkit().getImage("img/girl1/u1.png");
		u[1] = getToolkit().getImage("img/girl1/u2.png");
		u[2] = getToolkit().getImage("img/girl1/u3.png");
		d[0] = getToolkit().getImage("img/girl1/d1.png");
		d[1] = getToolkit().getImage("img/girl1/d2.png");
		d[2] = getToolkit().getImage("img/girl1/d3.png");
		l[0] = getToolkit().getImage("img/girl1/l1.png");
		l[1] = getToolkit().getImage("img/girl1/l2.png");
		l[2] = getToolkit().getImage("img/girl1/l3.png");
		r[0] = getToolkit().getImage("img/girl1/r1.png");
		r[1] = getToolkit().getImage("img/girl1/r2.png");
		r[2] = getToolkit().getImage("img/girl1/r3.png");
		x = a;
		y = b;
	}
}