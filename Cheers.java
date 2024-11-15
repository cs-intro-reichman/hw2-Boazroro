// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String giveme = args[0].toUpperCase();
                String let = "AEFHILMNORSX";
                int n = Integer.parseInt(args[1]);
                int a = 0;

                for (int i = 0; giveme.length() > i; i++) {
                        char cia = giveme.charAt(i);

                        if (let.indexOf(cia) != -1) {

                                System.out.println("Give me an " + giveme.charAt(i) + ": " + giveme.charAt(i)
                                                + "!");

                        } else

                        {

                                System.out.println("Give me a " + giveme.charAt(i) + ": " + giveme.charAt(i)
                                                + "!");
                        }
                }
                        System.out.println("What does that spell?");
                        for (int j = 0; j < n; j++) {
                                System.out.println(giveme + "!!!");

                        }
                

        }
}
