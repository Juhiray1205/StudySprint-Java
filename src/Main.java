import java.util.*;
public class Main{
  public static void main (String [] args){
    System.out.println("===========================================");
    System.out.println("          WELCOME TO STUDY SPRINT          ");
    System.out.println("         YOUR PERSONAL STUDY COACH         ");
    System.out.println("===========================================");

    Scanner sc = new Scanner(System.in);
    System.out.print("enter your name:");
    String name = sc.nextLine();
    System.out.print("Enter your Today's Goal hours:");
    double goalHours = sc.nextDouble();
    double totalStudyHours = 0;

    System.out.print("Enter number of subjects:");
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
        System.out.print("Enter subject " + (i + 1) + ":");
        String subject = sc.next();
        System.out.print("Enter hours for " + subject + ":");
        double hours = sc.nextDouble();
        totalStudyHours += hours;
        if (totalStudyHours >= goalHours) {
            System.out.println("Congratulations! You have achieved your goal for today.");
        } else {
          double remainingHours = goalHours - totalStudyHours;
          System.out.println("You have " + remainingHours + " hours left to achieve your goal. Keep studying!");
        
        }
    }

    double remainingHours = goalHours - totalStudyHours;

    double goalPercentage = (totalStudyHours / goalHours) * 100;

    System.out.printf("Goal Completed: %.2f%%\n", goalPercentage);

    int xp = (int)(totalStudyHours * 10);
    int level = (xp / 100) + 1;
    int streak = 0;


    System.out.println("welcome " + name + "!");
    System.out.println("You are currently at level: " + level + ".");
    System.out.println("xp earned today:" + xp);
    System.out.println("Your streak:" + streak );
    System.out.println("Today's goal: " + goalHours + " hours.");

    if (goalPercentage == 100) {
    System.out.println("Badge Unlocked: Goal Crusher!");
  } else if (goalPercentage >= 75) {
    System.out.println("Badge: Almost There!");
  } else if (goalPercentage >= 50) {
    System.out.println("Badge: Keep Going!");
  } else {
    System.out.println("Stay consistent. Every small study session brings you one step closer to your goal.");
  }

    if (remainingHours > 0) {
    System.out.println("Motivation of the Day");
    System.out.println("Don't compare yourself with yesterday's failure.");
    System.out.println("Just complete the remaining " + remainingHours + " hour(s) tomorrow.");
  } else {
    System.out.println("Today's Motivation");
    System.out.println("Consistency creates confidence. Keep this streak alive!");
  }
  
  }
}

class Student{
    String name;
    int dailyStudyHours;
    int xp;
    int level;
    int streak;
    
}

class studyPlan{
    String subject;
    int hours;
    String date;
    int breakTime;
}

