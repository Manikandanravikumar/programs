import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i=0; i<size; ++i) {
            array[i] = scan.nextInt();
        }
        int shifts = scan.nextInt();
        for (int i=0; i<shifts; ++i) {
            rotateArray(array);
        }
        for (int a : array) {
            System.out.print(a+" ");
        }
    }

    public static void rotateArray(int[] arr){
        int firstElement = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstElement;
    }
}
