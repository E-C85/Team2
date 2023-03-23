import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */


    /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevirip arrayı print eden code create ediniz.

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result  : Peach , Berry , Apple , WaterMelon , Apple

     */
    public static void main(String[] args) {

      //  Scanner scan = new Scanner(System.in);
       // System.out.println(" meyve giriniz");
       // String myStr = scan.nextLine();String[] UseThisArray = myStr.split(" ");
      //String UseThisArray[]={"Apple","Orange","Kiwi","Peach","Orange"};
      //System.out.println(Arrays.toString(UseThisArray)+ " ");
      //for (int i = 0; i < UseThisArray.length ; i++) {
      //    if(UseThisArray[i].equals("Orange ")){
      //        UseThisArray[i]="Apple";
      //    }
      //}
      // for (String meyve:UseThisArray) {
      //     System.out.print(meyve);
      // }
        String[] fruits = {"Peach", "Berry", "Orange", "WaterMelon", "Orange"};

        for (int i = 0; i < fruits.length ; i++) {
            if (fruits[i].equals("Orange")){
                fruits[i]="Apple";
            }

        }

        for (String meyve:fruits) {
            System.out.print(meyve+" ");

        }

    }
}