Feature: Tester La fonctionnalite de connexion de lutilisateur
  Scenario: Utilisateur se connecte avec des donnees valides
    Given Utilisateur est sur le site Swag labs
    When Utilisateur saisit username"standard_user"
    And Utilisateur saisit un Password "secret_sauce"
    And Utilisateur va Cliquer sur le Bouton Login
    Then Utilisateur va se redirigige vers son compte