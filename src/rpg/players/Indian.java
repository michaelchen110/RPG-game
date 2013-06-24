package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Indian extends Player {
	public Indian(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/indian/u.png");
		u[1] = getToolkit().getImage("img/npc/indian/u.png");
		u[2] = getToolkit().getImage("img/npc/indian/u.png");
		d[0] = getToolkit().getImage("img/npc/indian/d.png");
		d[1] = getToolkit().getImage("img/npc/indian/d.png");
		d[2] = getToolkit().getImage("img/npc/indian/d.png");
		l[0] = getToolkit().getImage("img/npc/indian/l.png");
		l[1] = getToolkit().getImage("img/npc/indian/l.png");
		l[2] = getToolkit().getImage("img/npc/indian/l.png");
		r[0] = getToolkit().getImage("img/npc/indian/r.png");
		r[1] = getToolkit().getImage("img/npc/indian/r.png");
		r[2] = getToolkit().getImage("img/npc/indian/r.png");
		img = "img/npc/indian/indian.jpg";
		word = new String[2];
		word[0]= "npc/iceland/indian_d.txt";
		word[1]= "npc/iceland/indian1.txt";
		x = a;
		y = b;
	}
	public String getWord() {
		if(!state[6] || !state[7]) {
			state[5] = true;
			return word[0];
		}
		state[8] = true;
		return word[1];
	}
}