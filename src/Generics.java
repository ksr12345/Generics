public class Generics {
    public void PrintMax(int a, int b, int c){
        if (a>b){
            if (a>c){
                System.out.println(a +" is max.");
            } else {
                System.out.println(c +" is max.");
            }
        } else {
            if (b>c){
                System.out.println(b +" is max.");
            } else {
                System.out.println(c +" is max.");
            }
        }
    }

    public static void main(String[] args) {
        Generics max = new Generics();
        //TestCase1
        max.PrintMax(2,3,4);
        //TestCase2
        max.PrintMax(2,4,3);
        //TestCase3
        max.PrintMax(4,2,3);
    }
}
