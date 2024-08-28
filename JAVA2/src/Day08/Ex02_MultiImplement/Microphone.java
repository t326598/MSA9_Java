package Day08.Ex02_MultiImplement;

public interface Microphone {
	int inputVolueMax = 50; // 음성인식 최대 볼룸
	int inputVolumeMin = 0; // 음성인식 최소 볼륨
	
	//음성인식
	void syso(String voice);

}
