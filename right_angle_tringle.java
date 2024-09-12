
import java.util.Scanner;

public class right_angle_tringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int row = sc.nextInt();
        
        for(int i =1; i<=row;i++){
            for(int j=1;j<=i;j++){
                if (i==1 || i==row || j==1 || j==i) {
                    
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }System.out.println();
        }
    }
}