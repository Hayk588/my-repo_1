package homework;

public class PracticeHomework {


    int calAge(int years) {
        int month = 12;
        years = month * years * 30 + 5;
        return years;

    }


    int convert(int minutes) {
        minutes = minutes * 60;
        return minutes;
    }


    boolean isSameNum(int a, int b) {
        boolean t = false;
        if (a == b) {
            t = true;
            System.out.println(t);
        }
        return t;
    }


    boolean lessThanOrEqualToZero(int number) {
        boolean b = false;
        if (number <= 0) {
            b = true;
            System.out.println(true);
        }
        return b;
    }


    int maxLength(int[] array1, int arr2[]) {
        int maxL = 0;
        if (array1.length > arr2.length) {
            maxL = array1.length;
            System.out.println("maxLength is arr1.lenth ");
        } else {
            System.out.println("maxLentgh is arr2.length ");
        }
        return maxL;
    }


    int nextNumber(int number) {
        number = number + 1;
        return number;
    }

    boolean reverseBool(boolean value) {
        value = value == true ? false : true;

        return value;
    }
}
