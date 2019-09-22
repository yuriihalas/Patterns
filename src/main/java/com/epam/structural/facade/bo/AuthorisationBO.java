package com.epam.structural.facade.bo;

import com.epam.structural.facade.page.HomePage;
import com.epam.structural.facade.page.WelcomePage;

public class AuthorisationBO {
    private WelcomePage welcomePage;
    private HomePage homePage;

    public AuthorisationBO() {
        welcomePage = new WelcomePage();
        homePage = new HomePage();
    }

    public void autorizeUser(final String login, final String password) {
        welcomePage.clickOnWelcomeButton();
        homePage.sendKeysLogin(login);
        homePage.sendKeysPassword(password);
        homePage.clickOnRegisterButton();
    }
}
