import java.util.Scanner;

public class MainClass {


    public static boolean is_div_by_3(int x){

        return ((x % 3) ==0);
    }


    public static boolean is_div_by_5(int x){

        return ((x % 5) ==0);
    }
    public static boolean is_div_by_7(int x){

        return ((x % 7) ==0);
    }

    public static String compute (String s){

        String result="";
        // DIVISIBLE BLOCK

        if (is_div_by_3(Integer.valueOf(s))){
            result+="Foo";
        }

        if (is_div_by_5(Integer.valueOf(s))){
            result+="Bar";
        }

        if (is_div_by_7(Integer.valueOf(s))){
            result+="Qix";
        }

        //DIVISIBLE DIGIT BLOCK
            for (int i = 0,n=s.length();i<n;i++){

        if (is_div_by_3(Integer.valueOf(Character.toString(s.charAt(i))))){

            result += "Foo";
        }
        if (is_div_by_5(Integer.valueOf(Character.toString(s.charAt(i))))){
             result+="Bar";
          }
        if (is_div_by_7(Integer.valueOf(Character.toString(s.charAt(i))))){
             result+="Qix";
            }
            }

        return result;
    }



    public static void main(String[] args) {
        String s="";
        boolean problem=false;
do {

        try {

            System.out.println("Donner la chaine à tester");

            Scanner sc = new Scanner(System.in);
            s=sc.nextLine();

            Integer.parseInt(s);
            System.out.println(compute(s));
            s="";
        }catch (Exception e){

            System.out.println("erreur de conversion , verifier la chaine saisie");
            problem=true;
        }

}while (problem=true);

    }


}
