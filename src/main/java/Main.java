import File.RW.FileReadWrite;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        FileReadWrite rw = new FileReadWrite();

        rw.readFile("/home/sam/Documents/File_Changer/src/main/java/test");
        rw.writeFile("/home/sam/Documents/File_Changer/src/main/java/writetest");
    }
}
