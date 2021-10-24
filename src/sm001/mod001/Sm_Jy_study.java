package sm001.mod001;

public class Sm_Jy_study {
//	public static void sm() {
//		
//	}
	
	
	public static void main(String[] args) {
		
		int[] sm = {51,68,87};
		int[] jy = {44,79,71};
		int smSum=0;
		float smAverage=0;
		int jySum=0;
		float jyAverage=0;
		
		for(int i=0; i<sm.length; i++) {
			smSum+=sm[i];
		}
		smAverage= (float)smSum / sm.length;
		
		for(int i=0; i<jy.length; i++) {
			jySum+=jy[i];
		}
		jyAverage=(float)jySum/jy.length;
		
		
		System.out.println("서명의 국어점수 : "+sm[0]+", 서명의 영어점수 : "+sm[1]+", 서명의 수학점수 : "+sm[2]+"\n서명의 총합 : "+smSum+", "+"서명의 평균 : "+smAverage);
		System.out.println("지윤의 국어점수 : "+jy[0]+", 지윤의 영어점수 : "+jy[1]+", 지윤의 수학점수 : "+jy[2]+"\n지윤의 총합 : "+jySum+", "+"지윤의 평균 : "+jyAverage);
	}
}
