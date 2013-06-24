package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import rpg.players.*;

public class iStatue extends Map {
	public iStatue(Map src) {
		//get Image
		bg = getToolkit().getImage("img/map/iceland/statue.png");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/iceland/istatue", "r");
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
		sx[0] = 70; sy[0] = 46; dx[0] = 10; dy[0] = 78;
		gateway[1] = gateway[0];
		sx[1] = 70; sy[1] = 53; dx[1] = 10; dy[1] = 81;
	}
}
