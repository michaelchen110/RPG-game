package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Senior extends Player {
	public Senior(int a, int b) {
		img = "img/npc/senior/senior.jpg";
		word = new String[2];
		word[0]= "npc/iceland/senior_d.txt";
		x = a;
		y = b;
	}
}