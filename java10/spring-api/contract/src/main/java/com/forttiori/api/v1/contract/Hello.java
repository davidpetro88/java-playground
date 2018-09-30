package com.forttiori.api.v1.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Hello {
    private String message;
}
