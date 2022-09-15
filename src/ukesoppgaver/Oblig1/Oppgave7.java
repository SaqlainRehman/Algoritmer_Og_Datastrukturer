package ukesoppgaver.Oblig1;

public class Oppgave7 {

    public  static  String  flett(String  s,  String  t){

        String ut = "";

        for (int i = 0; i < t.length(); i++){

            ut += s.charAt(i);
            ut += t.charAt(i);

        }

        for (int j = t.length(); j < s.length(); j++){
            ut += s.charAt(j);
        }
        return ut;
    }

    public static void main(String[] args) {

        System.out.println(flett("ABCDEF", "FG"));

    }
}
