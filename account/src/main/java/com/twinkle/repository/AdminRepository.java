package com.twinkle.repository;

import com.twinkle.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminRepository {
    public Admin login(String username,String password);
}
