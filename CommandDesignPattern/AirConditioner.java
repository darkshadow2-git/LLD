package CommandDesignPattern;

public class AirConditioner {
	boolean isOn;
	int temperature;
	
	public void turnOnAC() {
		isOn=true;
		System.out.println("AC is On: ");
	}
	
	public void turnOffAC() {
		isOn=false;
		System.out.println("AC is Off: ");
	}
	
	public void setTemperature(int temperature) {
		this.temperature=temperature;
		System.out.println("AC temperature is set to " + temperature);
	}
}
