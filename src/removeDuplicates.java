import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicates {

    /*
        Given int array

        remove the duplicated values from the array

        print non-duplicated array length

        for example:

        Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
        result should be 5

        NOTE: while printing the result dont use for loop

     */


    /*
       Verilen int array için
       duplicated(tekrarlanan) öğeleri array den silip
      non-duplicated(tekrarlanmayan) eleman  sayisini print eden code create ediniz

       Örnek:
       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

       result  5

       NOT: resultu print ederken for loop kullanmayın

    */
    public static void main(String[] args) {

      //  Scanner scan = new Scanner(System.in);

       // String myStr = scan.nextLine();

       // String[] arr = myStr.split(" ");

        int[] arr = {1,2,2,2,3,3,3,4,4,4,5,5,5};


        // Remove duplicated values from the array
        int[] uniqueArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < count; j++) {
                if (arr[i] != uniqueArr[j]) {

                    count=arr[i];

                }
            }



            //int num = Integer.parseInt(arr[i]);


          //  useThisArray[i] = num;


        //System.out.println(top);

        // code start here
        // dont change anything before this line
        // your Array is useThisLine

        // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
        //   useThisLine arrayini kullan
        }
        System.out.println(count);

    }
}
