package com.twinkle.feign;

import com.twinkle.entity.User;
import com.twinkle.entity.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "user")
public interface UserFeign {

    @GetMapping("/user/findAll/{page}/{limit}")
    public UserVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit);

    @PostMapping("/user/save")
    public void save(@RequestBody User user);

    @DeleteMapping("/user/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
}
