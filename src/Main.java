import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s>7 ) {
            System.out.println("ruur");
        }else
            System.out.println("сегодняший урок  ");
        switch (s){

            case 1:
                System.out.print("сабак");
                break;
            case 2:
                System.out.println("сейшин");
                break;
            case 3:
                System.out.println("сабак2");

                break;
            case 4:
                System.out.println("сейшин2");
                break;
            case 5:
                System.out.println("сабак3");
            case 6:
                System.out.println("Englsh");
            case 7:
                System.out.println("Foodball");
        }
    }
}


