package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Four extends Player {
	public Four(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/four/u.png");
		u[1] = getToolkit().getImage("img/npc/four/u.png");
		u[2] = getToolkit().getImage("img/npc/four/u.png");
		d[0] = getToolkit().getImage("img/npc/four/d.png");
		d[1] = getToolkit().getImage("img/npc/four/d.png");
		d[2] = getToolkit().getImage("img/npc/four/d.png");
		l[0] = getToolkit().getImage("img/npc/four/l.png");
		l[1] = getToolkit().getImage("img/npc/four/l.png");
		l[2] = getToolkit().getImage("img/npc/four/l.png");
		r[0] = getToolkit().getImage("img/npc/four/r.png");
		r[1] = getToolkit().getImage("img/npc/four/r.png");
		r[2] = getToolkit().getImage("img/npc/four/r.png");
		img = "img/npc/four/four.jpg";
		word = new String[1];
		word[0] = "npc/iceland/four_d.txt";
		x = a;
		y = b;
	}
	public String getWord() {
		state[9] = true;
		return word[0];
	}
}