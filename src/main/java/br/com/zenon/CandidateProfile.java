package br.com.zenon;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public record CandidateProfile(
        Long id,
        String name,
        String lastName,
        LocalDate birthDate,
        Long age,
        Address address, //Record Address
        String currentJobTitle,  // Cargo atual
        int yearsOfExperience,   // Anos de experiência
      // Link do GitHub / Portfólio
        List<String> skills,     // Lista de competências (ex: Java, Spring, SQL)
        String resumeUrl ,
        Contact contact

        // Link para o currículo (PDF/Drive)

) {
    public CandidateProfile{

        if (birthDate != null) {
            age = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
        } else {
            age = 0L;
        }


    }

}