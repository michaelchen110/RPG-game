package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Earthworm extends Player {
	public Earthworm(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/earthworm/u.png");
		u[1] = getToolkit().getImage("img/npc/earthworm/u.png");
		u[2] = getToolkit().getImage("img/npc/earthworm/u.png");
		d[0] = getToolkit().getImage("img/npc/earthworm/d.png");
		d[1] = getToolkit().getImage("img/npc/earthworm/d.png");
		d[2] = getToolkit().getImage("img/npc/earthworm/d.png");
		l[0] = getToolkit().getImage("img/npc/earthworm/l.png");
		l[1] = getToolkit().getImage("img/npc/earthworm/l.png");
		l[2] = getToolkit().getImage("img/npc/earthworm/l.png");
		r[0] = getToolkit().getImage("img/npc/earthworm/r.png");
		r[1] = getToolkit().getImage("img/npc/earthworm/r.png");
		r[2] = getToolkit().getImage("img/npc/earthworm/r.png");
		img = "img/npc/earthworm/earthworm.jpg";
		word = new String[2];
		word[0]= "npc/iceland/earthworm_d.txt";
		word[1]= "npc/iceland/earthworm1.txt";
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