package com.unogwudan.model;

import lombok.*;

/**
 * Created by Daniel Unogwu on 21/06/20.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class VerifiedCardDetails {
    private String scheme;
    private String type;
    private String bank;
}
