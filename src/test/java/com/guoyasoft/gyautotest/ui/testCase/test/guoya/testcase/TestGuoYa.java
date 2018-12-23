package com.guoyasoft.gyautotest.ui.testCase.test.guoya.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages.GuooYaHome;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages.SearchInterview;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 15:12
 **/
public class TestGuoYa extends BaseUI {
  @Test
 public void testSearchInterview2(){
   driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
   GuooYaHome guooYaHome = PageFactory.initElements(driver, GuooYaHome.class);
    addScreenshot2Allure("果芽首页");
   guooYaHome.clickSearchInterviewLink();
   guooYaHome.switchToIframe(driver);
   SearchInterview searchInterview = PageFactory.initElements(driver, SearchInterview.class);
   searchInterview.sendKeysStudentNameInput("张继成");
   searchInterview.clickSearchButton();
   sleep(3);
 }
 @Test
  public void testSearchInterview1(){
    driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
    GuooYaHome guooYaHome = PageFactory.initElements(driver, GuooYaHome.class);
    guooYaHome.clickSearchInterviewLink();
    guooYaHome.switchToIframe(driver);
    SearchInterview searchInterview = PageFactory.initElements(driver, SearchInterview.class);
    searchInterview.sendKeysStudentNameInput("王鹏");
    searchInterview.clickSearchButton();
    sleep(3);
  }
}
