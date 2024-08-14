package Day08.Ex01_Anonymous;

public interface RemoteControl {
	
	int MAX_SPEED = 300;
	int MIN_SPEED = 0;
	
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	
	default void parking(boolean check) {
		if(check) {
			System.out.println("주차");
			setSpeed(MIN_SPEED);
		}
		else{
			System.out.println("주행");
			setSpeed(MAX_SPEED);
			
		}
	}
	static void changeBetter() {
		System.out.println("배터리 교체");
	}

}
