package chapter3;

public class Lesson3 {
    public static void main(String[] args) {

//        int lightspeed;
//        long days;
//        long seconds;
//        long distance;
//
//        lightspeed = 186000;
//
//        days = 1000;
//
//        seconds = days * 24 * 60 * 60;
//
//        distance = lightspeed * seconds;
//
//        System.out.print("Зa " + days);
//        System.out.print(" дней свет пройдет около");
//        System.out.println(distance + " миль.");


//=============================================================

//        double pi, r, a;
//
//        r = 10.8;
//        pi = 3.1416;
//        a = pi * r * r;
//
//        System.out.println("Плoщaдь круга равна " + a);
//
//
//        char ch1, ch2;
//
//        ch1 = 88;
//        ch2 = 'Y';
//
//        System.out.println("chl и ch2: ");
//        System.out.println(ch1 + " " + ch2);


//        char ch1;
//
//        ch1 = 'X';
//        System.out.println("ch1 содержит " + ch1);
//
//        ch1++;
//        System.out.println("ch1 теперь содержит " + ch1);
//


//        boolean b;
//
//        b = false;
//        System.out.println("b = " + b);
//        b = true;
//        System.out.println("b = " + b);
//
//        if (b) {
//            System.out.println("Этoт код выполняется.");
//        }
//        b = false;
//        if (b) {
//            System.out.println("Этoт код не выполняется");
//        }
//
//        System.out.println("10 > 9 == " + (10 > 9));


//        double a = 3.0, b = 4.0;
//
//        double c = Math.sqrt((a * a) + (b * b));
//        System.out.println("Гипoтeнyзa равна " + c);


//        byte b;
//        int i = 257;
//        double d = 323.142;
//
//        b = (byte) i;
//        System.out.println("i and b " + i + " " + b);
//
//        i = (int) d;
//        System.out.println("d and i " + d + " " + i);
//
//        b = (byte) d;
//        System.out.println("d and b " + d + " " + b);

//------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                       Triangles


        /*

                                          index                                  elemenys
                                           0                                         1
        *                                  1                                         2
        * *                                2                                         3
        * * *                              3                                         4
        * * * *                            4                                         5
        * * * * *




         */


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("----------------------------------------------------------------------------");



        /*
                                                index                      elemets
                                                  0                          5
        * * * * *                                 1                          4
        * * * *                                   2                          3
        * * *                                     3                          2
        * *                                       4                          1
        *


         */


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("------------------------------------------------------------------------------------------------------------ ");



        /*

                                        index              probels            elements
        *                                0                   4                  1
      * *                                1                   3                  2
    * * *                                2                   2                  3
  * * * *                                3                   1                  4
* * * * *                                4                   0                  5


         */




        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("-------------------------------------------------------------------------------------------------------");


        /*


        * * * * *                         index               probels             elements
          * * * *                            0                   0                   5
            * * *                            1                   1                   4
              * *                            2                   2                   3
                *                            3                   3                   2
                                             4                   4                   1



         */


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }




        System.out.println("----------------------------------------------------------------------------------------------------------------------");



        /*

                                   index                     probels               elements
        *                           0                           4                     1
      * * *                         1                           3                     3
    * * * * *                       2                           2                     5
  * * * * * * *                     3                           1                     7
* * * * * * * * *                   4                           0                     9



         */


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2)  + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("---------------------------------------------------------------------------------------------------------------------");



        /*

                                               index                   probels             elements
        * * * * * * * * *                        0                        0                   9
          * * * * * * *                          1                        1                   7
            * * * * *                            2                        2                   5
              * * *                              3                        3                   3
                *                                4                        4                   1



         */


        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2) - 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("-------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2)  + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
