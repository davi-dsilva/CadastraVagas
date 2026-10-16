package br.com.zenon;

import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        CandidateProfile daviteste = new CandidateProfile(1L,"Dat", "Dat at ata", LocalDate.of(1995,10,28),null,
                 new Address("Rua Creuza ", 26, "Casa 01","Cajamar","SP","077785888", "Brasil"),
                "Desenvolvedor Back End", 3,List.of("JAVA", "SQL", "SPRING BOOT", "Python", "WEB", "Git and Github", "AWS"),"linkTeste",
                new Contact("link@email", "11911111114","https://www.linkedin.com/in/teste/", "https://github.com/teste"));

        IO.println(daviteste.toString());



    }
}
