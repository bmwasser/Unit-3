import java.util.Arrays;

public class ElegantArrays{

    public static void main(String[] args){
        boolean[] voting = {true, false, true, true, true, false};
        System.out.println(majority(voting));
        double[] values = {3,4,5,6};
        System.out.println(Arrays.toString(stats(values)));
        int[] data = {3,3,3,4,5};
        System.out.println(mode(data));
    }

    public static int majority(boolean[] votes){
        int totalVotes = 0;
        for (int i = 0; i < votes.length; i++){
            if (votes[i]){
                totalVotes++;
            } else {
                totalVotes--;
            }
        }
        return totalVotes;


    }

    public static double[] stats(double[] values){
        double min = values[0];
        double max = values[0];
        double sum = 0;
        
        for (double num : values){
            if (num < min){
                min = num;
            } 
            if (num > max){
                max = num;
            }
            sum += num;
        }
        
        double mean = sum / values.length;
        return new double[] {min, mean, max};
    }

    public static int mode(int[] values){
        int[] hist = makeHistogram(values);
        int mostFrequentValue = -1; 
        int maxCount = 0;
        for (int i = 0; i < hist.length; i++){
            if (hist[i] > maxCount){
                maxCount = hist[i];
                mostFrequentValue = i;
            }
        }
        return mostFrequentValue;
    }



    public static int[] makeHistogram(int[] arr){
        final int BINS = 10;
        int[] histogram = new int[BINS];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0 && arr[i] < BINS){
                histogram[arr[i]]++;
            }
            
        }
        return histogram;
    } 

}