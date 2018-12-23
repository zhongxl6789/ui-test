package com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-21 10:54
 **/
public class GuoYaLogin extends BaseUI {
  @FindBy(xpath = "//input[@id='userName']")
  private WebElement loginUserName;
  @FindBy(xpath = "//input[@id='password']")
  private WebElement loginPassWord;
  @FindBy(xpath = "//input[@id='loginBtn' ]")
  private WebElement loginButton;
  public void sendKeysLoginUserName(String username){
    sendKeys(loginUserName,username);
  }
  public void sendKeysLoginPassword(String password){
    sendKeys(loginPassWord,password);
  }
  public void clickLoginButton(){click(loginButton);}

}
