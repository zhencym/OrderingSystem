package com.southwind.repository;

import com.southwind.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    public User login(String username,String password);
}
