package ChainOfResponsibilityDesignPattern;

public class PoliceSUVHandler extends abstractHandler{

	@Override
	public void handle(String incomingSuspect) {
		if(incomingSuspect == "PoliceSUVHandler") {
			System.out.println("PoliceSuvHandler did it's job");
			return ;
		}
		this.nextHandler.handle(incomingSuspect);
	}
}
