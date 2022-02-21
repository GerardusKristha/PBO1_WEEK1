package pbo1.praktikum3;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Circle3 {
    private double radius;
    private String color;
    private double xPosition;
    private double yPosition;
    
    public Circle3(){
        radius = 0;
        color = "";
    }
    public Circle3(double xPosition, double yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    public void setRadius( double rad ){
        radius = rad;
    }
    public double getRadius (){
        return radius;
    }
    public void setColor(String clr){
        color = clr;
    }
    public String getColor(){
        return color;
    }
    
    public void setXPosition(double x_Position){
        xPosition = x_Position;
    }
    
    public double getxPosisiton(){
       return xPosition;
    }
    
    public void setyPosition(double y_Position){
        yPosition = y_Position;
    }
    
    public double getyPosisiton(){
       return yPosition;
    }
    
    public double getCircumference(){
        double circumference = Math.PI*(2*radius);
        return circumference;
    }
    
    public double getArea(){
        double area = Math.PI*(radius*radius);
        return area;
    }
    
    public String toString(){
        System.out.println("-------------------------------------------");
        System.out.println("Atribut");
        return "Jari-jari\t\t: " + radius 
                +"\nWarna\t\t: " + color 
                +"\nKordinat\t\t: " + xPosition+","+yPosition;
    }
}
