package Lec_5;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      ArrayList<Integer> list = new ArrayList<>();
      //add(1);
      list.add(2);
      list.add(3);
      System.out.println(list);
      // remove(idx);
      list.remove(0);
      System.out.println(list);
      
      list.add(5);
      list.add(6);
      list.add(7);
      System.out.println(list);
      //size();
      System.out.println(list.size());
      //get(idx)
      System.out.println(list.get(2));
	}

}
