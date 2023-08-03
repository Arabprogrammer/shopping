package com.shopping.management.mapper;

import com.shopping.base.mapper.BaseMapper;
import com.shopping.management.dto.UserDto;
import com.shopping.management.entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper extends BaseMapper<Role, UserDto> {
}
