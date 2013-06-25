package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import rpg.players.*;

public class IceHell extends Map {
    public IceHell(Map src) {
        //get Image and set min,max (x,y)
        bg = getToolkit().getImage("img/map/iceland/icehell.png");
        //get op from file
        try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/iceland/icehell", "r");
			randomAccessFile.seek(0);
			for(int i=0;i<(maxX*maxY); i++)
				op[i] = (int) (randomAccessFile.readChar() - 48);
		} catch(IOException ie){
			System.out.print(ie);
		}
		//set gateway, map switching source and destination's (x,y)
		gateway = new Map[4];
		sx = new int[4]; sy = new int[4]; dx = new int[4]; dy = new int [4];
		gateway[0] = src;
		gateway[1] = src;
		gateway[2] = src;
		gateway[3] = src;
		sx[0] = 37; sy[0] = 42; dx[0] = 62; dy[0] = 61;
		sx[1] = 38; sy[1] = 42; dx[1] = 62; dy[1] = 61;
		sx[2] = 46; sy[2] = 42; dx[2] = 88; dy[2] = 37;
		sx[3] = 47; sy[3] = 42; dx[3] = 88; dy[3] = 37;

		npc_exist = true;
		npc = new Player[1];
		npc[0] = new Cpu(42,54);
    }
}
