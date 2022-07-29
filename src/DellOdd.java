import java.util.*;

public class DellOdd {


    public void delete()
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);
        map.put("H", 8);
        map.put("I", 9);
        map.put("J", 10);

        map.values().removeIf(value -> value%2 ==0);
        System.out.println(map);
    }

    public void repValue(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(10);
        list.add(2);
        list.add(7);
        list.add(10);

        HashMap<String, List<Integer>> repNumbers = new HashMap<>();
        repNumbers.put("first", list);
        for (Map.Entry<String, List<Integer>> a : repNumbers.entrySet()) {
            for (int i = 0; i < a.getValue().size(); i++) {
                if (arrayList.contains(a.getValue().get(i))) {
                    continue;
                }
                int counter = 0;
                for (int j = 0; j < a.getValue().size(); j++) {
                    if (a.getValue().get(i).equals(a.getValue().get(j))) {
                        counter++;
                    }
                }
                System.out.println("Число " + a.getValue().get(i) + " повторяется " + counter + " раз");
                arrayList.add(a.getValue().get(i));
            }
        }
    }
}
