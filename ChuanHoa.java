
package chuanhoa;
import java.util.*;
import java.io.*;
//chuan hoa ho ten 1
public class ChuanHoa {

    public String chuanHoa(String str) {
        str = str.trim().toLowerCase();
        str = str.replaceAll("\\s+", " ");
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                str += " ";
        }
        return str;
    }
 
    public static void main(String[] sgr) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t>0)
        {
            String str = in.nextLine();
            ChuanHoa chx = new ChuanHoa();
            str = chx.chuanHoa(str);
            System.out.println(str);
            t--;
        }
        
    }
}
