package com.edisonmoreno.util;

import java.util.Arrays;
import java.util.Random;

public class IdentificationCode {
    public String Generate(String identification){
        return Arrays.stream(identification
                .split(""))
                .reduce("", (partial, element) -> partial.concat(element).concat("-"));
    }
}
