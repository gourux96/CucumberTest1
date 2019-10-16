Feature: Evaluate percentage

  Scenario: Modification de l'adresse d'un abonné résidant en France sans ou avec date d'effet
    Given Subscriber with "active" and "France"
   When  le conseiller connecté à "canal" modifie l'adresse de l'abonné "condition"
   Then the adress of subscriber is modified and saved in all its contracts
   And  a movment of modification of the adress is created

    Given Subscriber with "active" and "pologne"
    When  le conseiller connecté à "canal" modifie l'adresse de l'abonné "condition"
    Then the adress of subscriber is modified and saved in all its contracts
    And  a movment of modification of the adress is created