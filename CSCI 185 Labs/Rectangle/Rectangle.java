/*
CSCI 185 Fall 2021
Name:Guang Wei TOo
Lab 1 : Class and Object
9/16/2021
*/

public class Rectangle {
    
     double width, height;
     double area,perimeter;

     Rectangle( ){
     this (1.0,1.0);
    }
    
    public Rectangle(double width, double height){
        perimeter = 2*(width+height);
        area = width*height;
    }

    public String getArea(){
      return "Area:"+ area;
    }

    public String getPerimeter(){
     return "Perimeter:"+ perimeter;
    }
    public static void main (String[]args){
        Rectangle r1= new Rectangle ();
        Rectangle r2 = new Rectangle(4.0,40.0);
        System.out.println(r1.getArea());
        System.out.println(r2.getPerimeter());
       
    }
}