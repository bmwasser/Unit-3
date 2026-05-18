public class MagicEightBall{
    
    public static void main(String[] args) {
       String[] answers = {"What do you mean", "Not Now DINGUS", "Probably not likely", "Yes", "No", "Perchance", "Highly unlikely"};
        
       System.out.println("Asking the magic eight ball..."); 
       int randomIndex = (int) (Math.random() * answers.length); // 7 is a magic number which is why you substitute with name of variable.length
       System.out.println(answers[randomIndex]);
    }
    


}