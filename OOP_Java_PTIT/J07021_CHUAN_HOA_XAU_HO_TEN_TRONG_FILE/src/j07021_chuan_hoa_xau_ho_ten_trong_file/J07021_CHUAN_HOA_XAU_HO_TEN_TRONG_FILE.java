package j07021_chuan_hoa_xau_ho_ten_trong_file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class J07021_CHUAN_HOA_XAU_HO_TEN_TRONG_FILE {
    public static String rechange(String s){
        String ans = "";
        String[] temp = s.split("[^a-zA-Z]+");
        int n = temp.length;
        for(int i = 0; i < n - 1; i++){
            ans += temp[i].substring(0, 1).toUpperCase() + temp[i].substring(1, temp[i].length()) + " ";
        }
        ans += temp[n - 1].substring(0, 1).toUpperCase() + temp[n - 1].substring(1, temp[n - 1].length());
        return ans;
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String x = sc.nextLine();
            if(!x.equals("END")){
                list.add(x.trim().toLowerCase());
            }
        }
        for(String s : list){
            System.out.println(rechange(s));
        }
    } 
}
