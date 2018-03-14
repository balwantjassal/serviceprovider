package mobile;

class OperatorServices{
    Customer cust;
    // List of customers  should be declared 
    public void registerCustomer(int plan_type){
	cust = new Customer(1, "sam", plan_type);
	cust.plan_type = plan_type;
	// Customer should be added to list
	System.out.println("\n Customer registered with us successfully..");
        cust.showDetails();
    }
    public void generateBill(){
	System.out.println("\n Monthly Bill Generated for "+cust.name);
    }
    

}