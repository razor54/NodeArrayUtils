package ArrayUtils;

/**
 * Created by andre on 17/01/2017.
 */
public class ArrayUtils {




    public static boolean oneswappedElem(int array[]){
        int counter=1;
        for (int i = array.length-1; i >0 ; i--) {


            if(array[i]>array[i-1])continue;


            int k=i-1;
            while (k>=0 && array[i]<array[k]) {
                k--;
                counter++;
            }

            swap(i,k,array);

        }

        return counter==2;

    }

    private static void swap(int i, int i1,int[]array) {
        int aux=array[i];
        array[i]=array[i1];
        array[i1]=aux;
    }

}
