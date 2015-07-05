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
      val checkout = new Checkout
      checkout.items shouldBe empty

      When("scanning apples as priced items")
      checkout.scan(List.fill(2)("Apple"))
      checkout.items should not be empty

      Then("the total cost can be calculated")
      checkout.total should be ("[Apple, Apple] => £1.20")

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
