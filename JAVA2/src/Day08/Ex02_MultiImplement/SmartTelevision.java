package Day08.Ex02_MultiImplement;

public class SmartTelevision implements SmartRemoteControl, Searchable {

	int volume;				// 볼륨
	int channel;			// 채널
	String keyword;			// 검색어
	int x, y;				// 터치패드 좌표
	
	@Override
	public void turnOn() {
		s
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void syso(String voice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int channerlSearch(String keyword) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String[] contentSearch(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void touch(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
