package sm001.mod001Array;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		char[] chArr= {'a','b','c','d'};
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr2.length;i++) {
			arr2[i]=(int)(Math.random()*10)+1;
			System.out.print(arr2[i]+" ");
		}
	}
}
