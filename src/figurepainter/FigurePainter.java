package figurepainter;

import java.util.Scanner;

public class FigurePainter {
    /**
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */

  public void figureOne(int count) {
          for (int i = 0; i < count; i++) {
              for (int j = 0; j < i + 1; j++) {
                  System.out.print("* ");
              }
              System.out.println();
          }
    }


    /**
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     */


   public void figureTwo(int counth, int x) {
        for (int i = 0; i < counth; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */

    public void figureThree(int count,  int x) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     */

   public void figureFour(int count, int x) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < x - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*
     *
     * * *
     * * * * *
     * * * * * * *
     * * * * * * * * *

     */

   public void figureFive(int count, int x) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }





    /*


     * * * * * * * * *
     * * * * * * *
     * * * * *
     * * *
     *



     */

  public    void figureSix(int count,  int x) {
        for (int i = count; i > 0; i--) {
            for (int j = 0; j < x - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*



     *
     * * *
     * * * * *
     * * * * * * *
     * * * * * * * * *
     * * * * * * * * *
     * * * * * * *
     * * * * *
     * * *
     *




     */

  public   void figureSeven(int count,  int x) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = count; i > 0; i--) {
            for (int j = 0; j < x - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static class ScannerExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please input a");
            int a = scanner.nextInt();
            System.out.println("please input b");
            int b = scanner.nextInt();
            System.out.println("sum " + a + b);

        }
    }
}