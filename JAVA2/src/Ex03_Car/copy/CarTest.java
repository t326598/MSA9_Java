package Ex03_Car.copy;

public class CarTest {
public static void main(String[] args) {
	Car car = new Car();
	car.model = "투싼";
	// car.speed = 200;
	// private 으로 지정한 변수는 외부에서 접근 불가
	car.setSpeed(200);
	
	System.out.println("model : " + car.getModel());
	System.out.println("speed : " + car.getSpeed());
	
	car.setSpeed(-50);
	System.out.println("speed : " + car.getSpeed());
	car.setSpeed(400);
	System.out.println("speed : " + car.getSpeed());
	
	car.setSpeed(200);
	System.out.println("speed : " + car.getSpeed());
	
	
}
}
