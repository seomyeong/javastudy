package sm001.mod011Collection;

import java.util.*;

/**
 * ArrayList에 
 * 유비 50000.0
 * 관우 42000.0
 * 장비 38000.0
 * 공명 45000.0
 * 조조 45000.0
 * 를 추가하고,
 * salary를 내림차순으로 정렬하기
 * @author 82108
 *
 */
public class ArrayList2 implements Comparable<ArrayList2>{
	String name;
	double salary;
	
	public ArrayList2(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}

	@Override
	public int compareTo(ArrayList2 o) {
		if(this.salary > o.salary) {
			return -1;
		}else if(this.salary==o.salary) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		ArrayList2 a1 = new ArrayList2("체리", 5000.0);
		ArrayList2 a2 = new ArrayList2("지수", 3000.0);
		ArrayList2 a3 = new ArrayList2("도진", 6000.0);
		ArrayList2 a4 = new ArrayList2("청명", 2000.0);
		ArrayList2 a5 = new ArrayList2("케로", 4000.0);
	
		Set<ArrayList2> set = new TreeSet<>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		set.add(a4);
		set.add(a5);
		
		for(ArrayList2 al : set) {
			System.out.println(al.name+" : "+al.salary);
		}
	}
	
}

