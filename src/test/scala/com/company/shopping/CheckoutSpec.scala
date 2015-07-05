package com.company.shopping

/**
 * Created by michaeldecourci on 05/07/15.
 */
import org.scalatest._

class CheckoutSpec extends FeatureSpec with GivenWhenThen with Matchers {
  info("Given a checkout system I want to scan items and output the price")

  feature("A checkout system scans apples and oranges and outputs the total price")_
    scenario("Scan apples and output the price")  {
      Given("A checkout")

      When("scanning apples as priced items")

      Then("the total cost can be calculated")
    }

    scenario("Scan oranges and output the price")  {
      Given("A checkout")

      When("scanning oranges as priced items")

      Then("the total cost can be calculated")
  }

  scenario("Scan apples and oranges and output the price")  {
    Given("A checkout")

    When("scanning apples and oranges as priced items")

    Then("the total cost can be calculated")
  }
}
