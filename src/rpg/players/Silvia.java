package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Silvia extends Player {
	public Silvia(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/silvia/u.png");
		u[1] = getToolkit().getImage("img/npc/silvia/u.png");
		u[2] = getToolkit().getImage("img/npc/silvia/u.png");
		d[0] = getToolkit().getImage("img/npc/silvia/d.png");
		d[1] = getToolkit().getImage("img/npc/silvia/d.png");
		d[2] = getToolkit().getImage("img/npc/silvia/d.png");
		l[0] = getToolkit().getImage("img/npc/silvia/l.png");
		l[1] = getToolkit().getImage("img/npc/silvia/l.png");
		l[2] = getToolkit().getImage("img/npc/silvia/l.png");
		r[0] = getToolkit().getImage("img/npc/silvia/r.png");
		r[1] = getToolkit().getImage("img/npc/silvia/r.png");
		r[2] = getToolkit().getImage("img/npc/silvia/r.png");
		img = "img/npc/silvia/silvia.jpg";
		word = new String[1];
		word[0]= "npc/iceland/silvia_d.txt";
		x = a;
		y = b;
	}
}