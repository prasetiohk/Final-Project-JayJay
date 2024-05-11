@web
  Feature: About Us Video
  @[positive]_About_Us_Video_Running
    Scenario: [Positive] about us page is display video
      Given user is on About Us Page
      When user click Play Button
      Then about Us Video Displayed

  @[Close]_About_Us_Video
    Scenario: [close] play video at about us page
    Given user is on About Us Page
    When user click closed button video
    Then user is on HomePage