package com.edisonmoreno.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Builder(toBuilder = true)
@Setter
@Getter
@ToString
public class Customer {
    private String id;
    private String name;
    private String lastname;
    private String fullName;
}
