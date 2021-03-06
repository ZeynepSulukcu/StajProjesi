Feature: Create Edit and Delete Functionality for Human Resources

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  Create , Edit and Delete Salary Types

    When User click on the element in the leftNav class
      | humanResources |
      | setupHR        |
      | salaryTypes    |

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | name | Group4NewSalaryType |

    And User click on the element in the dialog content class
      | userType     |
      | randomSelect |
      | saveButton   |

    Then User should see "successfully" message

    And User sending the keys in the dialog content class
      | searchName | Group4NewSalaryType |

    And User click on the element in the dialog content class
      | search |

    Then User edit "Group4NewSalaryType"

    And User sending the keys in the dialog content class
      | name | editedNewSalaryType |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    And User sending the keys in the dialog content class
      | searchName | editedNewSalaryType |

    And User click on the element in the dialog content class
      | search |

    When User delete "editedNewSalaryType"

    Then User should see "successfully" message
