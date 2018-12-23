package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 11:23
 **/
public class TaoBaoShopping extends BaseUI {
  @FindBy(xpath = "//img[@data-spm-anchor-id='a2e15.8261149.07626516002.i0.14c029b4Lw3jXV']")
  private  WebElement phonepictureLink;
  public void clickphonepictureLink(){click(phonepictureLink);}
}
