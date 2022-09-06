/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.data;

import murach.business.User;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class UserDB{

    public static void insert(User user, String path) throws IOException {
        
        OutputStream fileOut = new FileOutputStream(path, true);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fileOut, "UTF-8"));
        String s = user.getEmail() + "|" + user.getLastName() + "|" + user.getFirstName() + "|" + user.getMusic();
        bw.write(s);
        bw.write("\n");
        bw.close();
        
    }
    
    public static boolean emailExisted(String email, String path) throws FileNotFoundException{
        FileInputStream f = new FileInputStream(new File(path));
        Scanner in = new Scanner(f);
        while(in.hasNextLine()){
            String s = in.nextLine();
            char[] c = s.toCharArray();
            String tmp="";
            for(int i = 0; i<c.length;i++){
                if(c[i]=='/'){
                    break;
                }
                else{
                    tmp+=c[i];
                }
            }
            if(email.toLowerCase().equals(tmp.toLowerCase())){
                return false;
            }
        }
        return true;
    }
    
}
