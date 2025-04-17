@regression
Feature: Testing Clients End Points

  Scenario: Happy Path Create Clients (Client-Create Endpoint) --> POST
    Then User validates 'KateInc','kivi', 'My Test Company', and 'kate775@gmail.com' from end-point


    Scenario:  Happy Path Check Clients (Client-Check Endpoint) --> GET
      Then User validates 'KateInc','kivi', 'My Test Company', and 'kate775@gmail.com' from end-point Get

  Scenario:  Happy Path Check Clients (Client-Check Endpoint) --> PUT
    Then User validates 'KateLInc','kivi', 'My Test Company', and 'kate775@gmail.com' from end-point Put

  Scenario:  Happy Path Check Clients (Client-Check Endpoint) --> DELETE
    Then User validates 'KateInc','kivi', 'My Test Company', and 'kate775@gmail.com' Delete

  Scenario:  Happy Path Check the deleted Clients from Get End point --> GET
    Then User validates 'Internal server error' and 'Client not found' grom end point Get