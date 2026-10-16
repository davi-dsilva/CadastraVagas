package br.com.zenon;

public record Address(
        String streetAddress,
        String zipCode,
        int number,
        String addressComplement,
        String city,
        String stateProvince,
        String postalCode,
        String country

) {

}
