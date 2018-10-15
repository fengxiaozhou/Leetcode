import java.util.Scanner;  
    
public class Main {  
       
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);  
        while(sc.hasNext()){  
            int n = sc.nextInt();  
            int k = sc.nextInt();  
            int[][] dp = new int[n+1][k+1];  
            for(int i=1;i<n+1;i++) dp[i][0] = 1;    
            for(int i=2;i<n+1;i++){  
                for(int j=1;j<k+1;j++){  
                    dp[i][j] = (dp[i-1][j]*(1+j)+dp[i-1][j-1]*(i-j))%2017;  
                }  
            }  
            System.out.println(dp[n][k]);  
        }  
    }  
}