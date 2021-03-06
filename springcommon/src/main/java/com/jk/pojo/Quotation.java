package com.jk.pojo;

public class Quotation {

    private String id;      //主键id

    private String brand;   //品牌

    private String price;   //单价

    private String servicename; //服务名称

    private String serviceprice;    //服务价格

    private String texts;   //备注

    private String accessory;  //附件

    private String period;  //供货周期

    private String validtime;   //有效时间

    private String groupprice;  //组合单价

    private String serveprice;  //服务总价

    private String itemprice;   //项目总价

    private String quotationtime;//报价时间

    private String materials;   //材料表id

    private String userid;      //登录人id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getServiceprice() {
        return serviceprice;
    }

    public void setServiceprice(String serviceprice) {
        this.serviceprice = serviceprice;
    }

    public String getTexts() {
        return texts;
    }

    public void setTexts(String texts) {
        this.texts = texts;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getValidtime() {
        return validtime;
    }

    public void setValidtime(String validtime) {
        this.validtime = validtime;
    }

    public String getGroupprice() {
        return groupprice;
    }

    public void setGroupprice(String groupprice) {
        this.groupprice = groupprice;
    }

    public String getServeprice() {
        return serveprice;
    }

    public void setServeprice(String serveprice) {
        this.serveprice = serveprice;
    }

    public String getItemprice() {
        return itemprice;
    }

    public void setItemprice(String itemprice) {
        this.itemprice = itemprice;
    }

    public String getQuotationtime() {
        return quotationtime;
    }

    public void setQuotationtime(String quotationtime) {
        this.quotationtime = quotationtime;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}