package pbo1.praktikum2;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Circle1 {
    private double radius;
    private double area;

    public void setRadius( double rad ){
        radius = rad;
    }
    public double getRadius (){
        return radius;
    }

    public double getArea(){
        return area;
    }
    
    public double resultArea(){
        area = Math.PI*Math.pow(radius, 2);
        return area;
    }
    
    public void print(double print){
        System.out.println(print);
    }
}
