package codegym.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterrator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hà Nội");
        list.add("Đà Nẵng");
        list.add("Hội An");

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        list.stream().forEach(e -> System.out.println(e));
    }
}
