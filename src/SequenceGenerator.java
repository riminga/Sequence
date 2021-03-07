import java.util.Random;
import java.util.Scanner;

public class SequenceGenerator {
   private int [] arr;
    Scanner scanner = new Scanner(System.in);

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    public int[]  generator(){
        System.out.println("Введите размер числовой  оследовательности");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Введите числа");
        for (int i =0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }

        for (int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        setArr(array);
        return array;
    }

}
