import java.util.Scanner;

public class Demo 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Sports output = null;

        System.out.println("Please input an integer to choose which sport you are interested in: Soccer (1) or Football (2)");
        int choice = scan.nextInt();
        

        while(choice != 1 && choice != 2)
        {
            System.out.println("You must enter either a 1 (Soccer) or a 2 (Football)");
            choice = scan.nextInt();
        }

        if(choice == 1)
        {
            output = new Soccer();
        }
        else if (choice == 2) {
            output = new Football();
        }

        output.play();
        scan.close();
    }





}
