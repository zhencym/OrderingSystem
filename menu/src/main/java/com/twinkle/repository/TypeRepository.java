package com.southwind.repository;

import com.southwind.entity.Type;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TypeRepository {
    public List<Type> findAll();
}
