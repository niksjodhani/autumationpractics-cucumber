package com.automationpractice.Steps;

import com.automationpractice.pages.MyAccountPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;

public class AddToCartSteps {
    @And("^I add below product to cart$")
    public void iAddBelowProductToCart(DataTable dataTable) {
        List<String > product =dataTable.asList(String.class);
        for (int i = 0; i <= product.size(); i++) {
            {
                System.out.println(product.get(0));
                System.out.println(product.get(1));
                new MyAccountPage().clickOnCategory(product.get(0));
                new MyAccountPage().clickOnSubCategory(product.get(1));

            }


        }}
}
