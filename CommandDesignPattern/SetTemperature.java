package CommandDesignPattern;

public class SetTemperature implements ICommand{
	
	AirConditioner ac;
	SetTemperature(AirConditioner ac){
		this.ac=ac;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ac.setTemperature(27);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ac.setTemperature(25);
	}

}
