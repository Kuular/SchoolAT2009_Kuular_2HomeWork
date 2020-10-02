package SberbankPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

//      Xpath меню, пригодятся
//      private By selectorMain = By.xpath("//span[contains(text(),'Главная')]");
//      private By selectorPurchases = By.xpath("//span[contains(text(),'Закупки')]");
//      private By selectorSales = By.xpath("//span[contains(text(),'Продажи')]");
//      private By selectorServices =By.xpath("//span[contains(text(),'Сервисы')];");
//      private By selectorTraining =By.xpath("//span[contains(text(),'Обучение')];");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
       String mainURL = "https://www.sberbank-ast.ru/";
        if(!driver.getTitle().contains("Сбербанк-АСТ"))
            driver.get(mainURL);
//        Это не работает
//        if (!"Сбербанк-АСТ".equals(driver.getTitle())) {
//            throw new IllegalStateException("This is not the Сбербанк-АСТ page");
    }

        public void collectMenu(){
        driver.get("https://www.sberbank-ast.ru/");
        WebElement firstElement = driver.findElement(By.xpath("//*[@class='master_open_menu']"));
        List<WebElement> list = firstElement.findElements(By.xpath("//li//span"));
        for(WebElement e: list){
            System.out.println(e.getText());
        }
    }
    // Проверка на открытие по вкладке
    public boolean openPage(){
        return driver.getTitle().contains("Сбербанк-АСТ");
    }

    public List<WebElement> clickMenu(String menuButton, List<WebElement> list1){
            for (WebElement e: list1) {
                if (list1.toString().equals(menuButton)) {
                    return list1;
                }
            }
            return null;
        }
    }
    // Создание нового PageObject по клику
//    public MainPage clickButtonMain() {
//        driver.findElement(selectorMain).click();
//        return new MainPage(driver);



