public class Circle {
    /** The radius of this circle */
    double radius = 1.0;
    
    /** Construct a circle object */
    Circle() {
    
    }
    
    /** Construct a circle object */
    Circle(double newRadius) {
      radius = newRadius;
    }
    
    /** Return the area of this circle */
    double getArea() {
      return radius * radius * 3.14159;
    }
    public static void main (String[] args){
    Circle c1 = new Circle ();
    Circle c2= new Circle (5.5);
    System.out. println(c1.getArea());
    System.out. println(c2.getArea());
    }
    }
    
    