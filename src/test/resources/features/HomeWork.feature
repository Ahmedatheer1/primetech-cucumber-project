Feature: Add Item
    Verification of adding items

   Scenario: Successfully add a new item
      Given user is logged in successfully
      When the user is on the items page
      And the user clicks on the Add Item button
      And the user enters the item name
      And the user enters the item description
      And the user enters the item price "12.99"
      And the user selects the item unit "grams"
      And the user clicks on the Save Item button
      Then the item should be listed in the items table
