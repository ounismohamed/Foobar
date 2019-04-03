import java.util.Scanner;

public class MainClass {


    public static boolean is_div_by_3(int x) {

        return ((x % 3) == 0&& x!=0);
    }


    public static boolean is_div_by_5(int x) {

        return ((x % 5) == 0 && x!=0);
    }

    public static boolean is_div_by_7(int x) {

        return ((x % 7) == 0&& x!=0);
    }

    public static String compute(String s) {

        String result = "";
        boolean is_divisible_by_any = true;


        // DIVISIBLE BLOCK
        int x1 = Integer.valueOf(s);
        if (is_div_by_3(x1)) {
            result += "Foo";
        }

        if (is_div_by_5(x1)) {
            result += "Bar";
        }

        if (is_div_by_7(x1)) {
            result += "Qix";
        }

        if (!is_div_by_3(x1) && !is_div_by_5(x1) && !is_div_by_7(x1)) {
            is_divisible_by_any = false;
//            System.out.println("--> detected is dividable by any false");
        }


        //DIVISIBLE DIGIT BLOCK

        if (is_divisible_by_any) {
            for (int i = 0, n = s.length(); i < n; i++) {
//                System.out.println("value of n -->"+n);
                if (s.charAt(i) == '0') {

                    result += "*";
                }
                int x = Integer.valueOf(Character.toString(s.charAt(i)));

//                System.out.println("converted digit-->"+x);

                if (is_div_by_3(x)) {
//                    System.out.println(x+" is divisible by 3");
                    result += "Foo";

                }
                if (is_div_by_5(x)) {
//                    System.out.println(x+" is divisible by 5");
                    result += "Bar";
                }
                if (is_div_by_7(x)) {
//                    System.out.println(x+" is divisible by 7");
                    result += "Qix";
                }

            }
        }
        else
            {
            for (int i = 0, n = s.length(); i < n; i++) {
                if (s.charAt(i) == '0') {

                    result += "*";
                } else {
                    result += s.charAt(i);
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        String s = "";
        boolean problem = false;
        do {

            try {

                System.out.println("Donner la chaine à tester");

                Scanner sc = new Scanner(System.in);
                s = sc.nextLine();

                Integer.parseInt(s);
                System.out.println(compute(s));
                s = "";
            } catch (Exception e) {

                System.out.println("erreur de conversion , verifier la chaine saisie");
                problem = true;
            }

        } while (problem = true);

    }


}
