Проект был создан для тестирования UI Jira. В проекте задействованы junit, maven, selenide, allure.

В pom.xml была замена версии для maven-surefire-plugin с 2.20 на 2.22.2. Для запуска тестов через консоль.

В файле application.properties может возкнуть проблема чтения символов киррилицы. Рекомендуется открыть настройки(File->Settings->File Encodings).
И поставить галочку в Transparent native-to-ascii conversion.

Это необходимо для прозрачного преобразования исходного кода в ASCII, чтобы отображались национальные символы (не определенные в ISO 8859-1) вместо соответствующих escape-последовательностей.

Если при первом открытие файла application.properties вместо символов киррилицы будут иные символы рекомендуется взять следующие данные:

#Create task

newTaskName= Баг сайта3119

taskTypeError=Ошибка

taskDescription=Долгая обработка сайта после добавления нового юзера.

taskPriority=High

taskEnvironment=Windows 10, Google chrome Версия 102.0.4951.62 (Официальная сборка),(64 бит).

taskSprint=Доска Спринт 2

taskSearchField=Автор задачи


#Task status

statusToDo=СДЕЛАТЬ
