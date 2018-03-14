package mobile;

public class MobileConnect {
	  public static void main(String args[]){
			//	Customer cobj = new Customer(1, "Sam", 0);
			OperatorServices servicesObj = new OperatorServices();
			servicesObj.registerCustomer(2);
			servicesObj.generateBill();
			//cobj.showDetails();
	  }
}
