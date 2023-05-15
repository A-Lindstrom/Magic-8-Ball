import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gameInProgress = true;
        while (gameInProgress) {
            System.out.println("What do you desire to know?");
            String userQuestion = input.nextLine();
            System.out.println(getAnswer(userQuestion));

            System.out.println("Would you like to know more? Choose 'Y' or 'N'");
            String userContinue = input.nextLine();
            if (userContinue.equals("N")){
                gameInProgress = false;
            }

        }
    }

    public static String getAnswer(String question) {
        int randomNumber = new Random().nextInt(8);
        String answer = "";
        switch (randomNumber) {
            case 0:
                answer = "It's probably better not to know";
                break;
            case 1:
                answer = "Yes!";
                break;
            case 2:
                answer = "No";
                break;
            case 3:
                answer = "You already know it's a yes";
                break;
            case 4:
                answer = "No lol";
                break;
            case 5:
                answer = "Hmm...the future is cloudy";
                break;
            case 6:
                answer = "404 answer not found";
                break;
            case 7:
                answer = "Ask again";
        }
        return answer;
    }

}