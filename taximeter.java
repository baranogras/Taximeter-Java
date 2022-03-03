package Lesson2;
import java.util.Scanner;
public class taximeter {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20,total;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Distance in KM : ");
        km = input.nextInt();

        total = 10 +(km * perKm);
        total = (total < 20) ? 20 : total;
        System.out.print("Total Price  : " +total);
    }
}
