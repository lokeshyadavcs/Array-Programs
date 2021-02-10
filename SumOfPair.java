import java.util.Scanner;

public class SumOfPair {

    public static void find(int a[], int d) {
        int b=0;
     for (int i = 0; i < a.length; i++) {
        for (int j = i+1; j < a.length; j++) {
            if (a[i]+a[j]==d) {
                System.out.println("Found");
                System.out.println("Pairs are :" +a[i] +" "+a[j]);
                b++;
                
            }
            
            
        }
        
         
     }if(b==0){
        System.out.println("Not Found");
    
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int s = sc.nextInt();
        int a[] = new int[s];
        int i;
        for (i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("input the element to find the pair");
        int d = sc.nextInt();
        find(a, d);
        
    
    }
}
