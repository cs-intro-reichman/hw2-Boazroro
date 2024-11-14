public class TimeCalc {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addedminutes = Integer.parseInt(args[1]);
        int updatedhours = hours + addedminutes / 60;
        int updatedminutes = minutes + addedminutes % 60;
        if (hours >= 24) {

            updatedhours = hours % 24;

        } 
        else {
        }
        if (minutes > 60) {
            updatedminutes = minutes%60;

        }
        System.out.println(updatedhours + ":" + updatedminutes);

    }
}
