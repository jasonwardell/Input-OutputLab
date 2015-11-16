package labio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jwardell
 */
public class Lab2 {

    public static void main(String[] args) throws IOException {

        boolean append = true;
        File data = new File(File.separatorChar + "Users" + File.separatorChar + "klwortman"
                + File.separatorChar + "Documents" + File.separatorChar + "labIOfile.txt");

        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(data, append)));

        out.print("John ");
        out.println("Smith");
        out.print("867 ");
        out.println("Pivot Dr");
        out.print("Madison, ");
        out.print("WI ");
        out.println("51714");

        out.print("Steve ");
        out.println("Manly");
        out.print("554 ");
        out.println("Drive Dr");
        out.print("Milwaukee, ");
        out.print("WI ");
        out.println("51715");
        out.close();

        System.out.println("Wrote file to: " + data.getAbsolutePath());
    }
}
