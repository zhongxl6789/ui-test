package com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-21 17:12
 **/
public class GuoYaHome extends BaseUI {
  @FindBy(xpath ="//a[contains(text(),'上传总结')]" )
  private WebElement uploadSummary1811AButton;
  @FindBy(xpath = "//a[contains(text(),'作业检查')]")
  private WebElement homeworkCheck1811ALink;

  @FindBy(xpath = "//iframe")
  private WebElement iframe;

  public void clickUploadSummary1811AButton(){click(uploadSummary1811AButton);}
  public void homeworkCheck1811ALink(){
    click(homeworkCheck1811ALink);
  }
  public void switchToIframe(WebDriver driver) { driver.switchTo().frame(iframe); }

  public void switchOutIframe(WebDriver driver) { driver.switchTo().defaultContent(); }

}



