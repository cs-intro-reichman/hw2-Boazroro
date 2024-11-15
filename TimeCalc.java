public class TimeCalc {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addedminutes = Integer.parseInt(args[1]);
        int total = hours * 60 + minutes + addedminutes;
        int updatedhours = total / 60;
        int updatedminutes = total % 60;
        if (updatedhours >= 24 || updatedhours == 0) {
            updatedhours = updatedhours % 24;

        } else {
        }
        if (updatedminutes <= 10 && (updatedhours == 0 || updatedhours < 10)) {
            System.out.println("0" + updatedhours + ":" + "0" + updatedminutes);
        } else if (updatedminutes <= 10 && updatedhours < 10) {

            System.out.println(updatedhours + ":" + "0" + updatedminutes);
        } else if (updatedhours == 0) {

            System.out.println("0" + updatedhours + ":" + +updatedminutes);
        } else if (updatedhours < 10) {
            System.out.println("0" + updatedhours + ":" + updatedminutes);

        } else if (updatedminutes == 0) {
            System.out.println(updatedhours + ":" + "0" + updatedminutes);
        } else {
            System.out.println(updatedhours + ":" + updatedminutes);
        }

    }

}
