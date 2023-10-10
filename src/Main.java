//B. Вывести четные элементы
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (array[i] % 2 == 0) System.out.print(array[i] + " ");
            }
        }

    }*/


/*D. Количество элементов, больших предыдущего
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (array[i] > 0) a+=1;
        }
        System.out.println(a);
    }
}
*/
/*D. Количество элементов, больших предыдущего
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] array = new int[num];
        for (int i = 0; i != array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]) a+=1;
        }
        System.out.println(a);
    }
}
*/

import java.util.Arrays;
import java.util.OptionalInt;

/*J. Максимум в массиве
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int maxi = 0;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                maxi = array[i];
            } else if (array[i] < array[i + 1]) {
                maxi = array[i + 1];
            }
        }
        System.out.println(maxi);
    }
}*/