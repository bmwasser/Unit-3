import java.util.Arrays;

public class Histograms{

    public static void main(String[] args){
        int[] rolls = getRolls(6000);
        int[] hist = makeHistogram(rolls);
        System.out.println(Arrays.toString(hist));
    }

    public static int getLcgNum(int m){
        final int A = 7;
        final int C = 1;
        int seed = (int)(System.nanoTime() / 100);
        return Math.abs((A * seed + C) % m);
    }
    


    // getRolls: returns an int array of size n filled with random numbers from 1 to 6 
    public static int[] getRolls(int n){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = getLcgNum(6) + 1;
        }
        return arr;
    }

    // receives an int array of numbers 1 - 6 and returns a histogram of those numbers
    public static int[] makeHistogram(int[] arr){
        final int BINS = 6;
        int[] histogram = new int[BINS];
        for (int i = 0; i < arr.length; i++){
            int bin = arr[i] - 1;
            histogram[bin]++;
        }
        return histogram;
    } 

}