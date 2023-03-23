public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayinin min number print eden code create ediniz.

     */




    public static void main(String[] args) {

        int [][] arr={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

        int min =arr[0][0];

<<<<<<< HEAD

    }
=======
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]<min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Minimum value is 2D array is  : "+min);
}
>>>>>>> 42276afd773cb67cfcab494f2c21f1fb019e950d

}
