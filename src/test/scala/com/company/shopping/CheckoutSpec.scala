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
      checkout.total should be ("[Apple, Apple] => £0.60")

  }

    scenario("Scan oranges and output the price")  {
      Given("A checkout")
      val checkout = new Checkout
      checkout.items shouldBe empty

      When("scanning oranges as priced items")
      checkout.scan(List.fill(2)("Orange"))
      checkout.items should not be empty

      Then("the total cost can be calculated")
      checkout.total should be ("[Orange, Orange] => £0.50")

    }

  scenario("Scan apples and oranges and output the price")  {
    Given("A checkout")
    val checkout = new Checkout
    checkout.items shouldBe empty

    When("scanning apples and oranges as priced items")
    checkout.scan(List.concat(List.fill(2)("Apple"), List.fill(2)("Orange")))
    checkout.items should not be empty

    Then("the total cost can be calculated")
    checkout.total should be ("[Apple, Apple, Orange, Orange] => £1.10")

  }

  scenario("Buy one get one free on odd number of apples")  {
    Given("A checkout")
    val checkout = new Checkout
    checkout.items shouldBe empty

    When("scanning am odd number of apples as priced items")
    checkout.scan(List.fill(3)("Apple"))
    checkout.items should not be empty

    Then("the total cost can be calculated")
    checkout.total should be ("[Apple, Apple, Apple] => £1.20")

  }

  scenario("Three for the price of two on oranges")  {
    Given("A checkout")
    val checkout = new Checkout
    checkout.items shouldBe empty

    When("scanning 3 oranges as priced items")
    checkout.scan(List.fill(3)("Orange"))
    checkout.items should not be empty

    Then("the total cost can be calculated")
    checkout.total should be ("[Orange, Orange, Orange] => £0.50")

  }
}
