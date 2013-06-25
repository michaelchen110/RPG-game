package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import rpg.players.*;

public class iShop extends Map {
	public iShop(Map src) {
		//get Image and set min,max (x,y)
		bg = getToolkit().getImage("img/map/iceland/shopstreet.png");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/iceland/shop", "r");
			randomAccessFile.seek(0);
			for(int i=0; i< (maxX* maxY); i++)
				op[i] = (int) (randomAccessFile.readChar() - 48);
		}
		catch(IOException ie){
			System.out.print(ie);
		}
		//set gateway, map switching source and destination's (x,y)
		gateway = new Map[6];
		sx = new int[6]; sy = new int[6]; dx = new int[6]; dy = new int[6];
		gateway[0] = src;
		sx[0] = 70; sy[0] = 47; dx[0] = 67; dy[0] = 87;
		gateway[1] = src;
		sx[1] = 70; sy[1] = 48; dx[1] = 67; dy[1] = 87;
		gateway[2] = src;
		sx[2] = 70; sy[2] = 49; dx[2] = 67; dy[2] = 87;
		gateway[3] = src;
		sx[3] = 70; sy[3] = 52; dx[3] = 67; dy[3] = 87;
		gateway[4] = src;
		sx[4] = 70; sy[4] = 53; dx[4] = 67; dy[4] = 87;
		gateway[5] = src;
		sx[5] = 70; sy[5] = 54; dx[5] = 67; dy[5] = 87;
		//set NPC
		npc_exist = true;
		npc = new Player[1];
		npc[0] = new CM(38, 53);
	}
}
