package JiraSteps;

import io.qameta.allure.Step;

import static JiraElements.AllTaskForPrintPageElements.*;

public class AllTaskForPrintPageMethods {
    @Step("Возвращение текста с результатом количества задач со страницы \"Для печати\"")
    public static String numberTasksResult() {
        return allTasksResult.getText();
    }
}
