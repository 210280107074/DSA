import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class p1436_leetcode {
  public static void main(String[] args) {
    List<List<String>> paths = new ArrayList<>();
    List<String> path1 = new ArrayList<>();
    path1.add("LONDON");
    path1.add("NEW YORK");
    // List<String> path2 = new ArrayList<>();
    // path2.add("NEW YORK");
    // path2.add("LIMA");
    // List<String> path3 = new ArrayList<>();
    // path3.add("LIMA");
    // path3.add("SAO PAULO");
    paths.add(path1);
    // paths.add(path2);
    // paths.add(path3);
    String s = new String();
    s = "Dhruvil";


    System.out.println(destCity(paths));
  }

  public static String destCity(List<List<String>> paths) {
    HashMap<String, String> map = new HashMap<>();
    for (int i = 0; i < paths.size(); i++) {
      map.put(paths.get(i).get(0), paths.get(i).get(1));
    }
    for (int i = 0; i < paths.size(); i++) {
      if (!map.containsKey(paths.get(i).get(1))) {
        return paths.get(i).get(1);
      }
    }
    return null;
  }
}
