package com.shopping.management.dto;

import com.shopping.base.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDto extends BaseDto<Long> {

    private String name;

}
