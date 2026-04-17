import java.io.*;
public class demo {
    public static void main(String[] args) throws Exception {
        BufferedReader br;
        if(System.getProperty("ONLINE_JUDGE") == null) {
            br = new BufferedReader(new FileReader("input.txt"));
        }else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        StringBuilder output = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            int len = Integer.parseInt(br.readLine());
            br.readLine();
            StringBuilder sb = new StringBuilder();
            if (len%2==0){
                sb.append(2+"\n");
                sb.append(1+" "+len+"\n");
                sb.append(1+" "+len);
            }else{
                sb.append(4+"\n");
                sb.append(1+" "+(len-1)+"\n");
                sb.append(1+" "+(len-1)+"\n");
                sb.append(len-1+" "+len+"\n");
                sb.append((len-1)+" "+len);

            }
            output.append(sb).append("\n");
        }
        System.out.println(output);
    }
}
