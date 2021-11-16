package author;

public class AuthorStorage {
    private Author[] array;
    private int size;

    public AuthorStorage(int capacity) {
        array = new Author[capacity];
        this.size = 0;
    }

    public AuthorStorage() {
        array = new Author[10];
    }

    public void add(Author author) {
        if (size >= array.length) {
            extend();
        }
        this.array[size++] = author;
    }

    private void extend() {
        Author[] newArr = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

   public  Author getbyindex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return null;
        }
            return array[index];
   }




    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
