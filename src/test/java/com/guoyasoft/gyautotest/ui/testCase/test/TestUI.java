package com.guoyasoft.gyautotest.ui.testCase.test;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.sun.org.apache.bcel.internal.generic.Visitor;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-13 10:13
 **/
public class TestUI extends BaseUI {

  //文本输入框
  @Test
  public void testTextInput() {
    //打开网址
    driver.get("https://www.taobao.com/");
    //定位页面元素
    WebElement text = driver.findElement(By.xpath("//input[@id='q']"));
    //清空输入框
    text.clear();
    //往输入框中填值
    text.sendKeys("手机");
    //等待两秒
    sleep(2);
  }

  //按钮
  @Test
  public void testButton() {
    testTextInput();
    WebElement button = driver.findElement(By.xpath("//button[contains(text(),'搜索')]"));
    click(button);
    sleep(2);
  }

  //超链接
  @Test
  public void testLink() {
    //打开网址
    driver.get("https://www.taobao.com/");

    //定位网页元素
    WebElement link = driver
        .findElement(By.xpath("//li[@aria-label=\"查看更多\"]/a[contains(text(),'女装')]"));
    //点击
    link.click();
    //ctrl+点击
    //新建一个Actions类的实例
    Actions actions = new Actions(driver);
    //操作
    actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
    //shift+点击
    //Actions actions =new Actions(driver);
    // actions.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).perform();
    sleep(2);
  }

  //下拉框元素
  @Test
  public void testselect() {
    //获取网址
    driver
        .get("file:///C:/Users/Administrator/Documents/WeChat%20Files/dongyadian/Files/demo.html");
    //定位元素
    WebElement select = driver.findElement(By.xpath("//SELECT"));
    //操作
    Select selects = new Select(select);
    //可见的文本进行选择
    selects.selectByVisibleText("香蕉");
    sleep(2);
    //顺序进行选择
    selects.selectByIndex(0);
    sleep(2);
    //通过值选择
    selects.selectByValue("juzi");
    sleep(2);
  }

  //日期元素
  @Test
  public void testDate() {
    driver
        .get("file:///C:/Users/Administrator/Documents/WeChat%20Files/dongyadian/Files/demo.html");
    String js = "var xpath = \"//input[@type='date']\";"
        + "var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();"
        + "element.value=\"2018-12-13\";";
    JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
    jsDriver.executeScript(js);
    sleep(2);
  }

  //时间元素
  @Test
  public void testTime() {
    driver
        .get("file:///C:/Users/Administrator/Documents/WeChat%20Files/dongyadian/Files/demo.html");
    String js = "\"var xpath = \\\"//input[@type='time']\\\";"
        + "var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();"
        + "element.value=\\\"15:30\\\";\"";
    JavascriptExecutor jss = (JavascriptExecutor) driver;
    jss.executeScript(js);
    sleep(3);
  }

  //导航栏
  @Test
  public void testNavigate() {
    sleep(1);
    //浏览器获取淘宝的网页
    driver.get("https://www.taobao.com/");
    sleep(1);
    //浏览器获取京东的网页
    driver.get("https://www.jd.com/");
    sleep(1);
    //浏览器回上一步
    driver.navigate().back();
    sleep(1);
    //浏览器回前一步
    driver.navigate().forward();
    sleep(1);
    //浏览器刷新
    driver.navigate().refresh();
    sleep(1);
    //浏览器导航到淘宝的网页
    driver.navigate().to("https://www.taobao.com/");
    sleep(1);
  }

  //果芽登录界面自动化
  @Test
  public void testUserName() {
    sleep(2);
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
    sleep(2);
    WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
    WebElement checkcode = driver.findElement(By.xpath("//input[@id='checkCode']"));
    WebElement rebutton = driver.findElement(By.xpath("//input[@id='loginBtn']"));
    sleep(2);
    username.clear();
    username.sendKeys("dongyd");
    sleep(2);
    password.clear();
    password.sendKeys("144823");
    sleep(2);
    checkcode.clear();
    checkcode.sendKeys("12345");
    sleep(2);
    rebutton.click();
    sleep(2);
  }

  //注册页面
  @Test
  public void testguoyaSignUp() {
    //打开网页
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/signUp.jsp");
    sleep(2);
    //定位元素
    WebElement signusername = driver.findElement(By.xpath("//input[@id='userName']"));
    WebElement realname = driver.findElement(By.xpath("//input[@id='realName']"));
    WebElement signpassword = driver.findElement(By.xpath("//input[@id='password']"));
    WebElement signpassword2 = driver.findElement(By.xpath("//input[@id='password2']"));
    WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
    WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
    WebElement signcheckCode = driver.findElement(By.xpath("//input[@id='checkCode']"));
    WebElement submitBtn = driver.findElement(By.xpath("//input[@id='submitBtn']"));
//操作
    signusername.clear();
    signusername.sendKeys("dd");
    sleep(2);
    realname.clear();
    realname.sendKeys("董董");
    sleep(2);
    signpassword.clear();
    signpassword.sendKeys("dddddd");
    sleep(2);
    signpassword2.clear();
    signpassword2.sendKeys("dddddd");
    sleep(2);
    phone.clear();
    phone.sendKeys("18860393956");
    sleep(2);
    age.clear();
    age.sendKeys("18");
    sleep(2);
    signcheckCode.clear();
    signcheckCode.sendKeys("1234");
    sleep(2);
    submitBtn.click();
    sleep(2);
    //切换到警示框
    Alert alert = driver.switchTo().alert();
    //确认
    alert.accept();
    sleep(2);
  }

  //淘宝
  public void testTaoBao() {
    driver.get("https://www.taobao.com/");
    sleep(2);
    driver.findElement(By.xpath(""));
  }

