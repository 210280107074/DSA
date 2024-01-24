import java.util.ArrayList;

public class p1496_leetcode {
    public static boolean isPathCrossing(String path) {
        ArrayList <String> list = new ArrayList<>();
        int x=0;
        int y=0;
        list.add(x+","+y);
        for(int i=0;i<path.length();i++){
            switch (path.charAt(i)) {
                case 'N':
                    y++;                    
                    break;
                case 'S':
                    y--;                    
                    break;
                case 'E':
                    x++;                    
                    break;
                case 'W':
                    x--;                    
                    break;
                default:
                    break;
            }
            String currentpos = x +","+ y;
            if(list.contains(currentpos)){
                return true;
            }
            list.add(currentpos);
            
        }
        return false;
    }

    public static void main(String[] args) {
        String path = "NESE";
        System.out.println(isPathCrossing(path));
    }
}
