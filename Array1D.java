import java.util.Scanner;
public class Array1D {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner scanner =new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("enter"+size+"elements");
        for(int i=0;i<size;i++){
            System.out.println("element"+(i+1)+";");
            array[i]=scanner.nextInt();
        }
        System.out.println("the elements in the array are:");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        scanner.close();
    }
    
}