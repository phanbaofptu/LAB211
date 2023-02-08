
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phangiabao
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            int countLine = Manage.countLine();
            int count = 1;
            br = new BufferedReader(new FileReader(new File("/Users/phangiabao/Desktop/LAB.txt")));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("/Users/phangiabao/Desktop/output.txt", true)));
            String line;
            //write until end file
            while ((line = br.readLine()) != null) {
                //check line empty
                if (Manage.isLineEmpty(line)) {
                    continue;
                }
                line = Manage.formatOneSpace(line);
                line = Manage.formatSpecialCharacters(line);
                line = Manage.afterDotUpperCase(line);
                line = Manage.noSpaceQuotes(line);
                line = Manage.firstUpercase(line);
                line = Manage.lastAddDot(line);
                pw.print(line);
                if (count < countLine) {
                    pw.print(System.getProperty("line.separator"));
                }
                count++;
            }
            br.close();
            pw.close();
            System.out.println("Normalize successful.");
        } catch (FileNotFoundException ex) {
            System.err.println("Can't not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
     
}
