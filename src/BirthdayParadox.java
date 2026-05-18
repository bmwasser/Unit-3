public class BirthdayParadox{

    public static void main(String[] args) {
        int numTrials = 100000; 
        int groupsWithSharedBirthday = 0;

        for (int i = 0; i < numTrials; i++) {
            int[] birthdays = generateBirthdays(23);
            int[] histogram = birthdayHistogram(birthdays);
            if (testParadox(histogram) == 100.0) {
                groupsWithSharedBirthday++;
            }
            if (i % 1000 == 0 && i != 0) {
                System.out.println("Current Progress: " + (double) groupsWithSharedBirthday / i * 100);
            }
        }

        double percentage = (double) groupsWithSharedBirthday / numTrials * 100;
        System.out.println("Percentage of groups with a shared birthday: " + percentage);
    }


    public static int[] generateBirthdays(int numPeople){
        int[] birthdays = new int[numPeople];
        for (int i = 0; i < birthdays.length; i++){
            birthdays[i] = (int) (Math.random() * 365) + 1;
        }
        return birthdays;
    }

    public static int[] birthdayHistogram(int[] birthdays){
        final int DAYS = 365;
        int[] histogram = new int[DAYS];
        for (int i = 0; i < birthdays.length; i++){
            int day = birthdays[i] - 1;
            histogram[day]++;
        }
        return histogram;
    } 

    public static double testParadox(int[] histogram){
        for (int count : histogram) {
        if (count > 1) {
            return 100.0; 
        }
    }
    return 0.0;
    }



}