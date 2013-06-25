package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Goat extends Player {
	public Goat(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/goat/u.png");
		u[1] = getToolkit().getImage("img/npc/goat/u.png");
		u[2] = getToolkit().getImage("img/npc/goat/u.png");
		d[0] = getToolkit().getImage("img/npc/goat/d.png");
		d[1] = getToolkit().getImage("img/npc/goat/d.png");
		d[2] = getToolkit().getImage("img/npc/goat/d.png");
		l[0] = getToolkit().getImage("img/npc/goat/l.png");
		l[1] = getToolkit().getImage("img/npc/goat/l.png");
		l[2] = getToolkit().getImage("img/npc/goat/l.png");
		r[0] = getToolkit().getImage("img/npc/goat/r.png");
		r[1] = getToolkit().getImage("img/npc/goat/r.png");
		r[2] = getToolkit().getImage("img/npc/goat/r.png");
		img = "img/npc/goat/goat.jpg";
		word = new String[2];
		word[0]= "npc/iceland/goat_d.txt";
		word[1]= "npc/iceland/goat1.txt";
		x = a;
		y = b;
	}
	public String getWord() {
		if(!state[0]) {
			return word[0];
		}
		state[1] = true;
		return word[1];
	}
}