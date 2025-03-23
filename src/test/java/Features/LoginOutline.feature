Feature: Tester La fonctionnalite de connexion de lutilisateur
 Scenario Outline: Utilisateur se connecte avec des donnees invalides
    Given Utilisateur  est sur le site Swag labs
    When Utilisateur saisit username <username>
    And Utilisateur  saisit un Password <password>
    And Utilisateur  va Cliquer sur le Bouton Login
    Then Utilisateur  va se redirigige vers son compte
   Examples:
     |username|password|
     |"username"|"password"|
     |"ZLGJ"|"secret_sauce"|
     |"visual_user"|"BCGD"|


