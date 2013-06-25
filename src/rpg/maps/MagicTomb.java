package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import rpg.players.*;

public class MagicTomb extends Map {
	public MagicTomb(Map src) {
		//get Image and set min,max (x,y)
		bg = getToolkit().getImage("img/map/iceland/magictomb.png");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/iceland/magictomb", "r");
			randomAccessFile.seek(0);
			for(int i =0; i < (maxX*maxY); i++)
				op[i] = (int) (randomAccessFile.readChar() - 48);
		}
		catch(IOException ie){
			System.out.print(ie);
		}
		//set gateway, map switching, source and destination's (x,y)
		gateway = new Map[3];
		sx = new int[3]; sy = new int[3]; dx = new int[3]; dy = new int[3];
		gateway[0] = src;
		sx[0] = 54; sy[0] = 49; dx[0] = 25; dy[0] = 48;
		gateway[1] = src;
		sx[1] = 54; sy[1] = 50; dx[1] = 25; dy[1] = 48;
		gateway[2] = src;
		sx[2] = 54; sy[2] = 51; dx[2] = 25; dy[2] = 48;
		//set NPC
		npc_exist = true;
		npc = new Player[1];
		npc[0] = new Senior(30, 51);
	}
}
