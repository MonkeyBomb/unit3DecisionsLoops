import java.util.Scanner;
import java.lang.Math;
public class CircleOverlap
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);

    System.out.print("Input the radius of the first circle: ");
    double r1 = in.nextDouble(); 
    double x1 = 0;
    double y1 = 0;
    System.out.print("Input the radius of the second circle: ");
    double r2 = in.nextDouble(); 
    double x2 = 40;
    double y2 = 0;

    //distance between the two centers
    double distance = Math.abs(x2 - x1);

    //radius combined
    double comb = r1 + r2;

    if(comb>distance){
        System.out.println("The Circles overlap!");
    }
    if(comb==distance){
     System.out.println("The Circles are tangent!");
    }
    if(comb<distance){
        System.out.println("The Circles are disjoint!");
    }

   }
}   