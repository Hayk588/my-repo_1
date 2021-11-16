package arrayutil;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {


    //1.Տպեք մասիվի բոլոր էլեմենտները,
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //2.Տպեք մասիվի ամենամեծ թիվը,
    public int printMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    //2.2
    public int getMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    //3.Տպեք մասիվի ամենափոքրը թիվը
    public int printMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //3.2
    public int getMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    //4.Տպեք մասիվի բոլոր զույգ էլեմենտները,

    public void printPairsElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }


    //4.2
    public void getPairsElementsIndexs(int[] array) {
        int pairsIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pairsIndex = i;
                System.out.print(pairsIndex + " ");
            }
        }
    }

    //5.Տպեք մասիվի բոլոր կենտ էլեմենտներ@
    public void printOddElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }


    //5.2
    public void getOddElelemntsIndexs(int[] array) {
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddIndex = i;
                System.out.print(oddIndex + " ");
            }
        }
    }

    //6.Տպեք զույգերի քանակը։
    public int printPairsElementsCounts(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //7.Տպեք կենտերի քանակը
    public int printOddElementsCounts(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //9.Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
    public double printMijinTvabanakan(int[] array) {
        double sum = 0;
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            sum += array[i];
        }
        return sum / count;
    }

    //10.Տպեք մասիվի էլեմենտների գումարը։
    public int printArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public void printSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


    public boolean pairsArray(int[] array) {
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                b = true;
            }
        }
        return b;
    }

    public void printKrknvox(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] == array[j + 1]) {
                    System.out.println(array[i] + " krknvum e ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char e = (char) scanner.nextInt();
        System.out.println(e);
    }
}