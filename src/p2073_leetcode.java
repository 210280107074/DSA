import java.util.ArrayList;

public class p2073_leetcode {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : tickets){
            list.add(i);
        }
        int count = 0;
        int i = 0;
        while(list.get(k) != 0){
            if(list.get(i) != 0 ){
                count++;
               int x = list.get(i) - 1;
               list.remove(i);
               list.add(i,x);
              
            }
            if(i==tickets.length-1){
                i = 0;
            }
            else{
                i++;
            }
      
        }
        return count;
    }
    public static void main(String[] args) {
        int[] tickets = new int[]{5,1,1,1};
        System.out.println(timeRequiredToBuy(tickets, 0));
    }
}
