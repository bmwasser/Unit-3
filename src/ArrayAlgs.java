
public class ArrayAlgs{

    public static void main(String[] args) {
        int[] originalNumbers = {-5, 10, -3, 0, 7, -20};
        int[] absoluteNumbers = absFunction(originalNumbers);

        System.out.print("Original Array: ");
        for (int number : originalNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print("Absolute Array: ");
        for (int number : absoluteNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // absModifier: receives an int array and CHANGES each element
    // to its absolute value. When complete, the original array
    // is modified

    public static void absModifier(int [] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.abs(arr[i]);
        }
    }

    // absFunction: recieves an int array and return a NEW array
    // of the same size and contain the absolute values of the original elements
    // When complete, the original array is not modified
    
    public static int[] absFunction(int [] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = Math.abs(arr[i]);
        }
        
        return newArr;
    }


    public static void makeBigger(int n, int[] arr){
        n *= 2;
        for (int i = 0; i < arr.length; i++){
            arr[i] *= 2;
        }
    }

    // contains: receives an int array and a target and returns true if the target in the array
   
    public static boolean contains(int[] arr, int target){
        for (int num : arr){
            if (num == target){
                return true;
            }
        }
        return false;
    }

    // findMax: receives a double array and returns the largest value in the array

    public static double findMax(double[] arr){
        double max = arr[0];
        for (double num : arr){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    // mean: receives an int array and returns the average of all elements

    public static double mean(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double findIndexOfMax(int[] arr){
        // double max = Double.MIN_VALUE;
        double indexOfMax = -1;
        for (int i = 0; i < arr.length; i++){

        }
        return indexOfMax;
    }

}