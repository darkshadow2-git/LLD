package ChainOfResponsibilityDesignPattern;

public interface Handler {
	
	void setNextHandler(Handler handler);	
	
	void handle(String incomingSuspect);

}
