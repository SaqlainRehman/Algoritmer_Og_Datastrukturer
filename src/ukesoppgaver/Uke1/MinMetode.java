package ukesoppgaver.Uke1;

public class MinMetode {

    public static int min(int[] a){

        int maks = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > maks){

                maks = a[i];

            }

        }

        int indeks = 0;

        for (int i = 0; i < a.length; i++){

            if (a[i] == maks) {
                indeks = i;
            }

        }

        return indeks;

    }

    public static void main(String[] args) {

        int[] liste = {10,6,56,2,4,5,1,3,56,7,56};

        int maks = min(liste);

        System.out.println(maks);

    }

}
