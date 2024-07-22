package com.est.jobstargram.Domain;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
@Value
public class UserDto implements Serializable {
    String Id;
}