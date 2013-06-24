package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

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
		gateway = new Map[6];
		sx = new int[6]; sy = new int[6]; dx = new int[6]; dy = new int[6];
		gateway[0] = src;
		sx[0] = 51; sy[0] = 61; dx[0] = 0; dy[0] = 0;
		gateway[1] = src;
		sx[1] = 40; sy[1] = 68; dx[1] = 0; dy[1] = 0;
		gateway[2] = src;
		sx[2] = 41; sy[2] = 68; dx[2] = 0; dy[2] = 0;
		gateway[3] = src;
		sx[3] = 42; sy[3] = 68; dx[3] = 0; dy[3] = 0;
		gateway[4] = src;
		sx[4] = 43; sy[4] = 68; dx[4] = 0; dy[4] = 0;
		gateway[5] = src;
		sx[5] = 44; sy[5] = 68; dx[5] = 0; dy[5] = 0;
	}
}