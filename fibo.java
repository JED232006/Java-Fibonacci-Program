import java.util.Scanner;
 class fibo {
    public static void main(String[]args) {
        int number;
        int firstN = 0; int secondN=1;
        Scanner sc=new  Scanner(System.in);
        
        System.out.print("Enter the number of a fibonacci sequence: ");
        number = sc.nextInt();
        
        System.out.print("Fibonacci sequence (First "+number+") :\n" );
        for (int i=0; i< number;i++) {
            System.out.print(firstN+" ");
            int next = firstN + secondN;
            firstN = secondN; 
            secondN = next;
        }
    }
}
