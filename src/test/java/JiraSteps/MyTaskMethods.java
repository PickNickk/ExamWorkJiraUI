package JiraSteps;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static JiraElements.MyTaskElements.*;
import static JiraSteps.ToolBarButtonsMethods.*;
import static SettingsProperties.Setting.getProperty;

public class MyTaskMethods {
    @Step("Название задачи")
    public static void themeName(){
        themeBug.click();
        themeBug.sendKeys(getProperty("newTaskName"));
    }
    @Step("Выбор типа задачи")
    public static void choseTask(){
        choseBugTask.click();
        choseBugTask.sendKeys(Keys.BACK_SPACE);
        choseBugTask.sendKeys(getProperty("taskTypeError"));
    }
    @Step("Описание задачи")
    public static void description(){
        descriptionBug.click();
        descriptionBug.sendKeys(getProperty("taskDescription"));
    }
    @Step("Выбор типа описания задачи")
    public static void clickText(){
        textButton.click();
    }
    @Step("Выбор в какой версии будет исправлена задача")
    public static void fixInVersions(){
        fixInVer.click();
    }
    @Step("Выбор приоритета задачи")
    public static void chosePriority(){
        priority.click();
        priority.sendKeys(Keys.BACK_SPACE);
        priority.sendKeys(getProperty("taskPriority"));
        priority.sendKeys(Keys.ENTER);
    }
    @Step("Описание окружения для задачи")
    public static void descriptionOfTheEnvironment(){
        environment.click();
        environment.sendKeys(getProperty("taskEnvironment"));
    }
    @Step("Выбор используемой версии")
    public static void versionsAffected(){
        verAffected.click();
    }
    @Step("Выбор доски Спринт")
    public static void choseSprint(){
        sprint.click();
        sprint.sendKeys(getProperty("taskSprint"));
    }
    @Step("Потверждение создания задачи")
    public static void submitCreate(){
        submit.click();
    }
    @Step("Вызов методов для исполнения создания задачи")
    public static void createTask(){
        clickCreateButton();
        choseTask();
        themeName();
        clickText();
        description();
        fixInVersions();
        chosePriority();
        descriptionOfTheEnvironment();
        versionsAffected();
        choseSprint();
        submitCreate();
    }
}
