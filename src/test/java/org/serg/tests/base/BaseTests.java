package org.serg.tests.base;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.serg.framework.managers.DriverManager;
import org.serg.framework.managers.InitManager;

import static org.serg.framework.utils.PropConst.BASE_URL;

import org.serg.framework.managers.PageManager;
import org.serg.framework.managers.TestPropManager;


public class BaseTests {


    /**
     * Менеджер страничек
     *
     * @see PageManager#getPageManager()
     */
    protected PageManager app = PageManager.getPageManager();

    /**
     * Менеджер WebDriver
     *
     * @see DriverManager#getDriverManager()
     */
    private final DriverManager driverManager = DriverManager.getDriverManager();

    @BeforeClass
    public static void beforeAll() {
        InitManager.initFramework();
    }

    @Before
    public void beforeEach() {
        driverManager.getDriver().get(TestPropManager.getTestPropManager().getProperty(BASE_URL));
    }

    @AfterClass
    public static void afterAll() {
        InitManager.quitFramework();
    }
}
