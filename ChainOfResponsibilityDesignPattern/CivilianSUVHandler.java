package ChainOfResponsibilityDesignPattern;

public class CivilianSUVHandler extends abstractHandler{
	
	@Override
	public void handle(String incomingSuspect) {
		if(incomingSuspect == "CivilianSUCHandler") {
			System.out.println("Civilian SUV handler did it's job");
			return;
		}
		this.nextHandler.handle(incomingSuspect);
	}
	
}
