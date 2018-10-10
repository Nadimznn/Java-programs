
class Circle {

    private double radius;
    
    public Circle(){
    
    }
    public Circle(double radius){
       this.radius=radius;
       
    }
    public double getradius(){        
        return radius;
    }
    public void setradius(double radius){
        this.radius=radius;
}
    public double getArea(){
        return 0;
    }
        public void displayArea(){
        System.out.println(radius);
    }
}
    public class TestCircle{
         public static void main(String[] args){
            Circle Nadim=new Circle(5);
            Nadim.setradius(10);
            Nadim.displayArea();
        }
    }
    

