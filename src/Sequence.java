import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sequence {
    Scanner sc = new Scanner(System.in);
    int[] arrNum;
    int[] addArr;
    List <String> arrayList = new ArrayList<>();



    public int[] removeByIndex (int[] arr){
        System.out.println("Введите индекс");
        int serchIndex = sc.nextInt();
        int[] newArr = new int[arr.length - 1];
        if(serchIndex < 0 || serchIndex > arr.length) {
            return arr;
        }
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == serchIndex) {
                i++;
            }
            try {
                newArr[j++] = arr[i];
            }catch (Exception e){
                break;
            }

        }
          for (int i = 0; i<newArr.length;i++){
              System.out.print(newArr[i]+" ");
          }
         arrNum = newArr;
        return newArr;
    }

    public void removeByValue(int[] arr) {
        arr = arrNum;
        System.out.println("Введите число для удаления");
        int serchNumber = sc.nextInt();
        int j;
        int i =0;
        int nElemes = arrNum.length;
        nElemes--;
        addArr = new int[nElemes];

        for(j=0; j<nElemes; j++) // Поиск удаляемого элемента
            if (arr[j] == serchNumber)
                break;
            for(int k=j; k<nElemes; k++)  // Сдвиг последующих элементов
            arr[k] = arr[k + 1];
            // Уменьшение размера
        for (j = 0; j < nElemes; j++) { // Вывод элементов
            System.out.print(arr[j] + " ");
            addArr[i] = arr[j];
            i++;
            System.out.println(addArr);
        }
    }
    public String[] parseS(int[] nums){
        Arrays.sort(nums);
        String[] a=Arrays.toString(nums).split("[\\[\\]]")[1].split(", ");;
        return a;
    }


    public List<String> convertArrayToList(int[] array){
        array = addArr;
        String [] arrayS = parseS(array);
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(arrayS));
         addToList(stringList);
         return stringList;
    }
    public List<String> addToList(ArrayList<String> list){
        System.out.println("Введите число add");
         String element = Integer.toString(sc.nextInt());
         list.add(element);
        System.out.print(list.toString());
        arrayList = (ArrayList<String>) list.clone();
         return list;
    }
    public void getIndexArr(int[] arr){
        arr = addArr;
        String [] arrayS = parseS(arr);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arrayS));
        System.out.println("Ведите индекс");
        int index = sc.nextInt();
        String num = list.get(index);
        System.out.println(num);

    }


}