  @Test
  public void testWindowSwitch() {
    driver.get("https://www.taobao.com/");
    driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'女装')]")).click();
    sleep(1);
    driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'男装')]")).click();
    sleep(1);
    driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'内衣')]")).click();
    sleep(1);
    driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'鞋靴')]")).click();
    sleep(1);
    //1.获取所有窗口的句柄
    Set<String> handles = driver.getWindowHandles();
    //2.使用foreach循环遍历set集合中句柄
    for (String h : handles) {
      //3.根据句柄切换窗口
      driver.switchTo().window(h);
      sleep(2);
      //4.根据窗口标题来判断当前是哪个窗口
      if (driver.getTitle().contains("淘宝女鞋")) {
        //5.结束当前循环
        break;
      }
    }
  }

  //数组
  @Test
  public void testContainer() {
    //数组
    //声明
    String[] strings = {"11", "22", "333", "444"};
    //不确定数组的内容，只确定长度（定长）
    //String[] strings1 = new String[5];
    //把数组里的第一个值改为555，顺序是0 1 2 3 分表代表第1个第2个第。。。个
    //strings[0] = "555";
    //取用第一个值
    System.out.println(strings[0]);
    //二维数组（二维数组就是相当于一维数组里的每一个值变成了一个一维数组）
    String[][] str2 = {{"1", "2", "3", "4"}, {"11", "22", "33", "44"},
        {"111", "222", "333", "444"}};
    //[3][4]代表二维数组长度为3，每个长度里的一维数组有4个值
    String[][] str21 = new String[3][4];
    System.out.println(str2[1][2]);

    //新增数组
    List<String> list = new ArrayList<String>();
    //增加数值
    list.add("111");
    list.add("222");
    list.add("333");
    //表示第2个值得位置增加一个值444
    list.add(1, "444");
    //取出第1-4个数值
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    //HashMap
    //新建一个map
    Map<String, String> map = new HashMap<String, String>();
    //存（key不能重复）
    map.put("姓名", "董亚典");
    map.put("性别", "女");
    map.put("年龄", "19");
    //取
    System.out.println(map.get("姓名"));
    //删
    map.remove("姓名");
    System.out.println(map.get("姓名"));

    //set
    Set<String> set = new HashSet<>();

    set.add("1111");
    set.add("2222");
    set.add("2222");

    for (String s : set) {
      System.out.println(s);
    }
  }

  @Test
  public void testIFrame() {
    driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
    driver.findElement(By.xpath("//a[contains(text(),'查询面试')]")).click();
    sleep(3);
    WebElement iframe = driver.findElement(By.xpath("//iframe"));
    driver.switchTo().frame(iframe);
    driver.findElement(By.xpath("//button[contains(text(),'查询')]")).click();
    sleep(3);
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//a[contains(text(),'面试统计')]")).click();
    sleep(3);
  }

  @Test
  public void testFor() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

    // for (int i =0;i<=7;i++){
    //System.out.println(arr[i]);}
    //for (int i=0;i<=arr.length -1;i++){
    //System.out.println(arr[i]);}
    for (int i : arr) {
      System.out.println(i);
    }
    List<String> list = new ArrayList<String>();
    list.add("2");
    list.add("4");
    list.add("6");
    list.add("8");
    list.add("10");
    list.add("12");
    list.add("14");
    list.add("16");
    for (int i = 0; i <= arr.length - 1; i = i + 2) {
      System.out.println(i);
    }
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("姓名", "董雅");
    map.put("年龄", "19");
    map.put("学历", "benke");
    for (String key : map.keySet()) {
      System.out.println(map.get(key));
    }
  }

  @Test
  public static void jiuJiu() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + "x" + i + "=" + (i * j) + "\t");
      }
      System.out.println();
    }
  }

  @Test
  public void tesZhiFu() {
    int buy = 3000;
    int yuE = 200;
    int yuEBao = 3000;
    int yinHangKa = 20000;
    if (yuE >= buy) {
      System.out.println("余额扣除" + buy);
    } else if (yuEBao >= buy) {
      System.out.println("余额宝扣除" + buy);
    } else if (yinHangKa >= buy) {
      System.out.println("银行卡扣除" + buy);
    } else {
      System.out.println("扣款失败");
    }
  }

  @Test
  public void testBuubble() {
    int[] arr = {17, 21, 14, 32, 8, 19};
    for (int i : arr) {
      System.out.println(i);}
      for (int i = arr.length - 1; i >= 1; i--) {
        for (int j = 0; j <= i-1; j++) {
          if (arr[j] > arr[j + 1]) {
            int a = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = a;
          }
        }
      }
    for (int i : arr) {
      System.out.println(i+"\t");
    }
    System.out.println();
    }
    //断言
  @Test
  public void testAssert(){
    driver.get("https://www.taobao.com/");
    driver.findElement(By.xpath("//a[contains(text(),'亲，请登录')]")).click();
    sleep(1);
    driver.findElement(By.xpath("//i[@id='J_Quick2Static']")).click();
    sleep(1);
    WebElement userName=driver.findElement(By.xpath("//input[@id='TPL_username_1']"));
    userName.clear();
    userName.sendKeys("dongyadian2012");
    WebElement password=driver.findElement(By.xpath("//input[@id='TPL_password_1']"));
    password.clear();
    password.sendKeys("18860393942dyd");
    driver.findElement(By.xpath("//button[@id='J_SubmitStatic']")).click();
    sleep(3);
    boolean actual=driver.getPageSource().contains("我的淘宝");
    Assert.assertEquals(actual,true);
  }
    }











