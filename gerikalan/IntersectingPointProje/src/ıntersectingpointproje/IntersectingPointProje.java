
package ıntersectingpointproje;
import java.util.Scanner;


public class IntersectingPointProje {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("x1 degeri :");
       double x1=input.nextDouble();
       System.out.print("y1 degeri :");
       double y1=input.nextDouble();
       System.out.print("x2 degeri :");
       double x2=input.nextDouble();
       System.out.print("y2 degeri :");
       double y2=input.nextDouble();
       System.out.print("x3 degeri :");
       double x3=input.nextDouble();
       System.out.print("y3 degeri :");
       double y3=input.nextDouble();
         System.out.print("x4 degeri :");
       double x4=input.nextDouble();
       System.out.print("y4 degeri :");
       double y4=input.nextDouble();
       double a = y1 - y2;
       double b=x2 - x1;
       double c = y3 - y4;
       double d = x4 - x3;
       double e = x2*y1 - x1*y2;  
       double f = x4*y3 - x3*y4;
       double payda=a * d - b * c;
       
       if (payda != 0) {
           double x = (e * d - b * f) / payda;
           double y = (a * f - e * c) / payda;
           System.out.println("Kesisim noktasi: (" + x + ", " + y + ")");
       }else{
           System.out.println(" kesisim noktasi yok.");
       }
    }
    
    
}
