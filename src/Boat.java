import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Boat extends Player {
	public Boat (){
		u[0] = getToolkit().getImage("img/boat/u1.png");
		u[1] = getToolkit().getImage("img/boat/u2.png");
		u[2] = getToolkit().getImage("img/boat/u3.png");
		d[0] = getToolkit().getImage("img/boat/d1.png");
		d[1] = getToolkit().getImage("img/boat/d2.png");
		d[2] = getToolkit().getImage("img/boat/d3.png");
		l[0] = getToolkit().getImage("img/boat/l1.png");
		l[1] = getToolkit().getImage("img/boat/l2.png");
		l[2] = getToolkit().getImage("img/boat/l3.png");
		r[0] = getToolkit().getImage("img/boat/r1.png");
		r[1] = getToolkit().getImage("img/boat/r2.png");
		r[2] = getToolkit().getImage("img/boat/r3.png");
		x = 50;
		y = 50;
	}
}