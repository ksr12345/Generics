public class Generics<E extends Comparable<E>> {
    private final E a;
    private final E b;
    private final E c;

    public Generics(E a, E b, E c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void PrintMax(){
        if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
            System.out.println(a + " is max.");
        } else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
            System.out.println(b + " is max.");
        } else {
            System.out.println(c + " is max.");
        }
    }

    public static void main(String[] args) {
        //Testcase1
        Generics<Integer> maxInt = new Generics<>(2, 3,4);
        maxInt.PrintMax();

        //Testcase2
        Generics<Float> maxFloat = new Generics<>(2.5f,4.2f,3.7f);
        maxFloat.PrintMax();

        //Testcase3
        Generics<String> maxString = new Generics<>("Banana", "Peach", "Apple");
        maxString.PrintMax();
    }
}
