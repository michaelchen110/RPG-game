package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CM extends Player {
	public CM(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/chenmeng/u.png");
		u[1] = getToolkit().getImage("img/npc/chenmeng/u.png");
		u[2] = getToolkit().getImage("img/npc/chenmeng/u.png");
		d[0] = getToolkit().getImage("img/npc/chenmeng/d.png");
		d[1] = getToolkit().getImage("img/npc/chenmeng/d.png");
		d[2] = getToolkit().getImage("img/npc/chenmeng/d.png");
		l[0] = getToolkit().getImage("img/npc/chenmeng/l.png");
		l[1] = getToolkit().getImage("img/npc/chenmeng/l.png");
		l[2] = getToolkit().getImage("img/npc/chenmeng/l.png");
		r[0] = getToolkit().getImage("img/npc/chenmeng/r.png");
		r[1] = getToolkit().getImage("img/npc/chenmeng/r.png");
		r[2] = getToolkit().getImage("img/npc/chenmeng/r.png");
		img = "img/npc/chenmeng/chenmeng.jpg";
		word = new String[2];
		word[0]= "npc/iceland/chenmeng_d.txt";
		x = a;
		y = b;
	}
}