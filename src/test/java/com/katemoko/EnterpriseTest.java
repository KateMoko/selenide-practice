package com.katemoko;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class EnterpriseTest extends TestBase{
    @Test
    void openEnterpriseSolutionsViaMenu() {
        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $("[href='/enterprise']").click();
        $("div.enterprise-hero").shouldHave(text("GitHub for enterprises"));
    }
}
