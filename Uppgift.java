public class Uppgift {
    public static void main(String[] args) {
        int[] fält = {5,2,10,6,13,8,16,4,11,3};
        skriv_ut_array(fält);
        tal_över_åtta(fält);

        /* 
        for (int i = 0; i < fält.length; i++) {
            System.out.println(fält[i]);
        }
        */
    }

    static void skriv_ut_array(int[] array)
    {
        for (int i= 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void tal_över_åtta(int[] array)
    {
        System.out.println("__________");
        for (int i= 0; i < array.length; i++) {
            if(array[i]>=8){
                System.out.println(array[i]);
            }
        }
    }
}