package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PricingTest {

    @Test
    void hoverPricingTest() {
        open("https://github.com");
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(".HeaderMenu").$(byText("Compare plans")).click();
        $(".application-main ").shouldHave(text("Choose the plan that’s right for you."));
    }
}
