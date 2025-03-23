Feature: Tester La fonctionnalité d'Ajout Produit
  Background: Tester la connexion, Ajout et Suppression d'un produit
    Given utilisateur est sur le site Swag labs
    When utilisateur saisit un UserName
    And utilisateur saisit un Password
    And utilisateur Clique sur le Bouton Login
    Then utilisateur se redirigige vers son compte
    When Utilisateur clique sur le bouton Add Cart du produit Sauce Labs Backpack
    And Utilisateur Clique sur le logo Cart
    Then Utilisateur se redirigige vers la page Cart
    When utilisateur Clique sur le Bouton Remove
    Then la page cart devient vide

  Scenario: Déconnexion du compte de l'utilisateur
    When utilisateur Clique sur le Bouton Continue shopping
    And utilisateur clique sur le menu
    And utilisateur clique sur logout
    Then l'utilisateur se redirige vers la page Login

