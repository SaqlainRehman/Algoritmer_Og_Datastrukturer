package ukesoppgaver.Oblig1;

public class Oppgave10 {

    public static boolean inneholdt(String a, String b) {

        long [] teller1 = new long [29];
        long [] teller2 = new long [29];

        if(a.length()== 0 || a.equals(b)){
            return true;
        }

        char[] bokstaver = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','Æ','Ø','Å'};


        for (int i=0; a.length()>i; i++){
            for (int j=0; bokstaver.length>j; j++){
                if(a.charAt(i) == bokstaver[j]) {
                    teller1[j] = teller1[j];
                }
            }
        }
        for(int i=0 ; i<b.length(); i++){
            for (int j = 0 ; j<bokstaver.length;j++) {
                if (b.charAt(i)==bokstaver[j]){
                    teller2[j]= teller2[j] +1;
                }
            }
        }
        for (int i=0; teller1.length>i; i++){

            if (teller1[i]>teller2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        boolean test = inneholdt("ABBA","BABA");
        System.out.println(test);

    }

}
