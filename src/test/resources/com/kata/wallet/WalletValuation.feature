# Created by t.lejeune at 15/12/2021
Feature: wallet valuation
  # Enter feature description here

  Rule: empty wallet valuate to 0

  Scenario: EUR valuation
    Given an empty wallet
    When user valuates it in EUR
    Then its value should be 0 EUR
