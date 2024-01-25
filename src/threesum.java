import java.util.*;

public class threesum {
    public static void main(String[] args) {
        System.out.println("enter the size of list : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            int sum = 0;
            ArrayList <Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++){
                    for(int k=j+1;k<n;k++)
                    {
                        sum = a[i]+a[j]+a[k];
                        if(sum == 0){
                            list.add(a[i]);
                            list.add(a[j]);
                            list.add(a[k]);
                            System.out.println(list);
                            list.clear();
                        }
                    }
                }
            }
        }
        
    }
}
