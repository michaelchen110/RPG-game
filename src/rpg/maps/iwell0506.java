package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class iwell0506 extends Map {
	public iwell0506(Map src) {
		//get Image and set min,max (x,y)
		bg = getToolkit().getImage("img/map/iceland/well0506.png");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/iceland/iwell0506", "r");
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
		sx[0] = 34; sy[0] = 47; dx[0] = 0; dy[0] = 0;
		gateway[1] = src;
		sx[1] = 57; sy[1] = 54; dx[1] = 0; dy[1] = 0;

		npc_exist = true;
		npc = new Player[2];
		npc[0] = new Juju(55,48);
		npc[1] = new Jeremy(34,51);
	}
}