package com.shopping.management.dto;

import com.shopping.base.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends BaseDto<Long> {

    private String firstName;

    private String lastName;
}
