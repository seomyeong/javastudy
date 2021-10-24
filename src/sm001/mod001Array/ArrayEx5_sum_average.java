package sm001.mod001Array;
/**
 * 배열에 담긴 정수의 총합과 평균 구하기
 * @author 82108
 *
 */
public class ArrayEx5_sum_average {
	
	public static void main(String[] args) { //메인메서드도 메서드. 내부에 생성하는 변수는 명시적 초기화 필수
		int[] arr = {44,36,10,5,6};
		int sum=0;
		float avg=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		avg=(float)sum/arr.length;
		System.out.println("배열 arr의 총 합 : "+sum);
		System.out.println("배열 arr의 평균 : "+avg);
		
	}
}
