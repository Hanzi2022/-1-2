// сортировка работает даже с дублями
public class SortArray {
    public static void main(String[] args) {
        int[] array = {5,6,3,2,5,1,4,9};
        int temp;
        for (int i=0; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}