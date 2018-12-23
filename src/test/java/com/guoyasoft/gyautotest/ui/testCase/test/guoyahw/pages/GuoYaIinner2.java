package com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-21 10:56
 **/
public class GuoYaIinner2 extends BaseUI {
 @FindBy(xpath = "//img[@id='189_img' and @src='basicClass/images/icon/cross.jpg']")
private WebElement unfinishedButton;
  @FindBy(xpath = "//img[@id='189_img' and @src='basicClass/images/icon/tick.jpg']")
  private WebElement finishedButton;
}
