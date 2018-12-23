package com.guoyasoft.gyautotest.ui.testCase.test.xiaoli;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrgitator
 * @create: 2018-12-23 10:54
 **/
public class TestDemo extends BaseUI {
@Test
  public void Testui(){
  //打开网页
  driver.get("https://yulegh.github.io/vue-element-test/index.html");
  //元素定位“组件”
  WebElement Zujian = driver.findElement(By.xpath("//div[contains(text(),'组件')]"));
  //点击组件
  Zujian.click();
  //睡眠
  sleep(1);
  //元素定位“双向绑定”
  WebElement suangxiang =driver.findElement(By.xpath("//li[contains(text(),'双向绑定')]"));
  //点击双向绑定
  suangxiang.click();
  //睡眠
  sleep(1);
  //元素定位iframe页面
  WebElement iframe = driver.findElement(By.xpath("//iframe[@src=\"component/demoDataBindTwoWay.html\"]"));
 //页面切换到iframe
  driver.switchTo().frame(iframe);
  //睡眠
  sleep(1);
  //定位文本输入框
  WebElement input =driver.findElement(By.xpath("//*[@id=\"val1\"]"));
  //输入值
  input.sendKeys("1234");
  //睡眠
  sleep(5);
  //定位点击按钮
  WebElement dianji =driver.findElement(By.xpath("//*[@id=\"app\"]/button"));
  //点击按钮
  dianji.click();
  //睡眠
  sleep(1);
  //页面切换到alert并确定
  driver.switchTo().alert().accept();
  //页面回退
  driver.switchTo().defaultContent();
  //元素定位Table
  WebElement Tables =driver.findElement(By.xpath("//div[contains(text(),'Table')]"));
  //点击Table
  Tables.click();
  //睡眠
  sleep(1);





}
@Test
  public void Testui1 (){
  driver.get("https://yulegh.github.io/vue-element-test/index.html");
  sleep(2);
  WebElement shijian =driver.findElement(By.xpath("//div[contains(text(),'时间控件')]"));
  shijian.click();
  sleep(2);
  WebElement nianyue =driver.findElement(By.xpath("//li[contains(text(),'年月日时分')]"));
  nianyue.click();
  sleep(2);
  WebElement shifen =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/input"));
  shifen.click();
  /*
  sleep(2);
  WebElement nian  =driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/table[1]/tbody/tr[6]/td[5]/div/span"));
  nian.click();
  sleep(2);
  WebElement shi =driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[1]/span[2]/div[1]/input"));
  shi.click();
  sleep(2);*/
}
@Test
  public void HouTai (){
  //打开网页
  driver.get("http://blog.gdfengshuo.com/example/work/#/login");
  //元素定位登录
  WebElement denglu  = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[3]/button"));
  //点击登录
  denglu.click();
  //睡眠
  sleep(1);
  //定位后台图标
  WebElement houtai =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/i"));
  //点击后台图标
  houtai.click();
  //睡眠
  sleep(1);
  //定位基础表格
  WebElement jichu =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/ul/li[2]"));
  //点击基础表格
  jichu.click();
  //睡眠
  sleep(1);
  //元素定位编辑
  WebElement bianji =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div[2]/div[2]/div[3]/table/tbody/tr[3]/td[5]/div/button[1]"));
  //点击编辑
  bianji.click();
  //睡眠
  sleep(1);
  //元素定位地址旁边的输入框
  WebElement input=driver.findElement(By.xpath("//label[contains(text(),'地址')]/following::div//input"));
  //删除内容
  input.clear();
  //重新输入值
  input.sendKeys("重庆市开州");
  //睡眠
  sleep(1);
  //元素定位确定
  WebElement button =driver.findElement(By.xpath("(//button/span[contains(text(),'确 定')])[1]"));
  //点击确定
  button.click();
  //睡眠
  sleep(1);

  Actions action = new Actions(driver);
  action.moveToElement(driver.findElement(By.xpath("//a/i"))).perform();
  sleep(2);
  WebElement element = (new WebDriverWait(driver,5))
      .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='有2条未读消息' ]")));
   sleep(1);
}
}
