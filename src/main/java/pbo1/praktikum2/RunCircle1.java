package pbo1.praktikum2;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
import java.util.Scanner;

public class RunCircle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        Circle1 circle = new Circle1();
        
        System.out.print("Masukkan jari-jari lingkaran : ");
        circle.setRadius(input.nextDouble());
        
        circle.resultArea();
        System.out.println("Luas lingkaran : "+circle.getArea());
    }
}
