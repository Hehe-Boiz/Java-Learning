public class Swap {
    public static <T> void swap(T[] array, int index1, int index2){
        if(index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length){
            T temp = array[index2];
            array[index2] = array[index1];
            array[index1] = temp;
        } else throw new IndexOutOfBoundsException("Chi so khong hop le");
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        swap(intArray, 1, 3);

        System.out.println("\nAfter: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
