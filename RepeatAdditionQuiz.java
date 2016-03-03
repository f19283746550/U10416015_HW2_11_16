import java.util.Scanner;
public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n1=(int)(Math.random()*10);
    int n2=(int)(Math.random()*10);
    System.out.println("What is "+n1+" + "+n2+" ?");
    int ans=input.nextInt();
    while(n1+n2!=ans) {
      System.out.println("Wrong answer. Please try again. What is "+n1+" + "+n2+" ?");
      ans=input.nextInt();
    }
    System.out.println("You got it!");
  }
}