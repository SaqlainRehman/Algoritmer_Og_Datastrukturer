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

    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }




        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks

    public static int maks(int[] a, int fra, int til)
    {
        lengdeKontroll(a);
        fratilKontroll(a.length,fra,til);




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

        fratilKontroll(a.length,fra,til);
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

        if (fra == til) {
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");
        }
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
        if (a == null){
            throw new IllegalArgumentException("Lengden på tabellen er null");
        }
    }

    public static int[] nestMaks1(int[] a){

        int m = maks(a);
        bytt(a,0,m);

        int nm = maks(a,1, a.length);

        if (nm == m) nm = 0;

        bytt(a,m,0);




        return new int[] {m,nm};

    }

    public static void sortering(int[] a){

        for (int i = a.length; i > 0; i--){

            int m = maks(a,0,i);
            bytt(a,m,i-1);

        }
    }




        public static void main(String[]  args){      // hovedprogram
        /*
            int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
            for (int k : a) System.out.print(k + " ");  // skriver ut a

            int m = Tabell.maks(a);   // finner posisjonen til største verdi

            System.out.println("\nStørste verdi ligger på plass " + m);

         */

            int[] a = {30,2,4,5,1,70,8,9};
            sortering(a);

            System.out.println(Arrays.toString(a));





    } // main






}
