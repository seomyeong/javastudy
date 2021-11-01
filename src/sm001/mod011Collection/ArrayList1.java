package sm001.mod011Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);
		list.add(new Integer(3));
		list.add(new Integer(7));
		list.add(new Integer(1));
		list.add(new Integer(5));
		list.add(new Integer(4));
		
		ArrayList list2 = new ArrayList(list.subList(1, 4)); //subList() : 지정한 index의 객체 반환
		
		System.out.println(list); //[3, 7, 1, 5, 4]
		System.out.println(list2); //[7, 1, 5]
		
		Collections.sort(list); //Collections.sort() : 정렬
		Collections.sort(list2);
		
		System.out.println(list); //[1, 3, 4, 5, 7]
		System.out.println(list2); //[1, 5, 7]
		
		//containsAll : list2의 객체가 list에 포함되어있는지 확인. 참이면 true반환
		System.out.println("list.containsAll (list2) : "+list.containsAll(list2));
		
		for(int i=list2.size()-1; i>=0; i--) {
			if( list.contains(list2.get(i)) ) {
				list2.remove(i);
			}
		}
		System.out.println(list2);
	}
	
}
