public class TimeCalc {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addedminutes = Integer.parseInt(args[1]);
        int updatedhours = hours + addedminutes / 60;
        int updatedminutes = minutes + addedminutes  % 24;
        //Not completed yet
     if (updatedhours>=24) {
        updatedhours = updatedhours%24;
        
     } else{}

     if (updatedminutes>=60) {
        updatedminutes = updatedminutes%60;
        
     }
     System.out.println(updatedhours + ":" + updatedminutes);

    }
}
