package com.twinkle.repository;

import com.twinkle.entity.Order;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderRepository {
    public void save(Order order);
    public List<Order> findAllByUid(long uid,int index,int limit);
    public int countByUid(long uid);
    public void deleteByMid(long mid);
    public void deleteByUid(long uid);
    public List<Order> findAllByState(int state,int index,int limit);
    public int countByState(int state);
    public void updateState(long id,long aid,int state);
}
