package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import rpg.players.*;

public class MagicIsland extends Map {
	public MagicIsland(Map src) {
		//get Image and set min,max (x,y)
		bg = getToolkit().getImage("img/map/iceland/magicisland.png");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/iceland/magicisland", "r");
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
		sx[0] = 51; sy[0] = 61; dx[0] = 45; dy[0] = 93;
		gateway[1] = src;
		sx[1] = 38; sy[1] = 46; dx[1] = 41; dy[1] = 93;
		//set NPC
		npc_exist = true;
		npc = new Player[1];
		npc[0] = new TeacherC(42, 49);
	}
}