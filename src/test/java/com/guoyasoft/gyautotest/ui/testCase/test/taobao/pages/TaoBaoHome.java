package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 14:17
 **/
//  针对每个页面建立一个类
public class TaoBaoHome extends BaseUI {
  //用@FindBy注解来定位页面元素，
   // @FindBy(xpath = "//a[contains(text(),'亲，请登录')]")
    //并把定位结果封装在一个变量中
  //private WebElement loginLink;
   @FindBy(xpath = "//input[@id='q']")
   private WebElement searchInput;
    @FindBy(xpath = "//button[contains(text(),'搜索')]")
  private WebElement searchButton;
  //把针对每个元素的操作封装成方法
  //public void clickLoginLink(){click(loginLink);
  //}
  public  void search(String text){
    sendKeys(searchInput,text);
    click(searchButton);
  }



}
