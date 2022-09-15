package ukesoppgaver.Oblig1;

import java.util.Arrays;

public class Oppgave5 {

    public static void rotasjon(char[] a) {

        for (char i = 0; i < a.length-1; i++){
            if (a[i] == a[a.length-1]){
                char temp = a[i];
                a[i] = a[0];
                a[0] = temp;
            }
            char temp = a[0];
            a[0] = a[i+1];
            a[i+1] = temp;
        }
        //throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {

        char[] a = {'A','B','C','D','E','F','G'};

        rotasjon(a);

        System.out.println(Arrays.toString(a));

    }

}
