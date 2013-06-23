import java.io.*;
import java.util.Scanner;

public class test{
	public static void main(String args[]) throws Exception
	{
		String name,getfr;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int i;
		char data[]= new char[2048];

		System.out.print("Input your source file: ");
		name = br.readLine();
		FileReader fr= new FileReader(name);
		
		System.out.print("Input your destination: ");
		name = br.readLine();
		FileWriter fw= new FileWriter(name);

		while (fr.ready())
		{
			i=fr.read(data);
			getfr=new String(data,0,i);

			fw.write(getfr);
		}
		fw.flush();
		fw.close();
		fr.close();

		Scanner scanner = new Scanner("helloworld");

		while(scanner.hasNextLine()){
			getfr = scanner.nextLine();
			System.out.println(getfr);
		}
		scanner.close();
	}
}
