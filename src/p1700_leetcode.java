import java.util.ArrayList;

public class p1700_leetcode{
    public static int countStudents(int[] students, int[] sandwiches) {
        int k = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : students){
            list.add(i);
        }
        while(k < sandwiches.length){
            if(list.get(0)==sandwiches[k]){
                k++;
                list.remove(0);
            }
            else{
                if(list.contains(sandwiches[k])){
                    int x = list.get(0);
                    list.remove(0);
                    list.add(x);
                }
                else{
                    return list.size();
                }
            }
        }
        return 0;   
    }
    public static void main(String[] args) {
        // students = [1,1,0,0], sandwiches = [0,1,0,1]
        int[] students = new int[]{1,1,1,0,0,1};
        int[] sandwiches = new int[]{1,0,0,0,1,1};
        System.out.println(countStudents(students, sandwiches));
    }
}