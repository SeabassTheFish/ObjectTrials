
public class ClassicYoYo extends YoYo {
	
	boolean isUnresponsive() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean hasCounterweight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void doThrow() {
		System.out.println("I'm a classic yoyo and I am throwing");
	}

}
