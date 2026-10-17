package br.com.zenon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        CandidateProfile daviteste = new CandidateProfile(1L,"Dat", "Dat at ata", LocalDate.of(1995,10,28),null,  "52998224725",Gender.MASCULINO,
                 new Address("Rua Creuza ", 26, "Casa 01","Cajamar","São Paulo","07793580", "Brasil"),
                "Desenvolvedor Back End", 3,List.of("JAVA", "SQL", "SPRING BOOT", "Python", "WEB", "Git and Github", "AWS"),"linkTeste",
                new Contact("link@email.com", "11911111114","https://www.linkedin.com/in/teste/", "https://github.com/teste"));

        IO.println(daviteste);

        WebDriver driver = new FirefoxDriver();

        try{
            driver.get("https://stradalog.rhgestor.com.br/signup/index?returnUrl=/perfil/ConfirmaVaga?vaga=xIrYrYv54950XtcLqSr");
            AutoField autoField = new AutoField(driver);

            autoField.fillCandidateForm(daviteste);
            Thread.sleep(40000);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            driver.quit();
            System.out.println("Teste concluido com sucesso");
        }


    }
}
