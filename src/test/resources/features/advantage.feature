#autor: Juan Camilo Giraldo Gallego
Feature: page advantage
  As a user, I want to authenticate, register forms and add a product.

  Background:
    Given that camilo wants to enter the page


  Scenario: validate authentication in advantage
    When he user enter the datas
      | userName  | pass    |
      | camilo123 | Juan123 |
    Then he should see the user authentication


  Scenario: validate authentication in advantage failed
    When he user enter the datas
      | userName  | pass    |
      | camilo123 | Juan12 |
    Then he should see the failed message Incorrect user name or password.


  Scenario: register of contact form
    When he user registers the contact form
      | category | product                       | email                | subject                  |
      | Speakers | HP Roar Mini Wireless Speaker | admin@phptravels.com | the producto is Speakers |
    Then should see the result of contact us Thank you for contacting Advantage support.


  Scenario: register user
    When he user register the form
      | userName | email            | pass    | confirmPass | firName | lastName | phone    | conutry  | city   | address       | stage  | postalCode |
      | camiloG  | camilog@reto.com | Juan123 | Juan123     | Juan    | Giraldo  | 31344556 | Colombia | Caldas | parque caldas | Caldas | 5400434    |
    Then should see the result of the created user


  Scenario: add product from the speaker section
    When he user add product
      | product                       |
      | HP ROAR MINI WIRELESS SPEAKER |
    Then should see the result of adding the product


