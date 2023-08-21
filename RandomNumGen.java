import java.util.Scanner;
import java.util.Random;
public class RandomNumGen{
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
{
    Random random =new Random();
    int num=random.nextInt(100);
    RandomNumGen o= new RandomNumGen();
    o.display(num);
    
}
public void display(int num){
    int n=5;
      System.out.println("Welcome to the Number Game!");
      System.out.println("You'll be having 5 tries to guess the number!");
    for(int i=1;i<=5;i++){
        System.out.println("Enter your guess: ");
        Scanner sc= new Scanner(System.in);
        int yourGuess= sc.nextInt();
        if(yourGuess==num)
                {
                    System.out.println("Good Job, You got it correct!");
                    System.out.println("It took you "+i+" tries to guess");
                    break;
                }
                
                if(yourGuess<num)
                {
                    System.out.println("The number you guessed was too low.");
                }
                 if(yourGuess>num)
                {
                    System.out.println("The number you guessed was too high.");
                }
                System.out.println("You still have "+(n-i)+" chances left to guess!");
                if(i>=5)
                {
                    System.out.println("Sorry, You're out of tries");
                    System.out.println("The actual number generated was "+num);
                }
    }

    System.out.println("Want to start over?(Yes-1  & No-0): ");
            int choice= sc.nextInt();
            if(choice == 1)
            {
            display(num);
            }
            else 
            {
        System.out.println("Thank You, Have a Good Day");
        }
}


}
