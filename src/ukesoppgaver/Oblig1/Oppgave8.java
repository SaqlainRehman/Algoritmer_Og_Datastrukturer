package ukesoppgaver.Oblig1;

import java.util.Arrays;

import static ukesoppgaver.Uke2.Tabell.bytt;
import static ukesoppgaver.Uke2.Tabell.maks;

public class Oppgave8 {


    public static int[] sortering(int[] a){

        for (int i = a.length; i > 0; i--){

            int m = maks(a,0,i);
            bytt(a,m,i-1);

        }
        return a;
    }


    public static int[] indekssortering(int[] a){

        int[] b = Arrays.copyOf(a, a.length);
        int[] c = sortering(b);

        int[] d = new int[a.length];


        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < c.length; j++){

                if (c[i] == a[j]){
                    d[i] = j;
                }
            }
        }

        return d;

    }

    public static void main(String[] args) {

        int[] a = {1,2,9,3,8,5,4,7,1};
        System.out.println(Arrays.toString(indekssortering(a)));

    }

}
