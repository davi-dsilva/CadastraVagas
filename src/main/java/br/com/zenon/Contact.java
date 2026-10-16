package br.com.zenon;

public record Contact(String email, String phone, String linkedinUrl, String githubUrl) {
    public Contact {
        if (email != null && !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
    }
}
