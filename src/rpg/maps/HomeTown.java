package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class HomeTown extends Map {
	public HomeTown(Map src) {
		//get Image and mini image
		bg = getToolkit().getImage("img/map/hometown/hometown.png");
		mini = getToolkit().getImage("img/map/hometown/mini_hometown.jpg");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/hometown/hometown", "r");
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
		sx[0] = 81; sy[0] = 93; dx[0] = 35; dy[0] = 12;
	}
}
