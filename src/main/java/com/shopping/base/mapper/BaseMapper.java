package com.shopping.base.mapper;

import org.mapstruct.MappingTarget;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface BaseMapper<T, DTO> {

    DTO map(T t);

    T unMap(DTO dto);

    T unMap(@MappingTarget T t, DTO dto);

    List<DTO> map(List<T> entities);

    Set<DTO> map(Set<T> entities);

    List<T> unMap(List<DTO> entities);

    Set<T> unMap(Set<DTO> entities);


}
