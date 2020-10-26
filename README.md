# Auto tests demo project

1. Открыть проект с помощью IntelliJ IDEA
2. Открыть панель Maven 
3. Открыть пункт demoproject/Lyfecycle
4. Выбрать элементы clean, validate, compile, test
5. Нажать кнопку Run Maven Build
6. После выполнения тестов открыть терминал
7. Ввести команду "mvn allure:report"
8. Перейти в проекте в дирректорию "\target\site\allure-maven-plugin"
9. Открыть файл index.html

***Примечание:***
Файл очета может не открыться в браузерах Chrome и FireFox в Microsoft Edge файл открывается корректно. 

***Тест OsagoPageCheckCalkNegativeTest***
Данный тест намеренно приводит к ошибке. Для исправления работы теста необходимо:
1. Открыть класс "src/main/java/constant/Constant"
2. Изменить значение константы "ERROR_MESSAGE" удалив "!".