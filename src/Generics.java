public class Generics {
    public void PrintMax(float a, float b, float c){
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
        max.PrintMax(2.3f,3.5f,4.6f);
        //TestCase2
        max.PrintMax(2.5f,4.2f,3.7f);
        //TestCase3
        max.PrintMax(4.4f,2.9f,3.2f);
    }
}
