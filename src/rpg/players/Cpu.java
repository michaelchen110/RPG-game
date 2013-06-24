package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cpu extends Player {
	public Cpu(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/cpu/u.png");
		u[1] = getToolkit().getImage("img/npc/cpu/u.png");
		u[2] = getToolkit().getImage("img/npc/cpu/u.png");
		d[0] = getToolkit().getImage("img/npc/cpu/d.png");
		d[1] = getToolkit().getImage("img/npc/cpu/d.png");
		d[2] = getToolkit().getImage("img/npc/cpu/d.png");
		l[0] = getToolkit().getImage("img/npc/cpu/l.png");
		l[1] = getToolkit().getImage("img/npc/cpu/l.png");
		l[2] = getToolkit().getImage("img/npc/cpu/l.png");
		r[0] = getToolkit().getImage("img/npc/cpu/r.png");
		r[1] = getToolkit().getImage("img/npc/cpu/r.png");
		r[2] = getToolkit().getImage("img/npc/cpu/r.png");
		img = "img/npc/cpu/cpu.jpg";
		word = new String[2];
		word[0]= "npc/iceland/cpu_d.txt";
		x = a;
		y = b;
	}
}