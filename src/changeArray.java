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
        Scanner scan = new Scanner(System.in);
        String myStr = "Peach Berry  Orange  WaterMelon Orange";
        String[] UseThisArray = myStr.split(" ");

        for (int i = 0; i < UseThisArray.length ; i++) {
            if(UseThisArray[i].contains("Orange")){
                UseThisArray[i]="Apple";
            }


        }
        System.out.println(Arrays.toString(UseThisArray));
    }






}