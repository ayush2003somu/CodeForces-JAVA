import java.util.Scanner;
public class xor_path{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       long k = sc.nextLong();
       int[][] arr = new int[n][m];
       for (int i=0;i<n;i++){
        for (int j=0;j<m;j++){
            int num = sc.nextInt();
            arr[i][j]=num;
        }
       }
       int count=0;
       int ans[] = new int[1];
       helper(arr,n,m,0,0,k,count,ans);
       ans(ans[0]);
    }
    public static void helper(int[][]arr,int n,int m,int indexN,int indexM,long k,long count,int[] ans){
        if (indexN==n-1) {
            for (int i=indexM;i<m;i++){
                count^=arr[indexN][i];
            }
            if (count==k)ans[0]++;
            return;
        }
        for (int i=indexM;i<m;i++){
        count^=arr[indexN][i];
        helper(arr, n, m, indexN+1,i,k,count,ans);
    }
}
    public static int ans(int num){
    return num;
    }
}
