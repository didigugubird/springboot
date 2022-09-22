package com.how2java.tmall.comparator;

import com.how2java.tmall.pojo.Product;

import java.util.Comparator;

public class AllProductComparator implements Comparator<Product> {
    private String sort;

    public AllProductComparator(String sort){
        this.sort = sort;
    }

    @Override
    public int compare(Product p1,Product p2){
        int result;
        switch (sort){
            case ("all"):
                result = p2.getSaleCount()*p2.getReviewCount() - p1.getSaleCount()*p1.getReviewCount();
                break;
            case ("date"):
                result = p2.getCreateDate().compareTo(p1.getCreateDate());
                break;
            case ("price"):
                result = (int)(p1.getPromotePrice()-p2.getPromotePrice());
                break;
            case ("review"):
                result = p2.getReviewCount()-p1.getReviewCount();
                break;
            case ("saleCount"):
                result = p2.getSaleCount()-p1.getSaleCount();
                break;
            default:
                result =0;
                break;
        }
        return result;
    }
}
