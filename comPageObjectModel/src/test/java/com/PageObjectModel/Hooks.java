package com.PageObjectModel;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {

    DriverManager dm = new DriverManager();

    @Before
    public void openBrowser() throws IOException
    {
        dm.getProperties();
        dm.invokeBrowser();
    }

    @After
    public void tearDown()
    {
//        dm.closeBrowser();

    }
}
