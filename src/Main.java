
public class Main {
     public static void main (String[] args)
     {
          ClockDisplay C1= new ClockDisplay(02,30);
          String ST = C1.displayString;
          System.out.println("Time is   "  + ST );
     }
        private int hour;
        private int minute;
        private String dis ;

}
 //   public static void main(String[] var0) {
         //cd = new ClockDisplay(17, 30);
      //  String var1 = cd.getTime();
      //  System.out.println("Current time: " + var1);
      //  cd.setTime(23, 0);
      //  String var2 = cd.getTime();
      //  System.out.println("Now time: " + var2);
       // cd1 = new ClockDisplay();
       // String var3 = cd1.getTime();
       // System.out.println("Current time: " + var3);
  //  }
