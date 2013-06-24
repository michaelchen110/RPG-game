package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bob extends Player {
	public Bob(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/bob/u.png");
		u[1] = getToolkit().getImage("img/npc/bob/u.png");
		u[2] = getToolkit().getImage("img/npc/bob/u.png");
		d[0] = getToolkit().getImage("img/npc/bob/d.png");
		d[1] = getToolkit().getImage("img/npc/bob/d.png");
		d[2] = getToolkit().getImage("img/npc/bob/d.png");
		l[0] = getToolkit().getImage("img/npc/bob/l.png");
		l[1] = getToolkit().getImage("img/npc/bob/l.png");
		l[2] = getToolkit().getImage("img/npc/bob/l.png");
		r[0] = getToolkit().getImage("img/npc/bob/r.png");
		r[1] = getToolkit().getImage("img/npc/bob/r.png");
		r[2] = getToolkit().getImage("img/npc/bob/r.png");
		img = "img/npc/bob/bob.jpg";
		word = new String[2];
		word[0]= "npc/iceland/bob_d.txt";
		x = a;
		y = b;
	}
}