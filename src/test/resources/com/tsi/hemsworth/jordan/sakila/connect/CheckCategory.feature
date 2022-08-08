Feature: Get the category name.
  Ensure the getter method for the category returns the right name.

  Scenario: Category name is Action.
    Given the category name is Action.
    When I ask what the category name is.
    Then I should be told "Action"

