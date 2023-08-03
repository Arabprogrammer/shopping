package com.shopping.base.mapper;

import org.mapstruct.MappingTarget;

import java.util.Collection;

public interface BaseMapper<T, DTO> {

    DTO map(T t);

    T unMap(DTO dto);

    T unMap(@MappingTarget T t, DTO dto);

    Collection<DTO> map(Collection<T> entities);


}
