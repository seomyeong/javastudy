package sm001.mod001Array;

public class ArrayEx5_shuffle {
	public static void main(String[] args) {
		int[] arr = new int[10]; //int형 객체 10개 생성
		
		for(int i=0; i<arr.length; i++) { //배열 arr의 길이만큼=10번반복
			arr[i]=i;					  //arr[0]=0, arr[1]=1, arr[2]=2 ....arr[9]=9
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) { //100번반복
			int n = (int)(Math.random()*10); //int형 변수 n에 0~9사이의 수를 랜덤으로 저장
			int tmp = arr[0]; //변수 tmp에 arr[0] 저장
			arr[0] = arr[n]; //arr[0]에 arr랜덤값을 저장
			arr[n] = tmp;	//arr[n]에 arr[0] 저장
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
