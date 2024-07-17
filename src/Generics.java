public class Generics {
    public void PrintMax(String a, String b, String c){
        if (a.length()>b.length()){
            if (a.length()>c.length()){
                System.out.println(a +" is max.");
            } else {
                System.out.println(c +" is max.");
            }
        } else {
            if (b.length()>c.length()){
                System.out.println(b +" is max.");
            } else {
                System.out.println(c +" is max.");
            }
        }
    }

    public static void main(String[] args) {
        Generics max = new Generics();
        //TestCase1
        max.PrintMax("Apple", "Peach", "Banana");
        //TestCase2
        max.PrintMax("Apple", "Banana", "Peach");
        //TestCase3
        max.PrintMax("Banana", "Peach", "Apple");
    }
}
