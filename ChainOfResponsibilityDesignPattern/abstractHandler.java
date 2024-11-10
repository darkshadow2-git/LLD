package ChainOfResponsibilityDesignPattern;

public abstract class abstractHandler implements Handler{
	
	protected Handler nextHandler;
	
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler=nextHandler;
	}
}
