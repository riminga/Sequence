import java.util.Random;
import java.util.Scanner;

public class SequenceGenerator {
   private int [] arr;
    Scanner scanner = new Scanner(System.in);
    private SequenceObserver loger;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public SequenceGenerator(SequenceObserver loger) {
        this.loger = loger;
    }

    public int[]  generator(){
        System.out.println("Введите размер числовой  последовательности");
        int size = scanner.nextInt();
         loger.info("Вводим размер массива");
        int array[] = new int[size];
        System.out.println("Введите числа");
        loger.info("Вводим числа ");
        for (int i =0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }


        for (int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        loger.info("выводим числа массива ");
        setArr(array);
        return array;
    }

}
