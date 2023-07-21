package j07017_lop_pair_generic;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07017_LOP_PAIR_GENERIC {
    public static class Pair<K, V>{
        private K key;
        private V value;
        
        public Pair(K key, V value){
            this.key = key;
            this.value = value;
        }
        
        public boolean prime(int n){
            if(n < 2){
                return false;
            }
            for(int i = 2; i * i <= n; i++){
                if(n % i == 0){
                    return false;
            }
        }
        return true;
    }
        
        public boolean isPrime(){
            if(prime((Integer) key) && prime((Integer) value)){
                return true;
            }else{
                return false;
            }
        }
            
        @Override
        public String toString(){
            return key + " " + value;
        }
    } 
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-- < 0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++ ){
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
            }
        }
            if(!check){
                System.out.println(-1);
            }
        }
    }
}
