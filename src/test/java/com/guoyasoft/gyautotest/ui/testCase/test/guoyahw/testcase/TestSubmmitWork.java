package com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages.GuoYaHome;
import com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages.GuoYaIinner2;
import com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages.GuoYaInner1;
import com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages.GuoYaLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-21 10:57
 **/
public class TestSubmmitWork extends BaseUI {
  @Test
  public void testLogin() {
    driver.get("http://www.guoyasoft.com:8080/guoya-client/jsp/user/login.jsp");
    GuoYaLogin guoYaLogin = PageFactory.initElements(driver, GuoYaLogin.class);
    guoYaLogin.sendKeysLoginUserName("dongyd");
    guoYaLogin.sendKeysLoginPassword("144823");
    guoYaLogin.clickLoginButton();
    sleep(2);
  }
  @Test
  public void testUplodeSummary(){
    testLogin();
    //初始化果芽主页
    GuoYaHome guoYaHome = PageFactory.initElements(driver, GuoYaHome.class);
    //点击上传总结按钮
    guoYaHome.clickUploadSummary1811AButton();
    //切进IFRAME
    guoYaHome.switchToIframe(driver);
    //初始化上传总结页面
    GuoYaInner1 guoYaInner1 = PageFactory.initElements(driver, GuoYaInner1.class);
    //填入文件路径
    guoYaInner1.sendKeysPictureButton("C:\\Users\\Administrator\\Desktop\\作业\\c.png");
    sleep(3);
    //点击上传按钮
    guoYaInner1.clickInnerUploadSummaryButton();
    //确定弹框
    sleep(3);
    guoYaInner1.acceptAlert(driver);
    sleep(2);
    //切出IFRAME
    guoYaHome.switchOutIframe(driver);
sleep(2);}
@Test
public void testCheck(){
  testUplodeSummary();
    //初始化主页
  GuoYaHome guoYaHome = PageFactory.initElements(driver, GuoYaHome.class);
  //点击作业检查连接
  guoYaHome.homeworkCheck1811ALink();
  //切入IFRAME
  guoYaHome.switchToIframe(driver);
  //初始化检查作业页面
  GuoYaIinner2 guoYaIinner2 = PageFactory.initElements(driver, GuoYaIinner2.class);



  // GuoYaIinner2 guoYaIinner2 = PageFactory.initElements(driver, GuoYaIinner2.class);
    //guoYaHome.switchToIframe(driver);


  }

}
