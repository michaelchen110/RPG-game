package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fishhead extends Player {
	public Fishhead(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/fishhead/u.png");
		u[1] = getToolkit().getImage("img/npc/fishhead/u.png");
		u[2] = getToolkit().getImage("img/npc/fishhead/u.png");
		d[0] = getToolkit().getImage("img/npc/fishhead/d.png");
		d[1] = getToolkit().getImage("img/npc/fishhead/d.png");
		d[2] = getToolkit().getImage("img/npc/fishhead/d.png");
		l[0] = getToolkit().getImage("img/npc/fishhead/l.png");
		l[1] = getToolkit().getImage("img/npc/fishhead/l.png");
		l[2] = getToolkit().getImage("img/npc/fishhead/l.png");
		r[0] = getToolkit().getImage("img/npc/fishhead/r.png");
		r[1] = getToolkit().getImage("img/npc/fishhead/r.png");
		r[2] = getToolkit().getImage("img/npc/fishhead/r.png");
		img = "img/npc/fishhead/fishhead.jpg";
		word = new String[2];
		word[0] = "npc/iceland/fishhead_d.txt";
		word[1] = "npc/iceland/fishhead1.txt";
		x = a;
		y = b;
	}
	public String getWord() {
		if(!state[0]) {
			state[0] = true;
			return word[0];
		}
		return word[1];
	}
}