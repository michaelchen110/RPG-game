package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Half extends Player {
	public Half(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/half/u.png");
		u[1] = getToolkit().getImage("img/npc/half/u.png");
		u[2] = getToolkit().getImage("img/npc/half/u.png");
		d[0] = getToolkit().getImage("img/npc/half/d.png");
		d[1] = getToolkit().getImage("img/npc/half/d.png");
		d[2] = getToolkit().getImage("img/npc/half/d.png");
		l[0] = getToolkit().getImage("img/npc/half/l.png");
		l[1] = getToolkit().getImage("img/npc/half/l.png");
		l[2] = getToolkit().getImage("img/npc/half/l.png");
		r[0] = getToolkit().getImage("img/npc/half/r.png");
		r[1] = getToolkit().getImage("img/npc/half/r.png");
		r[2] = getToolkit().getImage("img/npc/half/r.png");
		img = "img/npc/half/half.jpg";
		word = new String[2];
		word[0]= "npc/iceland/half_d.txt";
		x = a;
		y = b;
	}
}