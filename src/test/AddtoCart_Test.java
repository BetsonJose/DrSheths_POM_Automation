package test;

import org.testng.annotations.Test;

import base.BaseClass;
import page.AddtoCart_Page;

public class AddtoCart_Test extends BaseClass
{
	@Test
	public void addtoCart()
	{
		AddtoCart_Page obj= new AddtoCart_Page(d);
		obj.btnClick(obj.acc);
		obj.btnClick(obj.createacc);
		obj.setValues(obj.fname, "betson");
		obj.setValues(obj.lname, "jose");
		obj.setValues(obj.email, "betson@gmail.com");
		obj.setValues(obj.pwd, "qwerty");
		obj.setValues(obj.search, "sunscreen");
		obj.btnClick(obj.product);
		obj.btnClick(obj.addtocart);
	}
	
	
	
}
