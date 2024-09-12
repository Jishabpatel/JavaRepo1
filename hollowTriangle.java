import java.util.Scanner;
public class hollowTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N:");
            int n = sc.nextInt();
            //outer loop
            for (int i = 1;i<=n;i++){
                // loop for spaces
                for (int j= 1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // loop for hollow triangle 
                for(int j = 1; j<=i;j++){
                    if(i==1 || i==n || j==1 || j==i)
                    {System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}