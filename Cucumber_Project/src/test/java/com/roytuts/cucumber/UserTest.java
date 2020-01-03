package com.roytuts.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/cucumber" },features="C:\\Users\\NDIVHUVINCE\\Desktop\\Cucumber_Project\\src\\test\\java\\resources\\com\\roytuts\\cucumber\\user.feature")
public class UserTest {
}