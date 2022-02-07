package Bolum4.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {5,55,32,8,79,2,-12};
        reverseArray(array);
        for (int i : array) {
            System.out.print(i + " ");
            
        }
    }

    public static void reverseArray(int[] array){ //tersten yazdırma
        int right = array.length-1;
        int left = 0;
        while (left<=right) {
                    swap(array,left,right);
                    left++;
                    right--;
                }
            }
    public static void reverseArray1(int[] array){
        for (int i =0; i < array.length; i++) {
            for (int j = array.length-1; i <= j; j--) {
                swap(array,i,j);
            }
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
