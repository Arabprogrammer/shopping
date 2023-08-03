package com.shopping.management.mapper;

import com.shopping.base.mapper.BaseMapper;
import com.shopping.management.dto.UserDto;
import com.shopping.management.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserDto> {
}
