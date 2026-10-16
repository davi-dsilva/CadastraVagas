package br.com.zenon;
import java.time.LocalDate;
import java.util.List;

public record CandidateProfile(
        Long id,
        String name,
        String lastName,
        LocalDate birthDate,
        int age,
        Address address, //Record Address
        String currentJobTitle,  // Cargo atual
        int yearsOfExperience,   // Anos de experiência
      // Link do GitHub / Portfólio
        List<String> skills,     // Lista de competências (ex: Java, Spring, SQL)
        String resumeUrl         // Link para o currículo (PDF/Drive)
) {

}