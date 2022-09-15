package ukesoppgaver.Oblig1;

import java.util.Arrays;

public class Oppgave4 {

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public static void utvalgssortering(int[] a, int fra, int til){

        int begin = fra;
        int end = til;

        for (int i = begin; i < end; i++)
            bytt(a, i, min(a, i, end));  // to hjelpemetoder

    }

    public static int min(int[] a, int fra, int til)
    {

        int m = fra;              // indeks til største verdi i a[fra:til>
        int minverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra; i < til; i++)
        {
            if (a[i] < minverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                minverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public  static  void  delsortering(int[]  a){

        int left = 0;
        int right = a.length-1;

        for (int i = 0; i < a.length; i++){

            while(right > left && a[left] % 2 != 0){
                left++;
            }

            while(left < right && a[right] % 2 == 0){
                right--;
            }


            int temp = a[left];
            a[left]=a[right];
            a[right] = temp;

        }

        utvalgssortering(a,0,left+1);
        utvalgssortering(a,left,a.length);

    }

    public static void main(String[] args) {

        int[] a = {9, 5, 3, 1, 7};
        int[] b = {1, 3, 5, 7, 9};
        delsortering(a);
        delsortering(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }

}
