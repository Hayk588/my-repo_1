package chararray;

public class CharArray {


//        1) Ունենք հետևյալ մասիվը՝
//        char[] bolola = {'b','o','l','o','l','a'};
//        ունենք նաև մի սինվոլ՝ char c = 'o';
//        Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
           int printCount(char[]array, char c) {
               int count = 0;
               for (int i = 0; i < array.length; i++) {
                   if (array[i] == c) {
                       count++;
                   }
               }
               return count;
           }

//        2) Ունենք հետևյալ մասիվը՝
//        char[] bolola = {'b','o','l','o','l','a'};
//        պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
//        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};

    void twoSymvol(char[] bolola) {
        System.out.println(bolola[bolola.length / 2]);
        System.out.print(bolola[bolola.length / 2 - 1] + " ");
    }


    //        3) Ունենք հետևյալ մասիվը՝՝
//        char[] bolola = {'b','o','l','o','l','a'};
//        պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
    void printArray(char[] bolola) {
        if (bolola[bolola.length - 1] == 'y' && bolola[bolola.length - 2] == 'l') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //        4) Ունենք հետևյալ մասիվը՝
//        char[] bolola = {'b','a',b','o','l','a'};
    ///Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
    ////օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
    boolean printBob(char[] array) {
        boolean b = false;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 'b' && array[i + 2] == 'b') {
                b = true;
                break;
            }
        }
        return b;
    }

    void charArray(char[] array) {
        char[] bolola = {' ', ' ', ' ', ' ', 't', 'o', 'a', 'b', 'b', 'b', ' ', ' '};
        int startIndex = 0;
        int endIndex = bolola.length - 1;

        while (startIndex < endIndex && bolola[startIndex] == ' ') {
            startIndex++;
        }
        while (startIndex < endIndex && bolola[endIndex] == ' ') {
            endIndex--;
        }

        char[] result = new char[(endIndex - startIndex) + 1];
        int index = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = bolola[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
