import java.util.Scanner;
public class Location {
    public int row;
    public int column;
    public double maxValue;
    public Location(int row, int column, double maxValue) {
    this.row=row;
    this.column=column;
    this.maxValue=maxValue;
}
  
    public static Location locateLargest(double[][] a) {
        double maxValue=a[0][0];
        int row=0;
        int column=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>maxValue){
                    maxValue=a[i][j];
                    row=i;
                    column=j;
                }
                
            }
        }
        return new Location(row, column, maxValue);
    }

public static void main(String[] args) { 
    
    Scanner input=new Scanner(System.in);
    System.out.print("satir sayisi");
    int row=input.nextInt();
    System.out.print("sutun sayisi");
    int column=input.nextInt();
    double[][] a = new double[row][column];
     for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                a[i][j] = input.nextDouble();
                
            }
}
     Location location = locateLargest(a);
     System.out.println("En buyuk degerin satiri: " + location.row);
     System.out.println("En buyuk degerin sutunu: " + location.column);
     System.out.println("En buyuk deger: " + location.maxValue);
     
}

}