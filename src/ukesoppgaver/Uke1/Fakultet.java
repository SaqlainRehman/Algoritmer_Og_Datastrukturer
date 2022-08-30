package ukesoppgaver.Uke1;

public class Fakultet {

    public static void main(String[] args) {


        int n = 6;
        int x = (n-1);
        int fakultet = 1;
        int ops = 0;

        for (int i = n; i > 0; i--){

            fakultet *= n;
            n = n - (n-x);
            x--;
            ops++;
        }

        System.out.println(n+" fakultet er lik: "+fakultet+ ". Antall multipli");



    }

}
