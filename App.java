public class App {
    public static void main(String[] args)throws Exception{
        int[] fält = {1,4,3,2,5};
        skriv_ut_array(fält);
        //int tal = 10;
        //reset_tal(tal);
        reset_array(fält);
        //System.out.println(tal);
        skriv_ut_array(fält);

        /* 
        for (int i= 0; i < fält.length; i++) {
            System.out.println(fält[i]);
        }
        */

    }

    static void reset_tal(int talet)
    {
        talet=0;
    }

    static void skriv_ut_array(int[] array)
    {
        for (int i= 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void reset_array(int[] arrayen)
    {
        for (int i = 0; i < arrayen.length; i++) {
            arrayen[i]=0;
        }
    }
}