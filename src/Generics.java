public class Generics<E extends Comparable<E>> {

    private final E[] val;

    @SafeVarargs
    public Generics(E... val) {
        this.val = val;
    }

    @SafeVarargs
    public static <E extends Comparable<E>> E findMaximum(E... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        E max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(max) > 0) {
                max = values[i];
            }
        }
        return max;
    }

    public void printMax() {
        E max = findMaximum(val);
        System.out.println("Maximum value is " + max);
    }

    public static void main(String[] args) {
        // Testcase1
        Generics<Integer> maxInt = new Generics<>(10, 5, 8, 15, 3);
        maxInt.printMax();
        // Testcase2
        Generics<Float> maxFloat = new Generics<>(3.5f, 7.2f, 4.9f, 6.1f);
        maxFloat.printMax();
        // Testcase3
        Generics<String> maxString = new Generics<>("Apple", "Peach", "Banana", "Orange");
        maxString.printMax();
    }
}