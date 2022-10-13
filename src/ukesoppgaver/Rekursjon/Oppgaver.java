package ukesoppgaver.Rekursjon;

public class Oppgaver {

    public static int tverrsum(int n)              // n må være >= 0
    {
        int sum = 0;

        while (n > 0){

           sum += n % 10;
           n/=10;

        }

        return sum;

    }

    public static int euklid(int a, int b)
    {
        //System.out.println("euklid(" + a + "," + b + ") starter");

        if (b == 0) return a;
        int r = a % b;
        System.out.println("euklid(" + b + "," + r + ") starter");

        return euklid(b,r);       // rekursivt kall
    }

    public static int sifferrot(int n)
    {
        while (n >= 10){n = tverrsum(n);}
        return n;
    }

    public static int sum(int[] a, int n)   // summen av de n første
    {
        if (n == 1) return a[0];       // summen er verdien selv
        return sum(a,n-1) + a[n-1];    // summen av de n-1 første + a[n-1]
    }

    public static int factorial(int n){

        if (n == 1){
            return 1;
        }

        return n * factorial(n-1);
    }

    public static int fib(int n)         // det n-te Fibonacci-tallet
    {
        if (n <= 1) return n;              // fib(0) = 0, fib(1) = 1
        else return fib(n-1) + fib(n-2);   // summen av de to foregående
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(sum(a,1));

    }


}
