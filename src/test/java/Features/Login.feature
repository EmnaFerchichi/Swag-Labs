Feature: Tester La fonctionnalité de connexion de l'utilisateur
  Scenario: Connexion avec des données valides
    Given l'utilisateur est sur le site Swag labs
    When Utilisateur saisit un UserName
    And Utilisateur saisit un Password
    And Utilisateur Clique sur le Bouton Login
    Then Utilisateur se redirigige vers son compte