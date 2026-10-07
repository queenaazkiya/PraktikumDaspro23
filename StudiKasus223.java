import java.util.Scanner;

public class StudiKasus223 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String studentName, activityType;
        int docsUploaded, winnerRank, pkmStatus, docsMissing;

        System.out.print("Input Student Name: ");
        studentName = input.nextLine();
        System.out.print("Input Activity Type: ");
        activityType = input.nextLine();
        System.out.print("Input Number of Documents Uploaded: ");
        docsUploaded = input.nextInt();
        
        if (activityType.equalsIgnoreCase("belmawa")||activityType.equalsIgnoreCase("bakorma")||activityType.equalsIgnoreCase("mandiri")) {
            System.out.print("Input Winner Rank: ");
            winnerRank = input.nextInt();
            if (winnerRank >= 1 && winnerRank <= 3) {
                if (docsUploaded == 4) {
                    System.out.println("Award Funds Are Given");
                } else {
                    docsMissing = 4 - docsUploaded;
                    System.out.println("Documents incomplete, award funds are not given!");
                    System.out.println("Documents still missing: " + docsMissing);
                }
            } else {
                System.out.println("Not a 1st, 2nd, or 3rd place winner, no award funds");
            }
        } input.close();
    }
}
