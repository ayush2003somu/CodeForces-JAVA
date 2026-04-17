import java.io.*;
import java.util.Arrays;
public class demo {
    public static void main(String[] args) throws Exception {
        BufferedReader br;
        if (System.getProperty("ONLINE_JUDGE") == null) {
            br = new BufferedReader(new FileReader("input.txt"));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        int tc = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        while(tc-->0){
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int k  = Integer.parseInt(firstLine[1]);
            String[] str = br.readLine().split(" ");
            Arrays.sort(str,(a,b)->Integer.parseInt(a)-Integer.parseInt(b));
            int count = 1;
            int maxCount = 1;
            int lastProblem =Integer.parseInt(str[0]);
            for (int i=1;i<n;i++){
                int currProblem = Integer.parseInt(str[i]);
                if (Math.abs(currProblem-lastProblem)<=k){
                    count++;
                }else {
                    count=1;
                }maxCount = Math.max(maxCount,count);
                lastProblem = currProblem;
            }
            output.append(n-maxCount).append("\n");
        }
        System.out.println(output);
        br.close();
    }
}
