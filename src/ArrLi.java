import java.util.ArrayList;
import java.util.List;

public class ArrLi {
    public static void main(String[] args) {
//        ArrayList<String> studentName = new ArrayList();
//        studentName.add("Rakesk");
//        System.out.println(studentName);

//------------------------------add function----------------------------------

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(8);
//        list.add(3);
//        System.out.println(list);
//        list.add(5);
//        System.out.println(list);
//
//        list.add(1, 9);
//        System.out.println(list);
//-----------adding two different list---------------------------
//        List<Integer> newList = new ArrayList<>();
//        newList.add(10);
//        newList.add(80);
//        list.addAll(newList);
//        System.out.println(list);
//
//
//        System.out.println(list.get(1));  //get value

//------------------------remove function---------------------------------------
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(16);
        list1.add(15);
        list1.add(19);
        list1.add(18);
        System.out.println(list1);
        list1.set(2, 100);  // replace the element by other element
        System.out.println(list1);

        System.out.println(list1.contains(19)); //check element is present or not
//        list1.remove(1);
//        list1.remove(Integer.valueOf(10));  // remove value
//        list1.clear(); // remove all the elements from array
//        System.out.println(list1);
    }
}
