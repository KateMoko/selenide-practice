package com.katemoko;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest extends TestBase {
    SelenideElement columnA = $("#column-a"),
            columnB = $("#column-b");

    @Test
    void moveARectangleToBPlace() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        columnA.shouldHave(text("A"));
        columnB.shouldHave(text("B"));
        columnA.dragAndDropTo(columnB);
        sleep(5000);
        columnA.shouldHave(text("B"));
        columnB.shouldHave(text("A"));
    }
}
