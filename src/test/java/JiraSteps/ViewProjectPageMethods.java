package JiraSteps;

import io.qameta.allure.Step;

import static JiraElements.ViewProjectPageElement.*;
import static com.codeborne.selenide.Selenide.sleep;

public class ViewProjectPageMethods {
    @Step("Выбор проекта: Test")
    public static void clickTestProject(){
        testProject.click();
        sleep(500);
    }
}
