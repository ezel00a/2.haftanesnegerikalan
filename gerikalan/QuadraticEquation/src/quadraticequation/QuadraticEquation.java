
package quadraticequation;
import java.util.Scanner;


public class QuadraticEquation {

    private double a;
    private double b;
    private double c;
    
public  QuadraticEquation(double a,double b,double c){
       this.a=a;
       this.b=b;
       this.c=c;
   }
public double getA(){
    return a;
}
public double getB(){
    return b;
}
public double getC(){
    return c;
}
public double getDiscriminant(){
    return Math.pow(b, 2) - 4 * a * c;
}
public double getRoot1(){
if (getDiscriminant() < 0) {
    return 0;
}else{
    return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
}
}
public double getRoot2(){
    if (getDiscriminant() < 0){
        return 0;
    } else{
         return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a degeri: ");
        double a = input.nextDouble();
        System.out.print("b degeri: ");
        double b = input.nextDouble();
         System.out.print("c degeri: ");
        double c = input.nextDouble();
        QuadraticEquation equation=new QuadraticEquation(a,b,c);
          
        if(equation.getDiscriminant()>0){
            System.out.println(equation.getRoot1());
              System.out.println(equation.getRoot2());
        }
        else if (equation.getDiscriminant()==0){
               System.out.println(equation.getRoot1());
        } else{
            System.out.println("The equation has no roots");
            
        }
    }
    
}
