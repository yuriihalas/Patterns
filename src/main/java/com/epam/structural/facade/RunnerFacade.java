package com.epam.structural.facade;

import com.epam.structural.facade.bo.AuthorisationBO;

public class RunnerFacade {

    public static void main(String[] args) {
        AuthorisationBO authorisation = new AuthorisationBO();
        authorisation.autorizeUser("yuri123", "321yuri");
    }
}
