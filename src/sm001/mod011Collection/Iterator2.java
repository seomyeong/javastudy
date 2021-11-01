package sm001.mod011Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator2 {
	public static void main(String[] args) {
		List Dog = new ArrayList();
		Dog.add("1");
		Dog.add("2");
		Dog.add("dog");
		Dog.add(3);
		Dog.add(new Integer(4));
		
		Iterator it = Dog.iterator();
		while(it.hasNext()) {
			Object obj = (Object)it.next();
			System.out.println(obj);
		}
		System.out.println("-------------------------");
		Iterator it2 = Dog.iterator();
		try {
			while(it2.hasNext()) {
				String str = (String)it2.next();
				System.out.println(it2.next()); 
			}
		}
		catch(Exception e) {
//			e.printStackTrace();
			System.out.print("오류 : "+e.getMessage());
		}
		
	}
}
