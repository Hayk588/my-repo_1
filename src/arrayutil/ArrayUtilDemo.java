package arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {451, 22, 54, 26, 98, 20, 1, 36, 6};
        int[] array2 = {451, 22, 54, 26, 98, 20, 22, 36, 6};



        arrayUtil.printArray(array);

        System.out.println();
        System.out.println("=========================================================================================");


        System.out.println(arrayUtil.printMax(array));

        System.out.println();
        System.out.println("=========================================================================================");


        System.out.println(arrayUtil.getMaxIndex(array));


        System.out.println();
        System.out.println("=========================================================================================");

        System.out.println(arrayUtil.printMin(array));


        System.out.println();
        System.out.println("=========================================================================================");


        System.out.println(arrayUtil.getMinIndex(array));

        System.out.println();
        System.out.println("=========================================================================================");


        arrayUtil.printPairsElements(array);


        System.out.println();
        System.out.println("=========================================================================================");


        arrayUtil.getPairsElementsIndexs(array);


        System.out.println();
        System.out.println("=========================================================================================");

        arrayUtil.printOddElements(array);

        System.out.println();
        System.out.println("=========================================================================================");


        arrayUtil.getOddElelemntsIndexs(array);

        System.out.println();
        System.out.println("=========================================================================================");


        System.out.println(arrayUtil.printPairsElementsCounts(array));

        System.out.println();
        System.out.println("=========================================================================================");


        System.out.println(arrayUtil.printOddElementsCounts(array));


        System.out.println();
        System.out.println("=========================================================================================");


        System.out.println(arrayUtil.printMijinTvabanakan(array));


        System.out.println();
        System.out.println("=========================================================================================");


        System.out.println(arrayUtil.printArraySum(array));

        System.out.println();
        System.out.println("=========================================================================================");

        arrayUtil.printSorting(array);

        System.out.println();
        System.out.println("=========================================================================================");

        System.out.println(arrayUtil.pairsArray(array));

        System.out.println();
        System.out.println("=========================================================================================");

        arrayUtil.printKrknvox(array2);

    }
}
