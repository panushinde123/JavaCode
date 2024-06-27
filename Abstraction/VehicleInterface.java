//create an interface vehicle.create an abstract method start().create another method as the default method stop().
//create a static method horn().create a private method Maintenance().
//create another default method that uses this private method the name of the method is ServiceVehicle().
//create a class car which implements Vehicle and executes the method
package Abstraction;
 interface Vehicle
 {
	 void start();
	 default void stop()
	 {
		 System.out.println("Vehicle stopped..");
	 }
	 static void horn()
	 {
		 System.out.println("honk honk");
	 }
	 private void maintenace()
	 {
		 System.out.println("Last routine maintenance performed on 31st January");
	 }
	 default void service()
	 {
		 System.out.println("Vehicle Serviced: Yes");
		 maintenace();
	 }
 }
class Car implements Vehicle
{

	@Override
	public void start() {
		System.out.println("Vehicle Started..");
	}
}
public class VehicleInterface {
	public static void main(String[] args) {
	Car car=new Car();
	car.start();
	Vehicle.horn();
	car.service();
	car.stop();
	
	}

}
