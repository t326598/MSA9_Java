package Day08.DesignPattern.builder;

public class Pikachu {
	
	//변수
	int energy;
	String type;
	int level;
	
	// private 생성자
	private Pikachu(Builder builder) {
		this.energy = builder.energy;
		this.type = builder.type;
		this.level = builder.level;
	}
	
	// Builder 클래스 정의
	//* static 이너 클래스
	public static class Builder{
		private int energy;
		private String type;
		private int level;
		
		public Builder() {
			this(100,"",1);
		}

		
		public Builder(int energy, String type, int level) {
			this.energy = energy;
			this.type = type;
			this.level = level;
		}

		// 각각 변수를 지정하고 지정된 객체를 반환하는 메소드
		public Builder energy(int energy) {
			this.energy = energy;
			return this;
		}
		


		public Builder type(String type) {
			this.type = type;
			return this;
		}

		public Builder level(int level) {
			this.level = level;
			return this;
		}
		//객체를 생성해주는 메소드
		public Pikachu build() {
			return new Pikachu(this);
		}
	}
	
	// Builder 클래스 정의
	// * static 이너 클래스
	
	
	
	@Override
	public String toString() {
		return "Builder [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}

}
