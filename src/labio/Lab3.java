package labio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author jwardell
 */
public class Lab3 {

    public static void main(String[] args) throws IOException {
        int counter = 0;
        File data = new File(File.separatorChar + "Users" + File.separatorChar + "klwortman"
                + File.separatorChar + "Documents" + File.separatorChar + "labIOfile.txt");

        BufferedReader in = null;
        in = new BufferedReader(new FileReader(data));
        String line = in.readLine();
        try {
            while (line != null) {
                line = in.readLine();
                // Change the number in the if statement to change the line 
                // that is read back to you.
                if (counter == 2) {
                    System.out.print(line);
                    line = in.readLine();
                    line = in.readLine();
                    if (line.contains(",")) {
                        String nameParts = line.substring(line.length() -8, line.length() -5);
                        System.out.println(" State: " + nameParts);
                    }
                }
                counter++;
            }
        } catch (Exception e) {
            System.out.println("The file location you entered cannot be found");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
    }
}
