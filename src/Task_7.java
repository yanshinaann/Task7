import arrayutils.ArrayUtils;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Task_7 {

public static final String ERROR_INPUT = "File not found";
    public static final String INPUT = " Input file name";
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String[] testArrays = inputArrayFromFile();

    }

public static String[] inputArrayFromFile(){
        while (true) {
            try{
                String inputWay = sc.nextLine();
                return ArrayUtils.readLinesFromFile(inputWay);
            } catch (FileNotFoundException e){
                System.out.print(ERROR_INPUT);
            }
}}



    public static void fileInputOutputArrayDemo() throws FileNotFoundException {
        // чтения массива
        int[] arr = ArrayUtils.readIntArrayFromFile("input");
        // вывод массива в консоль
        System.out.printf("\"Прочитанный массив\" массив:%n%s%n", ArrayUtils.toString(arr, "%3d"));
        // запись массива в файл
        ArrayUtils.writeArrayToFile("output.txt", arr);
    }


     public static void result() {
        int arr[] = ArrayUtils.readIntArrayFromFile("input");
        int min1 , min2, number, minexist = -1;
        min1 = arr[0];
        min2 =arr[0];
        number = 0;

        for (int i = 1; i<= 9; i++) {
            if (arr[i] < min1) { min1 =arr[i]; minexist = 0;}}

        for (int i=1; i<=9; i++){
            if ((arr[i] <= min2) &(arr[i] >min1)) {
                min2 =arr[i];
                number = i;
            }
        }
        if (minexist == 0 ){
            System.out.println("Второй минимальный элемент: " + min2);
            printText ("Его номер: " + number);
        } else printText("Второго минимального элемента не существует");

    }

   /* public static void result() {
        int arr[] = ArrayUtils.readIntArrayFromFile("input");
        int min1 , min2, number, minexist = -1;
        min1 = arr[0];
        min2 =arr[0];
        number = 0;

        for (int i = 1; i<= 9; i++) {
            if (arr[i] < min1) { min1 =arr[i]; minexist = 0;}}

        for (int i=1; i<=9; i++){
            if ((arr[i] <= min2) &(arr[i] >min1)) {
                min2 =arr[i];
                number = i;
            }
        }
        if (minexist == 0 ){
            System.out.println("Второй минимальный элемент: " + min2);
            printText ("Его номер: " + number);
        } else printText("Второго минимального элемента не существует");

    }
*/

    private static void printText (String text){
        System.out.print(text);
    }

/*public static void readarray(){
    int array[] = new int[11]; // Создаём массив int размером в size
    System.out.println("Insert array elements:");
    for (int i = 1; i <= 10; i++) {
        array[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
    }
}*/


}




