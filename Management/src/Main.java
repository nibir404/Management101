import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter token");
        String s =input.next();
        Information info = new Information("Nibirman","Ab-",21,180073);
        info.Display();
        info.check("1");
    }
}
