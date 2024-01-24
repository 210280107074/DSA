import java.util.*;
public class maximum_from_all_subarray {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the size of array : ");
           int size = sc.nextInt();
           System.out.println("enter the elements in array : ");
           int arr[] = new int[size];
           for(int i=0;i<size;i++) 
           {
                arr[i] = sc.nextInt();
           }
           System.out.println("enter the window size : ");
           int k = sc.nextInt();
           int i=0;
           int j=0;
           int max=0;
           ArrayList <Integer> list = new ArrayList<>();
           while(j<size)
           {
               max = Math.max(max, arr[j]);
                if(j-i+1 < k){
                    j++;
                }
                else if (j-i+1 == k){
                    list.add(max);
                    if(max == arr[i])
                    {
                        max = 0;
                    }
                    i++;
                    j++;
                }
           }
           System.out.println("maximums from all subarray : "+list);
    }
    }
}
