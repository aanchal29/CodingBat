
import java.util.Arrays;


public class GoogleTimeProblem {

    public static void main(String args[]) {
        String S = "08:00";
        String s11 = new String(S.replace(":", ""));
        int[] numbers = s11.chars().map(i -> i - '0').toArray();

        //Input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();
        
        int x[] = createTime(numbers);
        
        //Output
        String s =Arrays.toString(x);
        String s1 = new String (s.replace("[", ""));
        String s2 = new String (s1.replace("]", ""));
        String s3 = new String (s2.replace(", ", ""));
        
        
        
        String sub = s3.substring(0, 2) +":"+ s3.substring(2, 4);
        System.out.println(sub);
    }
   
    
    public static int[] createTime(int[] numbers) {
        int[] time = new int[4];
        time[0] = findMaxSpecific(numbers, 2);
        time[1] = time[0] == 2 ? findMaxSpecific(numbers, 3) : findMaxSpecific(numbers, 9);
        time[2] = findMaxSpecific(numbers, 5);
        time[3] = findMaxSpecific(numbers, 9);

        return time;
    }

    public static int findMaxSpecific(int[] arr, int valToFind) {
        if (arr.length != 4) {
            return -1;
        }

        int numToFind = -1;
        int indexToRemove = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= valToFind) {
                if (arr[i] > numToFind) {
                    numToFind = arr[i];
                    indexToRemove = i;
                }
            }
        }

        if (indexToRemove == -1) {
            return -1;
        }
        arr[indexToRemove] = -1;

        return numToFind;
    }
}
