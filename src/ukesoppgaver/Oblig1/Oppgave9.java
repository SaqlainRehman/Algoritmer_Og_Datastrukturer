package ukesoppgaver.Oblig1;

import java.util.Arrays;

import static ukesoppgaver.Oblig1.Oppgave8.indekssortering;

public class Oppgave9 {

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public static int[] nestMinst(int[] a) // ny versjon
    {

        if (a.length < 3) throw      // må ha minst to verdier
                new java.util.NoSuchElementException("a.length(" + a.length + ") < 2!");

        int [] b = Arrays.copyOf(a,3);

        b = indekssortering(b);

        int minst = b[0];      // m er posisjonen til største verdi
        int nest = b[1]; // nm er posisjonen til nest største verdi
        int tredje= b[2]; //nnm er posisjonen til nest nest minst verdi

        int minverdi = a[minst];                // minst verdi
        int nestminverdi = a[nest];           // nest minst verdi
        int nestnestminverdi=a[tredje];             // nest nest minst verdi


        for (int i = 3; i < a.length; i++) {
            if(a[i] < nestnestminverdi) {
                if (a[i] < nestminverdi) {
                    if (a[i] < minverdi) {

                        tredje = nest;
                        nestnestminverdi = nestminverdi; //ny nest nest minst

                        nest = minst;
                        nestminverdi = minverdi;     // ny nest minst

                        minst = i;
                        minverdi = a[i]; // ny minst

                    } else {
                        tredje = nest;
                        nestnestminverdi = nestminverdi;

                        nest = i;
                        nestminverdi = a[i];         // ny nest minst
                    }

                }else {
                    tredje = i;
                    nestnestminverdi = a[i];
                }
            }
        } // for

        return new int[] {minst,nest,tredje}; // n i posisjon 0, nm i posisjon 1, nnm i posisjon 2

    } // nestMaks

    public static void main(String[] args) {

        int[] x = {6,1,3,4,0,7,2};
        System.out.println(Arrays.toString(nestMinst(x)));

    }

}
