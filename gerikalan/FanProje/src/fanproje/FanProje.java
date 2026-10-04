
package fanproje;


public class FanProje {
static final int SLOW=1;
static final int MEDIUM=2;
static final int FAST=3;

   private int speed=SLOW;
   private boolean on =false;
   private double radius=5;
   private String color="blue";
   FanProje(){
       
   }
   public int getSpeed(){
       return speed;
   }
   public void setSpeed(int speed){
       this.speed=speed;
   }
   public boolean isOn(){
    return on;
}
   public void setOn(boolean on){
       this.on=on;
   }
   public double getRadius(){
    return radius;
}
   public void setRadius(double radius){
       this.radius=radius;
   }
   
  public String getColor(){
      return color;
  }
   public void setColor(String color){
       this.color=color;
   }
   public String toString(){
       if(on == true){
           return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
       } else{
    return "Color: " + color + ", Radius: " + radius + ", fan is off";
}
           
       }
   
   
    public static void main(String[] args) {
        
        FanProje fan1=new FanProje();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        
          FanProje fan2=new FanProje();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
       
    }
}

