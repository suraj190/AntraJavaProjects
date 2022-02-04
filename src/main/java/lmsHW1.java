import java.util.*;

public class lmsHW1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);



        while(true) {

            System.out.println("enter input");
            String x = keyboard.nextLine();

            if (x.equals("q") || x.equals("Q")) {
                System.out.println("Quit program");
                break;
            }

            int xInt = Integer.parseInt(x);

            if (xInt > 0) {
                for (int i = 0; i < xInt; i++) {
                    doSomething(xInt);
                }
            }

            else{
                System.out.println("Error. Please Enter valid input");
            }


        }
    }

    public static void doSomething(int x){
        int ans = 0;
        for(int i = 1; i<=x; i++){
            ans+=i;
        }
        System.out.println(ans);
    }

    public static void MergeIntArr() {

        int[] array1 = {0,1,2,3,4};
        int[] array2 = {5,6,7,8,9};

        int[] mergeArr = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergeArr, 0, array1.length);
        System.arraycopy(array2, 0, mergeArr, array1.length, array2.length);

    }

    public static void getSecondHighest() {

        int[] array = {3,52,1295,2,5,1020,48,2222};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;


        for (int i = 0; i < array.length; i++) {

            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            }
            else if (array[i] > secondHighest) {
                secondHighest = array[i];
            }
        }
    }

}

