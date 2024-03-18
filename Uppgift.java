public class Uppgift {
    public static void main(String[] args) {
        int[] array = {5,2,10,6,13,8,16,4,11,3};
        skriv_ut_array(array);
        tal_över_8(array);
        //int tal = 10;
        int retur = hitta_tal(array, 9);
        System.out.println(retur);

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

    static void tal_över_8(int[] array)
    {
        int talöver8 = 0;
        System.out.println("__________");
        for (int i= 0; i < array.length; i++) {
            if(array[i]>=8){
                System.out.println(array[i]);
                talöver8+=1;
            }
        }
        System.out.println(talöver8+" tal är över 8");
        
    }

    static int hitta_tal(int[] array, int tal){
        int index = -1;
        for (int i=0; i<array.length; i++)
        {
            if(array[i]==tal)
            {
                index = i;
            }
        }
        return index;
    }

}
