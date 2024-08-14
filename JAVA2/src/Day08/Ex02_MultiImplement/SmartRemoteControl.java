package Day08.Ex02_MultiImplement;

// 인터페이스 다중 상속
// public interface 인터페이스명 extends 인터페이스A, 인터페이스 B....{}
public interface SmartRemoteControl extends RemoteControl, Microphone{

//터치패드 기능
	//x, t좌표 위치에 터치패드를 클릭
	void touch(int x, int y);
	
}
