package ukesoppgaver.Oblig1;

public class Oppgave2 {

    public static int antallUlikeSortert(int[] a) {
        //throw new UnsupportedOperationException();

        int ulike = 1;

        if (a.length==0){
            ulike=0;
        }

        for (int i = 1; i < a.length; i++) {

            if (a[i]<a[i-1]){
                throw new IllegalStateException("LISTEN ER IKKE SORTERT");
            }

            if (a[i-1] != a[i]) {
                ulike++;


            }
        }
        return ulike;


    }

}
