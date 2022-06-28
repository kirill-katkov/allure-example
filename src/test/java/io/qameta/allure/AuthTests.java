package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AuthTests {
    @Test
    @AllureId("10721")
    @DisplayName("Авторизация через Google")
    @Tags({@Tag("blocker"), @Tag("web")})
    @Story("Авторизация через сторонние системы")
    @Owner("admin")
    @Feature("Авторизация")
    public void testGoogleAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Google");
        step("Авторизуемся как пользователь 'Mr.Random'", () -> {
            step("Вводим логин 'random-user' ");
            step("Вводим пароль 'random-pass' ");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Google", () -> {
            step("Имя 'Mr.Random'");
            step("Login 'random-user'");
            step("Аватарка");
        });
        step("Разлогиниваемся");
    }
}
