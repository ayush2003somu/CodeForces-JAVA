import java.util.*;
public class boyOrGirl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> list = new HashSet<>();
        for (char c:str.toCharArray()){
            list.add(c);
            }
        if (list.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
        
    }
}
