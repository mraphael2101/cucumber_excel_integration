package com.api.cucumber.stepdfn;

import java.util.List;

import com.api.cucumber.transform.ExcelDataToDataTable;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MyStepDfn {
	
	@Given("^The User is at the XXX page of the application$")
	public void the_user_is_at_the_XXX_page_of_the_application() throws Throwable {
	}

	@When("^The User performs some action using the data from \"([^\"]*)\"$")
	public void the_user_performs_some_action_using_the_data_from(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
		System.out.println(table.toString());
		List<String> dataList = table.asList(String.class);
		for(String str : dataList){
			System.out.println(str);
		}
	}
}
