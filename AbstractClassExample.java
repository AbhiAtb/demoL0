import java.util.*;
abstract class Shape{
int length,breadth,base,height,radius;
Scanner input=new Scanner(System.in);
abstract void printArea();
}
class Rectangle extends Shape{
void printArea(){
System.out.println("***finding the Area of Rectangle***");
System.out.println("enter length and breadth:");
length=input.nextInt();
breadth=input.nextInt();
System.out.println("the area of rectangleis:"+length*breadth);
}
}
class Triangle extends Shape{
  void printArea(){
System.out.println("\n***finding the area of triangle***");
System.out.println("enter base and height:");
base=input.nextInt();
height=input.nextInt();
System.out.println("the area of triangle is :"+(base*height)/2);
}
}
class Circle extends Shape{
void printArea(){
System.out.println("\n***finding the area of circle***");
System.out.println("enter radius");
radius=input.nextInt();
System.out.println("the area of circle is :"+3.14f*radius*radius);
}
}
public class AbstractClassExample{
public static void main(String[] args){
Rectangle rec=new Rectangle();
rec.printArea();
Triangle tri=new Triangle();
tri.printArea();
Circle cir=new Circle();
cir.printArea();
}
}
 