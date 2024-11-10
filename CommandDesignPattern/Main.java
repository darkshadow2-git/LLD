package CommandDesignPattern;

public class Main {
	public static void main(String[] Args) {
		
		AirConditioner airConditioner = new AirConditioner();
		
		MyRemoteControl remoteControl = new MyRemoteControl();
		
		remoteControl.setCommand(new TurnOnCommand(airConditioner));
		remoteControl.pressButton();
		remoteControl.undo();
		remoteControl.pressButton();
		
		remoteControl.setCommand(new TurnOffCommand(airConditioner));
		remoteControl.pressButton();
		
		remoteControl.setCommand(new SetTemperature(airConditioner));
		remoteControl.pressButton(27);
		
	}
}
