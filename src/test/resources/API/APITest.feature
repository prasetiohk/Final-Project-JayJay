@api
  Feature: API Testing

    @get-list
    Scenario: Get list of users sorted by registration date
      When users want to get information from website
      Then the requested data returned


    @user-id
    Scenario: Get full data by user id
      When users want to get information by user id
      Then the requested data returned by ID

    @create-user
    Scenario: Create new user and return created user data
      When user create a new user
      Then user created

    @update-user
    Scenario: Update user by ID and return updated User Data
      When update user data on ID
      Then user data Updated

    @delete-user
    Scenario: Delete user by id and return id of deleted user
      When delete user by id
      Then user deleted

    @Tags
    Scenario: Get list of tags
      When user want to get list of tags
      Then user get tag list