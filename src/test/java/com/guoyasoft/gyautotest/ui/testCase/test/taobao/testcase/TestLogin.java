package com.guoyasoft.gyautotest.ui.testCase.test.taobao.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoHome;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoLogin;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoShopping;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 14:40
 **/
public class TestLogin extends BaseUI {
  @Test
  public void  testLogin(){
    driver.get("https://www.taobao.com/");
    //初始化淘宝首页
    //TaoBaoHome taoBaoHome = PageFactory.initElements(driver,TaoBaoHome.class);

    //调用针对每个元素的操作方法
    //taoBaoHome.clickLoginLink();

    //TaoBaoLogin taoBaoLogin = PageFactory.initElements(driver, TaoBaoLogin.class);
    //taoBaoLogin.clickLoginIcon();
   // taoBaoLogin.sendKeysLoginUserName("dongyadian2012");
    //taoBaoLogin.sendKeysLoginPassword("18860393942dyd");
    //taoBaoLogin.clickLoginButton();

    TaoBaoHome taoBaoHome = PageFactory.initElements(driver,TaoBaoHome.class);
    taoBaoHome.search("手机");

    TaoBaoShopping taoBaoShopping = PageFactory.initElements(driver, TaoBaoShopping.class);

    taoBaoShopping.clickphonepictureLink();
    //断言
    boolean actual=driver.getPageSource().contains("我的淘宝");
    Assert.assertEquals(actual,true);
  }
}
