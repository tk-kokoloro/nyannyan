import java.io.*;

public class Movie_User_graph {
        public static String[] split_data(String data) {
                String[] sp = new String[3];
                sp = data.split("::");
                return sp;
        }
        public static void main(String[] args) {
                String readline;
                String[] sp_data = new String[3];
                String filePath = args[0];
                BufferedReader in = null;
                try {
                        in = new BufferedReader(new FileReader(args[0]));
                        while ((readline = in.readLine()) != null) {
                                sp_data = split_data(readline);
                        }
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
