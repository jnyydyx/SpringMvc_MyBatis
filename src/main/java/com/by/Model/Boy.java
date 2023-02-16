package com.by.Model;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "boy")
@Validated
public class Boy {
    private String name;

    private String firstName;

    @Min(18) @Max(45)
    private int age;

    private String[] hobbyArray;

    private Map girls;

    @Pattern(regexp = "^[a-zA-Z]\\w{5,17}$",message = "密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)")
    private String password;

    @Pattern(regexp = "^[0-9]+(\\.[0-9]{2})?$")
    @NotNull
    private String price;

    @Email
    private String email;

    @NotNull
    private String address;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
    private LocalDate birthday;
}
