package com.how2java.tmall.service;

import com.how2java.tmall.dao.UserDAO;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.User;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired UserDAO userDAO;

    public Page4Navigator<User> list(int start, int size, int navigatePages) {

        Sort sort = Sort.by(Sort.Direction.ASC, "id");

        Pageable pageable = PageRequest.of(start, size,sort);

        Page<User> pageFromJPA =userDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }

    public User getByName(String name){
        return userDAO.findByName(name);
    }

    public boolean isExist(String name){
        User user = getByName(name);
        return null!=user;
    }

    public void add(User user){
        userDAO.save(user);
    }
}
