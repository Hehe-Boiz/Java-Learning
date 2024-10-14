public class Pair <T, U> {
    private T first;
    private U second;

    
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }
    
    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "One");
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());

        Pair<String, Double> anotherPair = new Pair<>("PI", 3.14);
        System.out.println("First: " + anotherPair.getFirst());
        System.out.println("Second: " + anotherPair.getSecond());
    }
}
