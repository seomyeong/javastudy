package sm001.mod001JY;

public class Practice4_5 {
	public static void main(String[] args) {
		int[] mm = {10,5,33,2,90};
		int min=mm[0];
		int max=mm[0];
		
		for(int i=0; i<mm.length; i++) {
			if(mm[i] > min) {
				max=mm[i];
			}else if(mm[i] < min) {
				min=mm[i];
			}
		}
		System.out.println("최대값 : "+max+"\n최소값 : "+min);
	}
}
