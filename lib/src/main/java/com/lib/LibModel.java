package com.lib;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LibModel {
    @NotBlank
    @jakarta.validation.constraints.NotBlank
    private String name;
}
