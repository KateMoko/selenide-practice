package com.katemoko;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsTest extends TestBase{
    @Test
    void checkJUnit5Example(){
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("button.js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byTagAndText("a","SoftAssertions")).click();
        $("h1").shouldHave(text("SoftAssertions"));
        $("#wiki-body").shouldHave(text("Using JUnit5"));
    }
}