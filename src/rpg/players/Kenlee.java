package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kenlee extends Player {
	public Kenlee(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/kenlee/u.png");
		u[1] = getToolkit().getImage("img/npc/kenlee/u.png");
		u[2] = getToolkit().getImage("img/npc/kenlee/u.png");
		d[0] = getToolkit().getImage("img/npc/kenlee/d.png");
		d[1] = getToolkit().getImage("img/npc/kenlee/d.png");
		d[2] = getToolkit().getImage("img/npc/kenlee/d.png");
		l[0] = getToolkit().getImage("img/npc/kenlee/l.png");
		l[1] = getToolkit().getImage("img/npc/kenlee/l.png");
		l[2] = getToolkit().getImage("img/npc/kenlee/l.png");
		r[0] = getToolkit().getImage("img/npc/kenlee/r.png");
		r[1] = getToolkit().getImage("img/npc/kenlee/r.png");
		r[2] = getToolkit().getImage("img/npc/kenlee/r.png");
		img = "img/npc/kenlee/kenlee.jpg";
		word = new String[2];
		word[0]= "npc/iceland/kenlee_d.txt";
		x = a;
		y = b;
	}
}