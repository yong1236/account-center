package com.qianrenxi.accountcenter.repository;

import org.springframework.stereotype.Repository;

import com.qianrenxi.accountcenter.model.User;

public interface UserDao {
    public User save(User user);
}
