Feature: Admin Login
  # scenario = test case
  # 1
  Scenario: Admin Login Valid
    Given Admin enter url web HRM
    When Admin enter username
    And Admin enter password
    And Admin click login button
    Then Admin login successful redirect page dashboard

  # 2
  Scenario: Admin Login Invalid with Wrong Username
    Given Admin enter url web HRM or Admin logout
    When Admin enter wrong username
    And Admin enter password
    And Admin click login button
    Then Admin invalid login