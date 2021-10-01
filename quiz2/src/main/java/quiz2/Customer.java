package quiz2;

public class Customer {

	private String customer_name;
	private String phone_no;
	private String address;
	private String type;
	
	
	public Customer()
	{
		customer_name="";
		phone_no="";
		address="";
		type="";
	}
	public Customer(String cname,String phno,String add,String ty) {
		customer_name=cname;
		phone_no=phno;
		address=add;
		type=ty;
		// TODO Auto-generated constructor stub
	}
	
	public String getCustomerName()
	{
		return customer_name;
	}
	
	public String getPhoneNo()
	{
		return phone_no;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setCustomerName(String cname)
	{
		this.customer_name=cname;
	}
	
	public void setPhoneNo(String pno)
	{
		this.phone_no=pno;
	}
	
	public void setAddress(String add)
	{
		this.address=add;
	}
	
	public void setType(String ty)
	{
		this.type=ty;
	}

	
}
