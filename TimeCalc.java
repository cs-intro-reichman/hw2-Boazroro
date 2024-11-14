public class TimeCalc {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addedminutes = Integer.parseInt(args[1]);
        int updatedhours = hours + addedminutes / 60;
        int updatedminutes = minutes + addedminutes % 60;
        if (updatedhours >= 24) {
            updatedhours = updatedhours % 24;

        } else {

        }
        if(updatedhours==23)
        {
            
           String updatedhours1 = "00";
            updatedminutes = updatedminutes % 60;
        System.out.println(updatedhours1 + ":" + "0" + updatedminutes);

        }
    
            
      else if (updatedminutes>59||updatedminutes<10 && updatedhours!=23)

    {
        //updatedminutes = updatedminutes % 60;
       // System.out.println(updatedhours + ":" + "0" + updatedminutes);
    } 

   else System.out.println(updatedhours+":"+updatedminutes);
}}
