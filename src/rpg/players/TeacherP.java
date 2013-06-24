package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherP extends Player {
	public TeacherP(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/teacherP/u.png");
		u[1] = getToolkit().getImage("img/npc/teacherP/u.png");
		u[2] = getToolkit().getImage("img/npc/teacherP/u.png");
		d[0] = getToolkit().getImage("img/npc/teacherP/d.png");
		d[1] = getToolkit().getImage("img/npc/teacherP/d.png");
		d[2] = getToolkit().getImage("img/npc/teacherP/d.png");
		l[0] = getToolkit().getImage("img/npc/teacherP/l.png");
		l[1] = getToolkit().getImage("img/npc/teacherP/l.png");
		l[2] = getToolkit().getImage("img/npc/teacherP/l.png");
		r[0] = getToolkit().getImage("img/npc/teacherP/r.png");
		r[1] = getToolkit().getImage("img/npc/teacherP/r.png");
		r[2] = getToolkit().getImage("img/npc/teacherP/r.png");
		img = "img/npc/teacherP/teacherP.jpg";
		word = new String[2];
		word[0]= "npc/iceland/teacherP_d.txt";
		word[1]= "npc/iceland/teacherP1.txt";
		x = a;
		y = b;
	}
	public String getWord() {
		if(!state[13]) {
			return word[0];
		}
		state[13] = true;
		return word[1];
	}
}