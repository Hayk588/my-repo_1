package chapter4;

public class Lesson5 {
    public static void main(String[] args) {


        //1 Տպեք մասիվի բոլոր էլեմենտները
//        int[] arr = {5, 18, 64, 21, 789, 3551, 34};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        System.out.println("====================================================================================================================");

        //2 Տպեք մասիվի ամենամեծ թիվը
//        int[] arr1 = {41, 3, 87, 99, 108, 15};
//        int max = arr1[0];
//        for (int i = 0; i < arr1.length; i++) {
//            if (max < arr1[i]) {
//                max = arr1[i];
//            }
//        }
//        System.out.println();

        //2.2
//        int[] arr1 = {41, 3, 87, 99, 108, 15};
//        int index = 0;
//        for (int i = 1; i < arr1.length; i++) {
//            if (arr1[index] < arr1[i]) {
//                index = i;
//            }
//        }
//        System.out.println(index);


        System.out.println("=================================================================================");

        //3 Տպեք մասիվի ամենափոքրը թիվ
//        int[] arr2 = {41, 3, 87, 99, 108, 15};
//        int min = arr2[0];
//        for (int i = 0; i < arr2.length; i++) {
//            if (min > arr2[i]) {
//                min = arr2[i];
//            }
//        }
//        System.out.println(min);


        //3.2
//        int[] arr2 = {41, 3, 87, 99, 108, 15};
//        int index = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[index] > arr2[i]) {
//                index = i;
//            }
//        }
//        System.out.println(index);


        System.out.println("================================================================================================");

        //4 Տպեք մասիվի բոլոր զույգ էլեմենտները
//        int[] arr3 = {41, 3, 87, 99, 108, 15};
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr3[i] % 2 == 0) {
//                System.out.println(arr3[i]);
//            }
//        }

        //4.2
//        int[] arr3 = {41, 3, 87, 99, 108, 15, 1554};
//        int index = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr3[i] % 2 == 0 && index % 2 == 0) {
//                index = i;
//                System.out.print(index + ", ");
//            }
//        }

        System.out.println("===================================================================================");

        //5 Տպեք մասիվի բոլոր կենտ էլեմենտները
//        int[] arr4 = {41, 3, 87, 99, 108, 15, 1554};
//        for (int i = 0; i < arr4.length; i++) {
//            if (arr4[i] % 3 == 0) {
//                System.out.println(arr4[i]);
//            }
//        }


        //5.2
//        int[] arr4 = {2, 15, 32, 45, 88, 99};
//        int index = 0;
//        for (int i = 0; i < arr4.length; i++) {
//            if (arr4[i] % 2 !=0) {
//                System.out.println(i);
//            }
//        }
//
//        System.out.println("==============================================================================");
//

        //6 Տպեք զույգերի քանակը
//        int count = 0;
//        int[] arr5 = {41, 3, 87, 99, 108, 15, 1554};
//        for (int i = 0; i < arr5.length; i++) {
//            if (arr5[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);


        System.out.println("================================================================================");

        //7 Տպեք կենտերի քանակը

//        int[] arr6 = {41, 3, 87, 99, 108, 15, 1554};
//        int count = 0;
//        for (int i = 0; i < arr6.length; i++) {
//            if (arr6[i] % 3 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);


        System.out.println("===============================================================================");


        //8 Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
//        int[] arr7 = {41, 3, 87, 99, 108, 15, 1554};
//        double sum = 0;
//        for (int i = 0; i < arr6.length; i++) {
//            sum += arr6[i];
//        }
//        sum /= arr6.length - 1;
//        System.out.println(sum);

        System.out.println("============================================================================");

        //9 Տպեք մասիվի էլեմենտների գումարը։
//        int[] arr8 = {41, 3, 87, 99, 108, 15, 1554};
//        int sum = 0;
//        for (int i = 0; i < arr8.length; i++) {
//            sum += arr8[i];
//        }
//        System.out.println(sum);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        int month = 4;
//        String season;
//        if (month == 12 || month == 1 || month == 2) {
//            season = "зиме";
//        } else if (month == 3 || month == 4 || month == 5) {
//            season = "весне";
//        } else if (month == 6 || month == 7 || month == 8) {
//            season = "лету";
//        } else if (month == 9 || month == 10 || month == 11) {
//            season = "осени";
//        } else
//            season = "вЬIМЫШЛенным месяцам";
//        System.out.println("Aпpeль относится к " + season + ".");
//

//        for (int i = 0; i < 6; i++) {
//            switch (i) {
//                case 0:
//                    System.out.println("i равно нулю.");
//                    break;
//                case 1:
//                    System.out.println("i равно единице.");
//                    break;
//                case 2:
//                    System.out.println("i равно двум.");
//                    break;
//                case 3:
//                    System.out.println("i равно трем.");
//                    break;
//                default:
//                    System.out.println("i больше трех.");
//            }
//        }
//
//        for (int i = 0; i < 12; i++) {
//            switch (i) {
//                case 0:
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                    System.out.println("i меньше 5");
//                    break;
//                case 5:
//                case 6:
//                case 7:
//                case 8:
//                case 9:
//                    System.out.println("i меньше 10");
//                    break;
//                default:
//                    System.out.println("i равно или больше 10");
//            }
//        }


//        int month = 4;
//        String season;
//        switch (month) {
//            case 12:
//            case 1:
//            case 2:
//                season = "эимe";
//                break;
//            case 3:
//            case 4:
//            case 5:
//                season = "весне";
//                break;
//            case 6:
//            case 7:
//            case 8:
//                season = "лету";
//                break;
//            case 9:
//            case 10:
//            case 11:
//                season = "осени";
//                break;
//            default:
//                season = "вЬ1МЫ1ПЛенным месяцам";
//        }
//        System.out.println("Aпpeль относится к " + season + ".");

//        String str = "два";
//        switch (str) {
//            case "один":
//                System.out.println("один");
//                break;
//            case "два":
//                System.out.println("два");
//                break;
//            case "три":
//                System.out.println("три");
//                break;
//            default:
//                System.out.println("нe совпало");
//                break;
//        }
//

//        int n = 10;
//        while (n > 0) {
//            System.out.println("тaкт " + n);
//            n--;
//        }

//        int i, j;
//
//        i = 100;
//        j = 200;
//
//        while (++i < --j) {
//            System.out.println("Cpeднee значение равно " + i);
//        }
//
//        int n = 10;
//        do {
//            System.out.println("тaкт " + n);
//            n--;
//        } while (n > 0);


    }
}
