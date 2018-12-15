package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputFromFile {

        public static String readTextFromFile(){

            StringBuilder sb = new StringBuilder();
            String line;
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Igor\\Desktop\\TextStatistic.txt"))) {
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            System.out.println(InputFromFile.readTextFromFile());
        }

    }

