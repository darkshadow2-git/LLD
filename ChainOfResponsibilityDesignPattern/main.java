package ChainOfResponsibilityDesignPattern;

public class main {
	public static void main(String[] args) {
		main demo = new main();
		Handler vehicleHandler = demo.getValidHandler();
		String vehicleType = "PoliceSUVHandler";
		vehicleHandler.handle(vehicleType);
	}
	
	public Handler getValidHandler() { 
		Handler civilianSUVHandler = new CivilianSUVHandler();
		Handler ambulanceHandler = new AmbulanceHandler();
		Handler fireTruckHandler = new FireTruckHandler();
		Handler policeSUVHandler = new PoliceSUVHandler();
		
		civilianSUVHandler.setNextHandler(ambulanceHandler);
		ambulanceHandler.setNextHandler(fireTruckHandler);
		fireTruckHandler.setNextHandler(policeSUVHandler);
		
		return civilianSUVHandler;
	}
}
