package pbo1.praktikum2;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
import java.util.Scanner;

public class Circle1_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        Circle1 circle = new Circle1(0);
        
        System.out.print("Masukkan jari-jari lingkaran\t: ");
        circle.setRadius(input.nextDouble());
        circle.print();
        System.out.println("\nProgram ini di buat oleh Gerardus Kristha Bayu 215314004");
    }
}
