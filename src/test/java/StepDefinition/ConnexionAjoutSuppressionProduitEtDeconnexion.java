package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnexionAjoutSuppressionProduitEtDeconnexion {
    WebDriver driver;

    @Given("utilisateur est sur le site Swag labs")
    public void utilisateur_est_sur_le_site_swag_labs() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("utilisateur saisit un UserName")
    public void utilisateurSaisitUnUserName() {
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

    }

    @And("utilisateur saisit un Password")
    public void utilisateurSaisitUnPassword() {
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
    }

    @And("utilisateur Clique sur le Bouton Login")
    public void utilisateurCliqueSurLeBoutonLogin() {
        driver.findElement(By.cssSelector("#login-button")).click();

    }

    @Then("utilisateur se redirigige vers son compte")
    public void utilisateurSeRedirigigeVersSonCompte() {
        System.out.println("l'utilisateur est redirigé vers : "+ driver.getCurrentUrl());
    }

    @When("Utilisateur clique sur le bouton Add Cart du produit Sauce Labs Backpack")
    public void utilisateurCliqueSurLeBoutonAddCartDuProduitSauceLabsBackpack() {
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
    }

    @And("Utilisateur Clique sur le logo Cart")
    public void utilisateurCliqueSurLeLogoCart() {
        driver.findElement(By.cssSelector("#shopping_cart_container > a")).click();
    }

    @Then("Utilisateur se redirigige vers la page Cart")
    public void utilisateurSeRedirigigeVersLaPageCart() {
        System.out.println("l'utilisateur est redirigé vers : "+ driver.getCurrentUrl());
        if(driver.getPageSource().contains("Sauce Labs Backpack"))
        {System.out.println("Produit ajouté avec succès");}
        else {System.out.println("Produit Non Ajouté"); }

    }

    @When("utilisateur Clique sur le Bouton Remove")
    public void utilisateurCliqueSurLeBoutonRemove() {
        driver.findElement(By.cssSelector("#remove-sauce-labs-backpack")).click();

    }

    @Then("la page cart devient vide")
    public void laPageCartDevientVide() {
        if(!driver.getPageSource().contains("Sauce Labs Backpack"))
        {System.out.println("Produit supprimé avec succès"); ;}
        else {System.out.println("Produit Non supprimé"); ;}
    }

    @When("utilisateur Clique sur le Bouton Continue shopping")
    public void utilisateurCliqueSurLeBoutonContinueShopping() {
        driver.findElement(By.cssSelector("#continue-shopping")).click();

    }

    @And("utilisateur clique sur le menu")
    public void utilisateurCliqueSurLeMenu() {
        driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
    }

    @And("utilisateur clique sur logout")
    public void utilisateurCliqueSurLogout() {
        driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
    }

    @Then("l'utilisateur se redirige vers la page Login")
    public void lUtilisateurSeRedirigeVersLaPageLogin() {
        if(!driver.getPageSource().contains("Login"))
        {System.out.println("utilisateur redirigé vers la page Login avec succès"); ;}
        else {System.out.println("utilisateur n'est pas redirigé vers la page Login"); ;}

    }
}
