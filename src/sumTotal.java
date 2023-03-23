public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       toplamını print eden code create ediniz.

    */
    public static void main(String[] args) {

        // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
        double carp1=0;
       // double carpim=1;
        double carp2 = 0;


        String [][] number={{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j <number[i] .length; j++) {
                if (number [i][j].contains("$")) {
                    number[i][j]=number[i][j].replaceAll("\\D","");
                 carp2+=Integer.parseInt( number[i][j])*3.2;



                }
            }

        }
        System.out.println(carp2);
        String [][] number1={{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};
        for (int i = 0; i < number1.length; i++) {
            for (int j = 0; j <number[i] .length; j++) {
                if (number [i][j].contains("€")) {
                    number[i][j]=number[i][j].replaceAll("\\D","");
                    carp1+=Integer.parseInt( number[i][j])*4.2;



                }
            }

        }


        System.out.println(carp1);

        System.out.println(carp1+carp2);



    }
}




