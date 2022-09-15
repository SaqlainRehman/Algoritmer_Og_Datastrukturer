package ukesoppgaver.Oblig1;

public class Oppgave3 {

    public static int antallUlikeUsortert(int[] a){

        int antallUlike = 0;

        if (a.length == 0){

            return antallUlike;

        }



        for (int i = 0; i < a.length; i++){

            for (int j = i+1; j < a.length; j++){
                if (a[i] == a[j]){
                    antallUlike++;
                    break;
                }


                }

            }


        return a.length-antallUlike;

    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        int antall = antallUlikeUsortert(a);

        System.out.println(antall);

    }

}
