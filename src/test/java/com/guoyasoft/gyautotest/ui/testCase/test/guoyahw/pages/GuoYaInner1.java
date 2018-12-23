package com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-21 10:55
 **/
public class GuoYaInner1 extends BaseUI {
  @FindBy(xpath = "//input[@id='postFild']")
  private WebElement pictureButton;

  @FindBy(xpath = "//input[@id='uploadFileBtn']")
  private WebElement innerUploadSummaryButton;
//添加图片方法
  public void sendKeysPictureButton(String filePath) {
    sendKeys(pictureButton, filePath);
  }

  public void clickInnerUploadSummaryButton() {
    click(innerUploadSummaryButton);
  }

  public void acceptAlert(WebDriver driver ) {
    driver.switchTo().alert().accept();

  }


}

