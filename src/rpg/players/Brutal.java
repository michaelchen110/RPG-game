package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Brutal extends Player {
	public Brutal(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/brutal/u.png");
		u[1] = getToolkit().getImage("img/npc/brutal/u.png");
		u[2] = getToolkit().getImage("img/npc/brutal/u.png");
		d[0] = getToolkit().getImage("img/npc/brutal/d.png");
		d[1] = getToolkit().getImage("img/npc/brutal/d.png");
		d[2] = getToolkit().getImage("img/npc/brutal/d.png");
		l[0] = getToolkit().getImage("img/npc/brutal/l.png");
		l[1] = getToolkit().getImage("img/npc/brutal/l.png");
		l[2] = getToolkit().getImage("img/npc/brutal/l.png");
		r[0] = getToolkit().getImage("img/npc/brutal/r.png");
		r[1] = getToolkit().getImage("img/npc/brutal/r.png");
		r[2] = getToolkit().getImage("img/npc/brutal/r.png");
		img = "img/npc/brutal/brutal.jpg";
		word = new String[2];
		word[0] = "npc/iceland/brutal_d.txt";
		word[1] = "npc/iceland/brutal1.txt";
		x = a;
		y = b;
	}
	public String getWord() {
		if(!state[0]) {
			return word[0];
		}
		state[2] = true;
		return word[1];
	}
}