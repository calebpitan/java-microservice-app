package com.calebpitan.customer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
