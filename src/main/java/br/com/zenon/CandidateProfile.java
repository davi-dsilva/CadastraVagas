package br.com.zenon;
import java.time.LocalDate;
import java.util.List;

public record CandidateProfile(
        Long id,
        String name,
        String lastName,
        String email,
        String phone,
        LocalDate birthDate,
        Address address, //Record Address
        String currentJobTitle,  // Cargo atual
        int yearsOfExperience,   // Anos de experiência
        String linkedinUrl,      // Link do LinkedIn
        String githubUrl,        // Link do GitHub / Portfólio
        List<String> skills,     // Lista de competências (ex: Java, Spring, SQL)
        String resumeUrl         // Link para o currículo (PDF/Drive)
) {
    public CandidateProfile {
        if (email != null && !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
    }
}