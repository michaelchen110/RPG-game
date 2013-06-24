package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import rpg.players.*;

public class iPalace extends Map {
	public iPalace(Map src) {
		//get Image and set min,max (x,y)
		bg = getToolkit().getImage("img/map/iceland/palace.png");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/iceland/palace", "r");
			randomAccessFile.seek(0);
			for(int i =0; i < (maxX*maxY); i++)
				op[i] = (int) (randomAccessFile.readChar() - 48);
		}
		catch(IOException ie){
			System.out.print(ie);
		}
		//set gateway, map switching, source and destination's (x,y)
		gateway = new Map[1];
		sx = new int[1]; sy = new int[1]; dx = new int[1]; dy = new int[1];
		gateway[0] = src;
		sx[0] = 44; sy[0] = 68; dx[0] = 65; dy[0] = 15;

		npc_exist = true;
		npc = new Player[3];
		npc[0] = new Four(44,51);
		npc[1] = new Iphoneyen(39,52);
		npc[2] = new Half(49,52);
	}
}
