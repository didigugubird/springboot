package com.how2java.tmall.comparator;

import com.how2java.tmall.pojo.Product;

import java.util.Comparator;

public class ProductAllComparator implements Comparator<Product> {
    @Override
    //compare 1要交换,-1不交换
    public int compare(Product p1,Product p2){
        return p2.getSaleCount()*p2.getReviewCount() - p1.getSaleCount()*p1.getReviewCount();
    }

}
