package JiraSteps;

import io.qameta.allure.Step;

import static JiraElements.AuthorizElements.*;

public class AuthMethods {
    @Step("Вводится логин({username}) и пароль({pass})")
    public static void logIn(String username, String pass) {
        login.click();
        login.sendKeys(username);
        pas.click();
        pas.sendKeys(pass);
        submit.click();
    }
}
