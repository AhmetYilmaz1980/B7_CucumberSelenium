Feature: The user should be able to edit profile

  Background:
    Given The user is on the login page


  Scenario: edit profile
    And The user logs in using "ahmetyilmaznnb2005@gmail.com" and "123456"
    When The user navigates to "Edit Profile" menu
    And The user select "Intern" as a career
    And The user chose 1 years of work experience
    And The user add "company" "Amazon"
    And The user add "website" "www.Amazon.com"
    And The user add "location" "OberHausen"
    And The user add "skills" "SDET,Istqb"
    And The user add "githubusername" "intern23"
    And The user add "bio" "New Company, new adventure"
    And The user clik submit buton
  @wip
  Scenario Outline:
    And The user logs in using "<email>" and "<password>"
    When The user navigates to "<Edit add Module>" menu
    And The user select "<StatusInfo>" as a career
    And The user chose 1 years of work experience
    And The user add "company" "<CompanyInfo>"
    And The user add "website" "<websiteInfo>"
    And The user add "location" "<City>"
    And The user add "skills" "<SkillsInfo>"
    And The user add "githubusername" "<githupInfo>"
    And The user add "bio" "<bioInfo>"
    And The user clik submit buton
    Examples:
      | email                        | password | Edit add Module | StatusInfo          | CompanyInfo | websiteInfo    | City       | SkillsInfo      | githupInfo | bioInfo                    |
      | ahmetyilmaznnb2005@gmail.com | 123456   | Edit Profile    | Intern              | Amazon      | www.Amazon.com | OberHausen | SDET,Istqb      | intern23   | New Company, new adventure |
      | student@study.net            | Test1234 | Edit Profile    | Student or Learning | Google      | www.google.com | Boston     | HTML,CSS,JS,PHP | student22  | Old Company, old adventure |
      | ahmetyilmaznnb2005@gmail.com | 123456   | Edit Profile    | Intern              | Amazon      | www.Amazon.com | OberHausen | SDET,Istqb      | intern23   | New Company, new adventure |