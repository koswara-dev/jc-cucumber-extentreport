Feature: Recruitment
  # scenario = test case
  Scenario: Admin Add Data Candidate
    Given Admin login web HRM
    And Admin go to menu Recruitment
    When Admin click button add
    And Admin select Vacancy
    And Admin select document resume
    # Lengkapi step definition