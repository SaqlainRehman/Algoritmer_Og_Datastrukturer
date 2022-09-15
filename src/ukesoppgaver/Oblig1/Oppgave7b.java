package ukesoppgaver.Oblig1;

public class Oppgave7b {

    public  static  String  flett(String...  s){

        int lengde = s.length;
        String ut = "";
        int bokstaver = 0;

        for(int i = 0; i < s.length; i++){
            if (s[i].length() > bokstaver){
                bokstaver = s[i].length();
            }
        }

        for (int i = 0; i < bokstaver; i++){
            for (int j = 0; j<s.length; j++){
                if (s[i].length()>i){
                    ut += s[j].charAt(i);
                }
            }
        }

        return ut;
    }

    public static void main(String[] args) {

        String s = flett("AM","L","GEDS","ORATKRR","","RTRTE","IO","TGAUU");

        System.out.println(s);

    }

}
