package stepDefs;

import org.apache.commons.io.FileSystemUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
	@Given("User is on CRM Home Page")
	public void user_is_on_crm_home_page() {
	System.out.println("User is on CRM Home Page");                                                  
	}
	
	@When("User create a new Tasks")
	public void user_create_a_new_tasks() {
	    System.out.println("User create a new Tasks");	
	    }
	
	@When("User update a Tasks")
	public void user_update_a_tasks() {
		System.out.println("User update a Tasks");
	    
	}
	
	@When("User delete new Tasks")
	public void user_delete_new_tasks() {
		System.out.println("User delete new Tasks");
	    
	}
	@When("User create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("User create a new contact");
	    
	}
	@When("User update a  contact")
	public void user_update_a_contact() {
		System.out.println("User update a  contact");
	   
	}
	@When("User delete new contact")
	public void user_delete_new_contact() {
		System.out.println("User delete new contact");
	   
	}
	
	@When("User create a new Deals")
	public void user_create_a_new_deals() {
		System.out.println("User create a new Deals");
	   
	}
	@When("User update a Deals")
	public void user_update_a_deals() {
		System.out.println("User update a Deals");
	}
	
	   
	@When("User delete new Deals")
	public void user_delete_new_deals() {
		System.out.println("User delete new Deals");
	   
	}
}
