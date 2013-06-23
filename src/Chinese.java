/**
*       6/23 Sunday
*       Chinese.getText(filename) is a static method
*       
*
*/

import java.io.*;

public class Chinese{
    public static String[] getText(String filename)// throws Exception 
    {
        String[] str = new String[30];
    
        try {
            BufferedReader input = 
                new BufferedReader(new InputStreamReader(
                            new FileInputStream(filename),"UTF-8"));
            for (int i = 0;; i++) {
                str[i] = input.readLine();
                if (str[i] == null) break;
            }
            input.close();
        }
        catch (Exception e) {return null;}
        return str;
    }

    public static String get(String filename)// throws Exception 
    {
        String text = "";
    
        try {
            String str = "";
            BufferedReader input = 
                new BufferedReader(new InputStreamReader(
                            new FileInputStream(filename),"UTF-8"));
            while (true) {
                str = input.readLine();
                if (str == null) 
                    break;
                else 
                    text = text + str + "\n";
            }
            input.close();
        }
        catch (Exception e) {return null;}
        return text;
    }
}

