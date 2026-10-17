package br.com.zenon;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class AutoField {


    private final WebDriver driver;
    public AutoField(WebDriver driver) {
        this.driver = driver;

        }

    public void fillCandidateForm(CandidateProfile cd) {
        try {
            System.out.println("Procurando campos para preencher o texto");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String formatedDate = cd.birthDate().format(formatter);

            String gender = String.valueOf(cd.gender());

            WebElement inputNome = driver.findElement(By.name("NOME_COMPLETO"));
            inputNome.clear();
            inputNome.sendKeys(cd.name() + cd.lastName());
            System.out.println("nome: " + cd.name() + cd.lastName());

            WebElement inputCpf = driver.findElement(By.name("CPF"));
            inputCpf.clear();
            inputCpf.sendKeys(cd.cpf());
            System.out.println("email: " + cd.cpf());

            WebElement inputEmail = driver.findElement(By.name("EMAIL"));
            inputEmail.clear();
            inputEmail.sendKeys(cd.contact().email());
            System.out.println("email: " + cd.contact().email());

            WebElement repeatEmail = driver.findElement(By.name("EMAIL_REPETIDO"));
            repeatEmail.clear();
            repeatEmail.sendKeys(cd.contact().email());
            System.out.println("email: " + cd.contact().email());

            WebElement inputBirthday = driver.findElement(By.name("DATA_NASCIMENTO"));
            inputBirthday.clear();
            inputBirthday.sendKeys((formatedDate));

            WebElement inputGender = driver.findElement(By.name("GENERO"));
            inputGender.sendKeys(gender);

            WebElement inputPostalCode = driver.findElement(By.name("CEP"));
            inputPostalCode.sendKeys(cd.address().postalCode());

            WebElement stateProvince = driver.findElement(By.name("ESTADO"));
            Select state = new Select(stateProvince);
            //stateProvince.sendKeys(cd.address().stateProvince());
            state.selectByVisibleText(cd.address().stateProvince());
            wait(500);


            WebElement inputCity = driver.findElement(By.name("CIDADE"));
            wait(15);
            Select selectCity = new Select(inputCity);
            selectCity.selectByVisibleText(cd.address().city());
            wait(500);
            //inputCity.sendKeys(Keys.TAB);
            //inputCity.sendKeys(String.valueOf(cd.address().number()));

            //TODO: RESOLVER A ETAPA DE NUMERO NAO CARREGA JS
            wait(1500);
            WebElement addresNumber = driver.findElement(By.xpath("//*[@id=\"ENDERECO_NUMERO\"]"));
            addresNumber.click();
            addresNumber.clear();
            addresNumber.sendKeys(String.valueOf(cd.address().number()));





        }catch (Exception e){
            System.out.println("Erro ao preencher o texto" + e.getMessage());
        }
    }
}
