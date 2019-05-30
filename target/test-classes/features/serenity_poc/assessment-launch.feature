Feature: Test




  @Test
  Scenario Outline: Test
    Given As a user, I launch URL <username> , <password>

  Examples:
          | username     | password  |
          | anshul garg  | ansh@1234 |


 @Test123
  Scenario Outline: Testing google
      Given I launch URL with <url>
      When I enter word <serachingWord>

  Examples:
            | url                 | serachingWord |
            | https:google.com  | noida         |

  @Test-Rest
  Scenario Outline: Testing rest
        Given Verifying County Code with <CountryCodeAPI>

   Examples:
             | username    | password  |  url               | CountryCodeAPI                                         |
             | anshul garg | ansh@1234 | https://google.com | http://restapi.demoqa.com/utilities/weather/city/delhi |