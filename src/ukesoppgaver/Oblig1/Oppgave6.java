package ukesoppgaver.Oblig1;

import ukesoppgaver.Uke2.Tabell;

import java.util.Arrays;

public class Oppgave6 {

    public static void rotasjon(char[] a, int k)             // 2. versjon
    {
        int n = a.length;
        if (n < 2) return;                                     // tomt eller en verdi

        if ((k %= n) < 0) k += n;                              // motsatt vei?

        for (int v = 0, h = n - 1; v < h; Tabell.bytt(a, v++, h--));// snur a[a:n>
        for (int v = 0, h = k - 1; v < h; Tabell.bytt(a, v++, h--));  // snur a[0:d>
        for (int v = k, h = n - 1; v < h; Tabell.bytt(a, v++, h--));  // snur a[d:n>
    }
    public static void main(String[] args) {

        char[] a = {'A','B','C','D','E','F','G','H','I'};

        rotasjon(a,-1);
        System.out.println(Arrays.toString(a));






    }

}
