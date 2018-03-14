package mobile;

class Customer{
    int customer_id;
    String name;
    int plan_type;
    // Concept of Constructors
    public Customer(int id, String cname, int ptype){
	this.customer_id = id;
	this.name = cname;
	this.plan_type = ptype;	
    }

    public void showDetails(){
	System.out.println("Customer Name: "+name+"\n Customer ID:"+customer_id+"\n Plan Opted:"+plan_type);
    }

}