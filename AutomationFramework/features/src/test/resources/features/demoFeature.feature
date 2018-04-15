Feature:
  Demo feature file for team management
  An incremental ID, read from property file is added to all the bellow titles for having unique names for consecutive test runs

  Scenario: Login and logout
    Given I launch "HUDL" website in "CHROME"
    And I log in
    When I navigate to "manage team" menu item
    And I create a new team named "VahidTestTeam"
    Then I should see the team named "VahidTestTeam"

    When I navigate to "Schedule" menu item
    And I create a new event named "Vahid Test Event"
    Then I should see the event named "Vahid Test Event"

    When I navigate to "upload" page
    And I upload the sample vide with title "TestVideo" for event "Vahid Test Event"
    And I navigate to "video" menu item
    Then I should see the video with title "TestVideo"

    And I share the vide with title "TestVideo" with team "VahidTestTeam"