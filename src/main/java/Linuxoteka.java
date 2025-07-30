import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Linuxoteka {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("C:/Users/mojca/Desktop/LinuxotekaJava/src/main/java/UbuntuLista.txt"));
            System.out.print("zawartość pliku: ");
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
            input.close();
        }catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
            e.printStackTrace();
        }
    }
}
