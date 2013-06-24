package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Knight extends Player {
	public Knight (){
		u[0] = getToolkit().getImage("img/knight/u1.png");
		u[1] = getToolkit().getImage("img/knight/u2.png");
		u[2] = getToolkit().getImage("img/knight/u3.png");
		d[0] = getToolkit().getImage("img/knight/d1.png");
		d[1] = getToolkit().getImage("img/knight/d2.png");
		d[2] = getToolkit().getImage("img/knight/d3.png");
		l[0] = getToolkit().getImage("img/knight/l1.png");
		l[1] = getToolkit().getImage("img/knight/l2.png");
		l[2] = getToolkit().getImage("img/knight/l3.png");
		r[0] = getToolkit().getImage("img/knight/r1.png");
		r[1] = getToolkit().getImage("img/knight/r2.png");
		r[2] = getToolkit().getImage("img/knight/r3.png");
		x = 54;
		y = 36;
	}
	public Knight (int a, int b) {
		u[0] = getToolkit().getImage("img/knight/u1.png");
		u[1] = getToolkit().getImage("img/knight/u2.png");
		u[2] = getToolkit().getImage("img/knight/u3.png");
		d[0] = getToolkit().getImage("img/knight/d1.png");
		d[1] = getToolkit().getImage("img/knight/d2.png");
		d[2] = getToolkit().getImage("img/knight/d3.png");
		l[0] = getToolkit().getImage("img/knight/l1.png");
		l[1] = getToolkit().getImage("img/knight/l2.png");
		l[2] = getToolkit().getImage("img/knight/l3.png");
		r[0] = getToolkit().getImage("img/knight/r1.png");
		r[1] = getToolkit().getImage("img/knight/r2.png");
		r[2] = getToolkit().getImage("img/knight/r3.png");
		x = a;
		y = b;
	}
}