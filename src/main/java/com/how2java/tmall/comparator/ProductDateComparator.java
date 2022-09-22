package com.how2java.tmall.comparator;

import com.how2java.tmall.pojo.Product;

import java.util.Comparator;

public class ProductDateComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1,Product p2){
        //p1位于前面,p2位于后面
        //compare 正数是交换,负数不变
        return p2.getCreateDate().compareTo(p1.getCreateDate());
    }
}
