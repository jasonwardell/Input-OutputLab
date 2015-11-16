package labio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jwardell
 */
public class LabIO {

    public static void main(String[] args) {

        File data = new File(File.separatorChar + "Users" + File.separatorChar + "klwortman" + 
                File.separatorChar + "Documents" + File.separatorChar + "labIOfile.txt");

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println("The file location you entered cannot be found");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
    }
}
