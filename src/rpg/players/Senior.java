package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Senior extends Player {
	public Senior(int a, int b) {
		img = "img/npc/senior/senior.jpg";
		word = new String[2];
		word[0]= "npc/iceland/senior_d.txt";
		word[1]= "npc/iceland/senior1.txt";
		x = a;
		y = b;
	}
	public String getWord() {
		if(!state[8] || !state[10]) {
			return word[0];
		}
		state[11] = true;
		return word[1];
	}
}
