package CommandDesignPattern;

public class TurnOffCommand implements ICommand {
	
	AirConditioner ac;
	
	TurnOffCommand(AirConditioner ac){
		this.ac=ac;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ac.turnOffAC();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ac.turnOnAC();
	}
	
}
