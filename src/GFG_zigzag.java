import java.util.Arrays;

class GFG_zigzag{
    public static void zigZag(int arr[], int n) {
        Arrays.sort(arr);
        int temp;
        for(int i=1;i+1<arr.length;i+=2){
            temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }

      }
      public static void zigZag2(int arr[]){
        int temp;
        for(int i=0;i+1<arr.length;i++){
            if(i%2 == 0){
                if(arr[i]>arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            else if(i%2 != 0){
                if(arr[i]<arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp; 
                }
            }
            else{
                continue;
            }
        }
      }
      public static void main(String[] args) {
        int arr[] = {4 ,3 ,7 ,8 ,6 ,2 ,1};
        // zigZag(arr, arr.length);
        zigZag2(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
      }
}