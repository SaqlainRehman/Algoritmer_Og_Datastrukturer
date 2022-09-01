package ukesoppgaver.Uke2;

import org.w3c.dom.ranges.RangeException;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Tabell {

    private Tabell() {}

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
        lengdeKontroll(a);
        fratilKontroll(a.length,fra,til);

        if (fra == til) {
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");
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

       skriv(a,0,a.length);
        System.out.println();
    }

    public static void skrivln(int[] a){
        skrivln(a,0,a.length);
    }

    public static void fratilKontroll(int tablengde, int fra, int til) {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }

    public static void vhKontroll(int tablengde, int v, int h) {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

    public static void lengdeKontroll(int[] a){
        if (a.length == 0){
            throw new IllegalArgumentException("Lengden på tabellen er null");
        }
    }




        public static void main(String[]  args){      // hovedprogram
        /*
            int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
            for (int k : a) System.out.print(k + " ");  // skriver ut a

            int m = Tabell.maks(a);   // finner posisjonen til største verdi

            System.out.println("\nStørste verdi ligger på plass " + m);

         */

            int[] a = {1,2,3,4,5,7,8,9};
            skrivln(a);
            skriv(a,0,a.length);
            skrivln(a,0,a.length);
            skriv(a);

    } // main






}
