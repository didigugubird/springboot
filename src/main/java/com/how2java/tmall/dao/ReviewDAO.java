package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewDAO extends JpaRepository<Review,Integer> {
    //根据产品显示所有评论
    List<Review> findByProductOrderByIdDesc(Product product);
    //显示产品评论总数用的
    int countByProduct(Product product);
}
