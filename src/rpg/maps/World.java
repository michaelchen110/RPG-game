package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import rpg.players.*;

public class World extends Map {
	public World() {
		//get Image and mini image
		bg = getToolkit().getImage("img/map/world.png");
		mini = getToolkit().getImage("img/map/mini_world.jpg");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/worldmap", "r");
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
		gateway[0] = new IceLand(this);
		sx[0] = 35; sy[0] = 11; dx[0] = 81; dy[0] = 94;
		gateway[1] = new HomeTown(this);
		sx[1] = 45; sy[1] = 54; dx[1] = 0; dy[1] = 0;
	}
}
