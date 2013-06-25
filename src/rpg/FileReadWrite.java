import java.io.*;
import java.util.*;

public class FileReadWrite{
	public static void main(String[] args) {
		int num=0, i, j;
		Scanner scan = new Scanner(System.in);
		String filename, temp;
		System.out.printf("Input your filename: ");
		filename = scan.nextLine();
		try {
			File file = new File(filename);
			RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw"); 

			while(num!=3){
				System.out.print("1.show 2.write 3.exit action: ");
				num = scan.nextInt();
				if(num==1){
					System.out.printf("\033[1;31m>");
					for(i=0;i<10;i++) System.out.print("0123456789");
					System.out.println("\033[m");
					randomAccessFile.seek(0);
					for(i=0;i<100;i++){
						for(j=0;j<100;j++) System.out.print(randomAccessFile.readChar());
						System.out.println();
					}
				}
				else if(num==2){
					System.out.print("Input (x, y) and values: ");
					i=scan.nextInt();
					j=scan.nextInt();
					scan.nextLine();
					temp = scan.nextLine();
					randomAccessFile.seek((j*100+i)*2);
					randomAccessFile.writeChars(temp);
					num = 2;
				}
			}
			randomAccessFile.close(); 
		}
		catch(IOException ie){
			System.out.print(ie);
		}
	}
}
