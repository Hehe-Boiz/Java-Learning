
import java.util.Arrays;

public class GenericArrayList<T> {
    private Object[] elements;
    private int size = 0;

    public GenericArrayList() {
        elements = new Object[10];
    }

    public void add(T item) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = item;
    }

    public void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void remove(T item) {
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(item)){
                for(int j=i;j<size;j++){
                    elements[j] = elements[j+1];
                }
                elements[--size] = null;
                return;
            }
        }
        System.out.println("Khong tim thay");
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        if(index >=0 && index < size){
            return (T) elements[index];
        }
        throw new IndexOutOfBoundsException("Chi so khong hop le");
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        GenericArrayList<String> list = new GenericArrayList<>();
        
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Phần tử tại chỉ số 1: " + list.get(1));
        System.out.println("Số lượng phần tử: " + list.size());


        list.remove("Python");
        System.out.println("Sau khi xóa: Số lượng phần tử: " + list.size());
    }
}