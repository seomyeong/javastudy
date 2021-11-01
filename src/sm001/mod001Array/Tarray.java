package sm001.mod001Array;

public class Tarray {
	public static void main(String[] args) {
		int tarray[] = new int[3];
		int i, k = 0;
		for(i=0; i<3; i++) {
			tarray[i]=k;
			k++;
			System.out.println(tarray[i]+"번"+k);
		}
	}
}
