package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Juju extends Player {
	public Juju(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/juju/u.png");
		u[1] = getToolkit().getImage("img/npc/juju/u.png");
		u[2] = getToolkit().getImage("img/npc/juju/u.png");
		d[0] = getToolkit().getImage("img/npc/juju/d.png");
		d[1] = getToolkit().getImage("img/npc/juju/d.png");
		d[2] = getToolkit().getImage("img/npc/juju/d.png");
		l[0] = getToolkit().getImage("img/npc/juju/l.png");
		l[1] = getToolkit().getImage("img/npc/juju/l.png");
		l[2] = getToolkit().getImage("img/npc/juju/l.png");
		r[0] = getToolkit().getImage("img/npc/juju/r.png");
		r[1] = getToolkit().getImage("img/npc/juju/r.png");
		r[2] = getToolkit().getImage("img/npc/juju/r.png");
		img = "img/npc/juju/juju.jpg";
		word = new String[2];
		word[0]= "npc/iceland/juju_d.txt";
		word[1]= "npc/iceland/juju1.txt";
		x = a;
		y = b;
	}
}