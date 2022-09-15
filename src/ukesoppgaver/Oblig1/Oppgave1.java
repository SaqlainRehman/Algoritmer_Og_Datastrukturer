package ukesoppgaver.Oblig1;

import java.util.NoSuchElementException;

public class Oppgave1 {
    public static int maks(int[] a) {

        int maks = 0;

        int forelopig;
        if (a.length<1){
            throw new NoSuchElementException("Arrayet er tomt");
        }
        else if (a.length==1){
            maks=a[0];
        }


        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) {
                forelopig = a[i];
                a[i] = a[i-1];
                a[i-1] = forelopig;
            }
            maks=a[i];
        }

        return maks;
    }



    public static int ombyttinger(int[] a) {


        int forelopig;
        int antallBytt=0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) {
                forelopig = a[i];
                a[i] = a[i-1];
                a[i-1] = forelopig;

                antallBytt++;
            }
        }
        return antallBytt;
    }
}
