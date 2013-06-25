package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Random extends Player {
	public Random(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/random/u.png");
		u[1] = getToolkit().getImage("img/npc/random/u.png");
		u[2] = getToolkit().getImage("img/npc/random/u.png");
		d[0] = getToolkit().getImage("img/npc/random/d.png");
		d[1] = getToolkit().getImage("img/npc/random/d.png");
		d[2] = getToolkit().getImage("img/npc/random/d.png");
		l[0] = getToolkit().getImage("img/npc/random/l.png");
		l[1] = getToolkit().getImage("img/npc/random/l.png");
		l[2] = getToolkit().getImage("img/npc/random/l.png");
		r[0] = getToolkit().getImage("img/npc/random/r.png");
		r[1] = getToolkit().getImage("img/npc/random/r.png");
		r[2] = getToolkit().getImage("img/npc/random/r.png");
		img = "img/npc/random/random.jpg";
		word = new String[2];
		word[0]= "npc/iceland/random_d.txt";
		word[1]= "npc/iceland/random1.txt";
		x = a;
		y = b;
	}
	public String getWord(){
		if(!state[16]){
			state[15] = true;
			return word[0];
		}
		state[17] = true;
		return word[1];
	}
}
