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



    @Test
    @AllureId("10728")
    @DisplayName("Авторизация через GitHub")
    @Tags({@Tag("blocker"), @Tag("web")})
    @Story("Авторизация через сторонние системы")
    @Owner("admin")
    @Feature("Авторизация")
    public void testGitHubAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через GitHub");
        step("Авторизуемся как пользователь user_name", () -> {
            step("Вводим логин user_login");
            step("Вводим пароль user_password");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из GitHub", () -> {
            step("Имя user_name");
            step("Login user_login");
        });
        step("Разлогиниваемся");
    }

    @Test

    @AllureId("10727")
    @DisplayName("Авторизация через Facebook")
    @Tags({@Tag("blocker"), @Tag("web")})
    @Story("Авторизация через сторонние системы")
    @Owner("admin")
    @Feature("Авторизация")
    public void testFacebookAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Facebook");
        step("Авторизуемся как пользователь Artem Eroshenko", () -> {
            step("Вводим логин eroshenkoam@gmail.com");
            step("Вводим пароль 12398123981231");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из GoogleFacebook", () -> {
            step("Имя Artem Eroshenko");
            step("Login eroshenkoam");
            step("Авататарка");
        });
        step("Разлогиниваемся");
    }

    @Test
    @DisplayName("Авторизация через Apple")
    @Tags({@Tag("blocker"), @Tag("web")})
    @Story("Авторизация через сторонние системы")
    @Owner("admin")
    @Feature("Авторизация")
    public void testAppleAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Apple");
        step("Авторизуемся как пользователь user_name", () -> {
            step("Вводим логин user_login");
            step("Вводим пароль user_password");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Apple", () -> {
            step("Имя user_name");
            step("Login user_login");
        });
        step("Разлогиниваемся");
    }

}
