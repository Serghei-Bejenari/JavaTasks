Feature: Tad test

  Scenario: Add a new product option
    Given successful login is performed as administrator
    And admin user is on 'Main' page
    When user clicks on 'Catalog' button
    Then dropdown box is displayed
    When user clicks on 'Options' button
    Then 'Options' page is displayed
    When user clicks on 'Add new' button
    Then 'Add Option' page is displayed
    When user enters 'Option Name' and selected type 'text'
    And user clicks on 'Save' button
    Then new option is created
    And user is redirected to 'Options' page
    And new option is present