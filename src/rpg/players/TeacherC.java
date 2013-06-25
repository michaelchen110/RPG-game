package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherC extends Player {
	public TeacherC(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/teacherC/u.png");
		u[1] = getToolkit().getImage("img/npc/teacherC/u.png");
		u[2] = getToolkit().getImage("img/npc/teacherC/u.png");
		d[0] = getToolkit().getImage("img/npc/teacherC/d.png");
		d[1] = getToolkit().getImage("img/npc/teacherC/d.png");
		d[2] = getToolkit().getImage("img/npc/teacherC/d.png");
		l[0] = getToolkit().getImage("img/npc/teacherC/l.png");
		l[1] = getToolkit().getImage("img/npc/teacherC/l.png");
		l[2] = getToolkit().getImage("img/npc/teacherC/l.png");
		r[0] = getToolkit().getImage("img/npc/teacherC/r.png");
		r[1] = getToolkit().getImage("img/npc/teacherC/r.png");
		r[2] = getToolkit().getImage("img/npc/teacherC/r.png");
		img = "img/npc/teacherC/teacherC.jpg";
		word = new String[2];
		word[0] = "npc/iceland/teacherC_d.txt";
		word[1] = "npc/iceland/teacherC1.txt";
		x = a;
		y = b;
	}
	public String getWord() {
		if(!state[14] || !state[17]) {
			return word[0];
		}
		state[18] = true;
		return word[1];
	}
}
