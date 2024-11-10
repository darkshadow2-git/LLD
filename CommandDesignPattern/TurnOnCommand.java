package CommandDesignPattern;

public class TurnOnCommand implements ICommand {
	
	AirConditioner ac;
	
	TurnOnCommand(AirConditioner ac){
		this.ac=ac;
	}
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ac.turnOnAC();
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ac.turnOffAC();
	}
	
}
