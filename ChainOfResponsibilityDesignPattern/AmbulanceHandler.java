package ChainOfResponsibilityDesignPattern;

public class AmbulanceHandler extends abstractHandler{

	@Override
	public void handle(String incomingSuspect) {
		if(incomingSuspect == "AmbulanceHandler") {
			System.out.println("AmbulanceHandler did it's job");
			return ;
		}
		this.nextHandler.handle(incomingSuspect);
	}
	
}
