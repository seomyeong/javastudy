package sm001.mod008Exception;

public class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException se){
			System.out.println("에러메시지"+se.getMessage());
			se.printStackTrace();
			System.out.println("저장공간을 확보하세요");
		}catch(MemoryException me) {
			System.out.println("에러메시지"+me.getMessage());
			me.printStackTrace();
			System.gc(); //가비지컬렉터를 실행하여 메모리를 늘린다
			System.out.println("재설치 시도하세요");
		}finally{
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("설치파일부족");
		}
		if(!enoughMemory()) {
			throw new MemoryException("저장공간부족");
		}
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}
	static boolean enoughSpace() {return false;}
	static boolean enoughMemory() {return true;}

}
class SpaceException extends Exception {
	public SpaceException(String msg) {
		super(msg);
	}
}
class MemoryException extends Exception{
	public MemoryException(String msg) {
		super(msg);
	}
}