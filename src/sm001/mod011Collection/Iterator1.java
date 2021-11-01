package sm001.mod011Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(1)); //Wrapper class
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		Iterator it = list.iterator(); //객체를 가져온다
		while(it.hasNext()) {//가지고있는 객체를 계속 출력
			Integer integer = (Integer)it.next(); //형변환해야함
			System.out.println(integer.intValue());
		}
	}
}
