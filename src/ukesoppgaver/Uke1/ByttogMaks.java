package ukesoppgaver.Uke1;

public class ByttogMaks {

    public static void bytt(int[] a, int i, int j){

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static int maks(int[] a){

        int maks = a[0];

        for(int i = 1; i < a.length; i++){

            if (a[i] > maks){
                maks = a[i];
            }

        }
        return maks;
    }

    public static void main(String[] args) {

        int[] a = {2,3,4,6,7,1,5};

        for (int i = a.length; i > 1; i--){

            int maks = maks(a);
            bytt(a, i-1, maks);


        }

        for (int i = 0; i < a.length-1;i++){

            System.out.println(a[i]);

        }




    }

}
