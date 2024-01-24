import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomizedSet {
    private static ArrayList<Integer> list;
    public RandomizedSet() {
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!list.contains(val)){
            list.add(val);
            return true;
        }
        else{
            return false;
            }
    }
    
    public boolean remove(int val) {
        if(list.contains(val)){
            list.remove(Integer.valueOf(val));
            return true;
        }
        else{
            return false;
        }
    }
    public int getRandom() {
       return getRandomElement(list);

    }
    private static <T> T getRandomElement(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is empty or null");
        }
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
    public static ArrayList<Integer> getList(){
        return list;
    }
}
public class p380_leetcode {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        obj.insert(1);
        obj.remove(2);
        obj.insert(2);
        obj.getRandom();
        obj.remove(1);
        // obj.insert(2);
        // obj.getRandom();
        System.out.println(obj.getList());
    }
}