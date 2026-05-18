
public class LanguageAnalysis {
    
    

    static double[] english = {.0812, .0149, .0271, .0432, .1202, .023, .0203, .0592, .0731, .001, .0069, .0398, .0261, .0695, .0768,
            .0182, .0011, .0602, .0628, .091, .0288, .0111, .0209, .0017, .0211, .0007 };
    static double[] spanish = {.1216, .0149, .0387, .0467, .1408, .0069, .01, .0118, .0598, .0052, .0011, .0524,
            .0308, .07, .092, .0289, .0111, .0641, .072, .0460, .0469, .0105, .0004, .0014, .0109, .0047 };
    static double[] swedish = {.09383, .01535, .01486, .04702, .10149, .02027, .02862, .02090, .05817, .00614, .03140, .05275, .03471, .08542, 
            .04482, .01839, .00020, .08431, .06590, .07691, .01919, .02415, .00142, .00159, .00708, .00070};

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Type something: ");
        // String text = in.nextLine();
        // System.out.println("You said: " + text);
        int[] hist = letterHist("This is it! This is the answer. It says here that a bolt of lightning is going to strike the clock tower at precisely 10:04 p.m. next Saturday night! If... if we could somehow harness this lightning... channel it into the flux capacitor... it just might work. Next Saturday night, we're sending you back to the future!");           
        double[] freq = letterFreqs(hist);
        double englishMSE = calcLoss(freq, english);
        double spanishMSE = calcLoss(freq, spanish);
        double swedishMSE = calcLoss(freq, swedish);
        if (englishMSE < spanishMSE && englishMSE < swedishMSE){
            System.out.println("You are speaking English");
        } else if (spanishMSE < englishMSE && spanishMSE < swedishMSE){
            System.out.println("You are speaking Spanish");
        } else {
            System.out.println("You are speaking Swedish");
        }
        
    }

   public static int[] letterHist(String input){
        int[] count = new int[26];
        String lower = input.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char letter = lower.charAt(i);
            // if statement when a space is present or special character
            if (letter >= 'a' && letter <= 'z') {
                int index = letter - 'a';
                count[index]++;
            }
        }
        return count;



    } 

    public static double[] letterFreqs(int[] histogram) {
        // traverse histogram array to determine total amount of letters are present in entire histogram 
        // traverse an array the second time to divide the array
        double[] freqs = new double[histogram.length];
        int totalLetters = 0;
        for (int i = 0; i < histogram.length; i++){
            totalLetters += histogram[i];
             
        }
        for (int i = 0; i < histogram.length; i++){
            freqs[i] = (double) histogram[i] / totalLetters;

        }
        
        return freqs;
    }

    public static double calcLoss(double[] data, double[] referenceVals) {
        double sum = 0;
        for (int i = 0; i < data.length; i++){
            // traverse data array where data is subtracted by language of chose then squared
            // all the items in the arrays are added together 
            double diff = referenceVals[i] - data[i];
            sum += Math.pow(Math.abs(diff), 2);

        }
        
        return sum/data.length;
    }
}
