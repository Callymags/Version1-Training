import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StuffTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("myFile.txt"));
        try {
            String line = br.readLine();
            System.out.println(line);
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
