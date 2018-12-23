package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 14:17
 **/
  //  针对每个页面建立一个类
public class TaoBaoLogin extends BaseUI {
  //用@FindBy注解来定位页面元素，
  @FindBy(xpath = "//i[@id='J_Quick2Static']")
  //并把定位结果封装在一个变量中
  private WebElement loginIcon;

  @FindBy(xpath = "//input[@id = 'TPL_username_1']")
  private WebElement loginUserName;
  @FindBy(xpath = "//input[@id='TPL_password_1']")
  private WebElement loginPassword;
  @FindBy(xpath = "//button[@id='J_SubmitStatic']")
  private WebElement loginButton;

  //把针对每个元素的操作封装成方法
  public void clickLoginIcon(){
    //点击登录按钮
    click(loginIcon);
  }
  public void sendKeysLoginUserName(String userName){
    sendKeys(loginUserName,userName);
  }
  public void sendKeysLoginPassword(String password){
    sendKeys(loginUserName,password);
  }
  public void clickLoginButton(){
    click(loginButton);
  }
}
