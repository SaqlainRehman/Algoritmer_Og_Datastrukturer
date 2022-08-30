package ukesoppgaver.Uke1;

import java.util.Arrays;

public class MinMaks {

    public static int[] minmaks(int[] a){

        int m1=0;
        int m2=0;
        int teller=0;

        for (int i = 0; i < a.length; i++){

            if (a[m1]<a[i]) {
                m1 = i;
                teller++;
            }


        else if (a[m2]>a[i]){
            m2 = i;
            teller++;
        }


        }

        return new int[]{m1,m2};
    }

    public static void main(String[] args) {
        int[] a = {1,2};

        System.out.println(Arrays.toString(minmaks(a)));

    }

}
