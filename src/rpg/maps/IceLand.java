package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import rpg.players.*;

public class IceLand extends Map {
	public IceLand(Map src) {
		//get Image and set min,max (x,y)
		bg = getToolkit().getImage("img/map/iceland/iceland.png");
		mini = getToolkit().getImage("img/map/iceland/mini_iceland.jpg");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/iceland/iceland", "r");
			randomAccessFile.seek(0);
			for(int i =0; i < (maxX*maxY); i++)
				op[i] = (int) (randomAccessFile.readChar() - 48);
		}
		catch(IOException ie){
			System.out.print(ie);
		}
		//set gateway, map switching, source and destination's (x,y)
		gateway = new Map[20];
		sx = new int[20]; sy = new int[20]; dx = new int[20]; dy = new int[20];
		gateway[0] = src;
		sx[0] = 81; sy[0] = 93; dx[0] = 35; dy[0] = 12;
		gateway[1] = new iStatue(this);
		sx[1] = 9; sy[1] = 78; dx[1] = 69; dy[1] = 46;
		gateway[2] = gateway[1];
		sx[2] = 9; sy[2] = 81; dx[2] = 69; dy[2] = 53;
		gateway[3] = new iwell0102(this);
		sx[3] = 69; sy[3] = 60; dx[3] = 46; dy[3] = 65;
		gateway[4] = gateway[3];
		sx[4] = 49; sy[4] = 6; dx[4] = 32; dy[4] = 46;
		gateway[5] = new iwell0304(this);
		sx[5] = 95; sy[5] = 17; dx[5] = 68; dy[5] = 54;
		gateway[6] = gateway[5];
		sx[6] = 28; sy[6] = 17; dx[6] = 31; dy[6] = 54;
		gateway[7] = new MagicSquare(this);
		sx[7] = 48; sy[7] = 42; dx[7] = 42; dy[7] = 67;
		gateway[8] = new iwell0506(this);
		sx[8] = 92; sy[8] = 36; dx[8] = 56; dy[8] = 54;
		gateway[9] = gateway[8];
		sx[9] = 28; sy[9] = 49; dx[9] = 34; dy[9] = 48;
		gateway[10] = new iPalace(this);
		sx[10] = 65; sy[10] = 14; dx[10] = 44; dy[10] = 66;
		gateway[11] = gateway[10];
		sx[11] = 66; sy[11] = 14; dx[11] = 44; dy[11] = 66;
		gateway[12] = new MagicTomb(this);
		sx[12] = 24; sy[12] = 48; dx[12] = 53; dy[12] = 50;
		gateway[13] = new iShop(this);
		sx[13] = 67; sy[13] = 88; dx[13] = 69; dy[13] = 54;
		gateway[14] = this;
		sx[14] = 6;	sy[14] = 46; dx[14]= 43; dy[14] = 91;
		gateway[15] = this;
		sx[15] = 43; sy[15] = 90; dx[15] = 6; dy[15] = 47;
		gateway[16] = new MagicIsland(this);
		sx[16] = 41; sy[16] = 92; dx[16] = 38; dy[16] = 47;
		gateway[17] = gateway[16];
		sx[17] = 45; sy[17] = 92; dx[17] = 50; dy[17] = 61;
		gateway[18] = new IceHell(this);
		sx[18] = 88; sy[18] = 36; dx[18] = 46; dy[18] = 43;
		gateway[19] = gateway[18];
		sx[19] = 62; sy[19] = 62; dx[19] = 37; dy[19] = 43;
		//set NPC
		npc_exist = true;
		npc = new Player[6];
		npc[0] = new Indian(48,30);
		npc[1] = new Bob(32,46);
		npc[2] = new Kenlee(24,63);
		npc[3] = new Brutal(45,83);
		npc[4] = new Goat(46,83);
		npc[5] = new Silvia(77,78);
	}
}
