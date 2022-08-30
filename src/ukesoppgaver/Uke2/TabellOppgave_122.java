package ukesoppgaver.Uke2;

import java.util.Arrays;
import java.util.Random;

public class TabellOppgave_122 {

    private TabellOppgave_122() {}

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            bytt(a,k,i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }

    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--)
        {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);
        }
    }

    public static int maks(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a,0,a.length);     // kaller metoden over
    }

    public static void bytt(char[] c, int i, int j){

        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;

    }

    public static void skriv(int[] a, int fra, int til){

        for (int i = fra; i < til; i++){



            if (a[i] == a[til-1]){
                System.out.print(a[i]);
                break;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void skriv(int[] a){

        skriv(a,0, a.length);

    }

    public static void skrivln(int[] a, int fra, int til){

        for (int i = fra; i < til; i++){



            if (a[i] == a[til-1]){
                System.out.print(a[i] + "\n");
                break;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void skrivln(int[] a){
        skrivln(a,0,a.length);
    }



    public static void main(String ... args){      // hovedprogram

        int[] a = {1,2,3,4,5,6,7,8,9};
        skriv(a);
        skrivln(a);
        skriv(a,0,a.length);
        skrivln(a,0,a.length);




    } // main

}
