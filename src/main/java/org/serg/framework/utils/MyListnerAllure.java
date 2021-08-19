package org.serg.framework.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.junit4.AllureJunit4;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.serg.framework.managers.DriverManager;

public class MyListnerAllure extends AllureJunit4 {
    @Override
    public void testFailure(Failure failure) {
        Allure.getLifecycle().addAttachment("Scrin", "image/png", "png"
                , ((TakesScreenshot) DriverManager.getDriverManager().getDriver())
                        .getScreenshotAs(OutputType.BYTES));
        super.testFailure(failure);
    }

}
