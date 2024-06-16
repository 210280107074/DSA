import java.util.ArrayList;

public class GFG_prime_pair_with_sum {
    
public static ArrayList<Integer> getPrimes(int n) {
        if(n<=1){
            ArrayList<Integer> result = new ArrayList<>();
            result.add(-1);
            result.add(-1);
            return result;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2;i<=n;i++){
            System.out.println(i+"-"+isPrime(i));
            System.out.println(n-i+"-"+isPrime(n-i));
            System.out.println("-----------------------------");
            if(isPrime(i) && isPrime(n-i)){
                ans.add(i);
                ans.add(n-i);
                break;
            }
        }
        if(ans.size()==0){
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
    }
    public static boolean isPrime(int x){
        if(x<=1){
            return false;
        }
        int y=2;
        while(y<x){
            if(x%y==0){
                return false;
            }
            y++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(getPrimes(3));
    }
}
