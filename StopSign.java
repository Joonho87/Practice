public class StopSign {
   public static void main(String[] args) {
      egg();
      teacup();
      System.out.println();
      stopSign();
      System.out.println();
      hat();
      System.out.println("End of code.");
   }
   
   public static void egg() {
      top();
      bottom();
   }
   
   public static void teacup() {
      bottom();
      line();
   }
   
   public static void stopSign() {
      top();
      System.out.println("| STOP |");
      bottom();
   }
   
   public static void hat() {
      top();
      line();
   }
   
   public static void top() {
      System.out.println("  ___");
      System.out.println(" /   \\");
      System.out.println("/     \\");
   }
   
   public static void bottom() {
      System.out.println("\\     /");
      System.out.println(" \\___/");
   }
   
   public static void line() {
      System.out.println("+--------+");
   }

}