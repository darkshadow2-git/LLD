package ChainOfResponsibilityDesignPattern;

public class FireTruckHandler extends abstractHandler {

	@Override
	public void handle(String incomingSuspect) {
		if(incomingSuspect == "FireTruckHandler") {
			System.out.println("FireTruckHandler did it's job");
			return;
		}
		this.nextHandler.handle(incomingSuspect);
	}
	
}