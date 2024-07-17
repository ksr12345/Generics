public class Generics {
    public <E extends Comparable<E>> void PrintMax(E a, E b, E c){
        if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
            System.out.println(a + " is max.");
        } else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
            System.out.println(b + " is max.");
        } else {
            System.out.println(c + " is max.");
        }
    }

    public static void main(String[] args) {
        Generics max = new Generics();
        //TestCase1
        max.PrintMax(2,3,4);
        //TestCase2
        max.PrintMax(2.5f,4.2f,3.7f);
        //TestCase3
        max.PrintMax("Banana", "Peach", "Apple");
    }
}
