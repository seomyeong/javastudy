package sm001.mod001;

public class MaxMin {

	public static void main(String[] args) {
		int[] score = {36,30,41,15,82};
		int max=score[0];
		int min=score[0];
		
		for(int i=0; i<score.length; i++) {
			if(max>score[i]) {
				max = score[i];
			}else if(min<score[i]) {
				min = score[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
}
