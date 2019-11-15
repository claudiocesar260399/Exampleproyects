import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class FileExmple {
    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);
        String filename;
        FileReader file;

        System.out.println("ENter a file name: ");
        filename = stdIn.nextLine();
        try {
            file = new FileReader(filename);
        }catch(FileNotFoundException e)
        {
            //e.printStackTrace();
            System.out.println("FIle not found");
        }
    }
}

