package activities;
import java.util.*;
public class Activity10 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(90);
		hs.add(70);
		hs.add(120);
		hs.add(180);
		hs.add(220);
        System.out.println("Size of hashset :"+hs.size());
        hs.remove(1);
        hs.remove(6);
        System.out.println("check presence of element :"+hs.contains(70));
        for(int num:hs)
        {
        	System.out.println(num);
        }
	}

}
