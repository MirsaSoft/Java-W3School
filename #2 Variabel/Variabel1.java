public class Variabel1 {
    public static void main(String[] args){
        String myText = "Mirsa"; // String
        int myNum = 101; // Integer (Whole Number)
        float myfloatNum = 1.33f; // Floating point number
        char myLetter = 'W'; //Character
        boolean myBool = true; // Boolean

        System.out.println("======================");
        System.out.println(myText);
        System.out.println(myNum);
        System.out.println(myfloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println("======================");

        System.out.println("This Create by : " + myText);

        System.out.println("======================");
        int x = 10;
        int y = 101;
        int a = 11, b = 1000, c = 100;
        System.out.print("x + y = ");
        System.out.println(x + y);
        System.out.println("x + y = " + x + y);
        System.out.println(a + b + c);
        System.out.println("======================");

        char myVar1 = 5, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println("======================");
        // Casting secara manual
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1;
        // Explicit casting: double to int
        System.out.println(myDouble1);
        System.out.println(myInt1);
        System.out.println("======================");
        // Casting secara otomatis
        int myInt2 = 9;
        double myDouble2 = myInt2;
        // Casting int to double
        System.out.println(myInt2);
        System.out.println(myDouble2);
    }
}
