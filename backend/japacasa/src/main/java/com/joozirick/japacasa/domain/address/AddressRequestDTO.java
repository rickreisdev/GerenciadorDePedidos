package com.joozirick.japacasa.domain.address;

public record AddressRequestDTO(String street, String number, String neighborhood,
                                String extra_info, String zip_code) {
}
