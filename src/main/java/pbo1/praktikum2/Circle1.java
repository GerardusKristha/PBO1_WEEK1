package pbo1.praktikum2;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Circle1 {
    private double radius;
    
    public Circle1(double rad){
        radius = rad;
    }
    public void setRadius( double rad ){
        radius = rad;
    }
    public double getRadius (){
        return radius;
    }

    public double getArea(){
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }
    
    public void print(){
        System.out.println("-------------------------------------------");
        System.out.println("Jari-jari lingkaran adalah\t: "+ (int)radius);
        System.out.println("Luas lingkaran adalah\t\t: " + getArea());
    }
}
