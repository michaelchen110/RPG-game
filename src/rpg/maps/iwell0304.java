package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import rpg.players.*;

public class iwell0304 extends Map {
	public iwell0304(Map src) {
		//get Image and set min,max (x,y)
		bg = getToolkit().getImage("img/map/iceland/well0304.png");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/iceland/iwell0304", "r");
			randomAccessFile.seek(0);
			for(int i =0; i < (maxX*maxY); i++)
				op[i] = (int) (randomAccessFile.readChar() - 48);
		}
		catch(IOException ie){
			System.out.print(ie);
		}
		//set gateway, map switching, source and destination's (x,y)
		gateway = new Map[2];
		sx = new int[2]; sy = new int[2]; dx = new int[2]; dy = new int[2];
		gateway[0] = src;
		sx[0] = 68; sy[0] = 55; dx[0] = 95; dy[0] = 16;
		gateway[1] = src;
		sx[1] = 31; sy[1] = 55; dx[1] = 28; dy[1] = 18;
		//set NPC
		npc_exist = true;
		npc = new Player[1];
		npc[0] = new Fishhead(35,48);
	}
}