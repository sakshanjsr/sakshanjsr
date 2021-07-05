#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@RegressionFeature
Feature: Live button Overview check
  I want to use this template for my feature file

@Sanity
Scenario: Login to https://sports.dc.betmgm.com/en/sports and check view
  Given You are inside the home page
  When Clicked on Live button on home page
  Then Validate the overview Tab
  
Scenario: Login to https://sports.dc.betmgm.com/en/sports and check viewNew Scenario
  Given You are inside the home page2
  When Clicked on Live button on home page2
  Then Validate the overview Tab2


