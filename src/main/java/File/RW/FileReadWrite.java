package File.RW;

import java.io.*;

public class FileReadWrite {

    private String[] words = null;

    public void readFile(String filename) {
        String line;
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                words = line.split(" ");
            }

            bufferedReader.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("file does not exist");
        }
        catch (IOException e) {
            System.out.println("error reading file");
        }
    }

    public void writeFile(String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < words.length; i++){
                bufferedWriter.write(words[i]);
                bufferedWriter.write(" ");
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        }
        catch (IOException e) {
            System.out.println("error writing file");
        }
    }

}
