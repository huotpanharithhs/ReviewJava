package review;

public class TestVariable {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a + 1.0);
        int c = 6;
        if(c == (a+1.000000001)){

        }
        double b = 6.4;
        System.out.println((int)b);
    }
}
