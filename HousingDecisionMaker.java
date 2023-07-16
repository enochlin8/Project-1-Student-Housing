import java.util.Scanner;
public class HousingDecisionMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TotalPoints = 0;
        System.out.println("***** University Housing Questionnaire *****");
        // My first question will be on yearly income, I designated points based on how much their family makes.
        System.out.println("How much yearly income does your household make? (0-50k, 50-100k, 100-150k, 150k+)");
        int income = input.nextInt();
        if (income <= 50000) {
            TotalPoints += 4;
        } else if (income <= 100000) {
            TotalPoints += 3;
        } else if (income <= 150000) {
            TotalPoints += 2;
        } else if (income >= 150000) {
            TotalPoints += 1;
        }
        // My second question is based on proximity to campus, I designated points based on how far they have to travel in miles to get to school.
        System.out.println("How close are you to campus? (0-15m, 15-30m, 30-50m, 50+m)");
        int distance = input.nextInt();
        if (distance <= 15) {
            TotalPoints += 1;
        } else if (distance <= 30) {
            TotalPoints += 2;
        } else if (distance <= 50) {
            TotalPoints += 3;
        } else if (distance >= 50) {
            TotalPoints += 4;
        }
        // My third question is what grade or year they're in and giving priority to students who have been in school longer. I would want the person to input a singular number.
        System.out.println("What year will you be when you are applying for housing? (1st year, 2nd year, 3rd year, 4th year)");
        int grade = input.nextInt();
        input.nextLine();
        if (grade == 1) {
            TotalPoints += 1;
        } else if (grade == 2) {
            TotalPoints += 2;

        } else if (grade == 3) {
            TotalPoints += 3;
        } else if (grade == 4) {
            TotalPoints += 4;
        }
        // My fourth question is on Academic eligibility but for my algorithm I don't consider this question to be worth too much.
        System.out.println("Are you on Academic Probation?");
        String Academics = input.nextLine();
        if (Academics.equals("Yes")) {
            TotalPoints += 0;
        } else if (Academics.equals("No")) {
            TotalPoints += 1;
        }
        // My fifth question is based on whether someone has disabilities or needs
        System.out.println("Do you have any disabilities or require more assistance?");
        String Needs = input.nextLine();
        if (Needs.equals("Yes")) {
            TotalPoints += 1;
        } else if (Needs.equals("No")) {
            TotalPoints += 0;
        }
        if (TotalPoints >= 13) {
            System.out.println("Congratulations! You are a top priority for housing. (Total Points): " + TotalPoints);
        } else if (TotalPoints >= 11) {
            System.out.println("Congratulations! You will have priority for housing. (Total Points): " + TotalPoints);
        } else if (TotalPoints >= 8) {
            System.out.println("We will let you know if we have openings for housing. (Total Points): " + TotalPoints);
        } else if (TotalPoints <= 8) {
            System.out.println("We might not be able to offer you housing this year. (Total Points): " + TotalPoints);
        }

    }}

