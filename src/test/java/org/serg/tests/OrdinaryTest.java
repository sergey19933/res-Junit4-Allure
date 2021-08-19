package org.serg.tests;


import org.junit.Test;
import org.serg.tests.base.BaseTests;


public class OrdinaryTest extends BaseTests {

    @Test
    public void startTest() {
        app.getHomePage()
                .selectBaseMenu("Вклады")
                .selectSubMenu("Калькулятор доходности")
                .checkPage("Вклады")
                .choiceCurrency("Доллары США")
                .fillFieldPage("Сумма вклада","500000")
                .fillFieldPage("Ежемесячное пополнение","20000")
                .investment("12 месяцев")
                .clickCheckboxPage("Ежемесячная капитализация","Включить")

                .checkFillPage("К снятию через 12 месяцев:","720920,60")
                .checkFillPage("Начислено %:","920,60")
                .checkFillPage("Пополнение за 12 месяцев:","220000");



    }


}
