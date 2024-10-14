import java.util.ArrayList;

public class Stack <T>{
    private ArrayList<T> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void push(T item){
        elements.add(item); 
    }

    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack Rong");
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack Rong"); 
        }
        return elements.get(elements.size() - 1);  
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek());  

        System.out.println("Pop: " + stack.pop());  

       
        System.out.println("Is empty ? " + stack.isEmpty()); 

        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Pop: " + stack.pop()); 

        System.out.println("Is empty ? " + stack.isEmpty());
    }
}
