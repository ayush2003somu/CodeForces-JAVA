import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class demo {
    public static void main(String[] args) throws Exception {
        BufferedReader br ;
        if (System.getProperty("ONLINE_JUDGE") == null) {
            br = new BufferedReader(new FileReader("input.txt"));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        int tc = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        while(tc-->0){
            HashMap<Character,Integer> map = new HashMap<>();
            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);
            String str = br.readLine();
            for (int i=0;i<n;i++){
                char c = str.charAt(i);
                map.put(c,map.getOrDefault(c, 0)+1);
            }
            int oddChar =0;
            for(char key:map.keySet()){
                if (map.get(key)%2!=0){
                    oddChar++;
                }
            }
            if (oddChar>k+1)
            output.append("NO").append("\n");
            else output.append("YES").append("\n");
        }
        System.out.println(output);
    }
}
