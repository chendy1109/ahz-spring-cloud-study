package com.pccc.clps.providerdept3002.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * 产品
 */
public class Product {
    private String id;
    private String name;
    private int type;//0 成品  1 半成品
    private String code;//编号
    private String imgsrc;//图片地址
    private BigDecimal price;//产品单价
    private Date addDate;
    private Date updateDate;

    public Product() {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.addDate = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
