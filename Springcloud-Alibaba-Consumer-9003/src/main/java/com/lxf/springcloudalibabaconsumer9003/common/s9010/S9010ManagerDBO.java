package com.lxf.springcloudalibabaconsumer9003.common.s9010;



/** 系统用户*/
public class S9010ManagerDBO
{
    /** 
     * 流水ID
     */
    private String puk = null;
 
    /** 
     * 用户账户
     */
    private String userName = null;
 
    /** 
     * 用户手机号码
     */
    private String phone = null;
 
    /** 
     * 登录密码
     */
    private String password = null;
 
    /** 
     * 用户姓名
     */
    private String name = null;
 
    /** 
     * 用户性别
     */
    private String sex = null;
 
    /** 
     * 用户邮箱
     */
    private String mail = null;
    private String meno = null;

    /**
     * 有效标识
     */
    private String delFlag = null;

    /**
     * 创建时间
     */
    private String createTime = null;

    /**
     * 创建者
     */
    private String creator = null;

    /**
     * 更新时间
     */
    private String updateTime = null;

    /**
     * 最后更新者
     */
    private String updator = null;


    /**
     * 备用1
     */
    private String fb1 = null;

    /**
     * 备用2
     */
    private String fb2 = null;

    /**
     * 备用3
     */
    private String fb3 = null;

    /**
     * 备用4
     */
    private String fb4 = null;

    /**
     * 备用5
     */
    private String fb5 = null;

    /**
     * 扩展1
     */
    private String eb1 = null;

    /**
     * 扩展2
     */
    private String eb2 = null;

    /**
     * 扩展3
     */
    private String eb3 = null;

    /**
     * 扩展4
     */
    private String eb4 = null;

    /**
     * 扩展5
     */
    private String eb5 = null;
 
    /** 
     * 数值型变量初始化<br>
     * 仅在插入场合默认调用
     */
    public void prepareNumeric() {
    }

    public String getPuk() {
        return puk;
    }

    public void setPuk(String puk) {
        this.puk = puk;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getFb1() {
        return fb1;
    }

    public void setFb1(String fb1) {
        this.fb1 = fb1;
    }

    public String getFb2() {
        return fb2;
    }

    public void setFb2(String fb2) {
        this.fb2 = fb2;
    }

    public String getFb3() {
        return fb3;
    }

    public void setFb3(String fb3) {
        this.fb3 = fb3;
    }

    public String getFb4() {
        return fb4;
    }

    public void setFb4(String fb4) {
        this.fb4 = fb4;
    }

    public String getFb5() {
        return fb5;
    }

    public void setFb5(String fb5) {
        this.fb5 = fb5;
    }

    public String getEb1() {
        return eb1;
    }

    public void setEb1(String eb1) {
        this.eb1 = eb1;
    }

    public String getEb2() {
        return eb2;
    }

    public void setEb2(String eb2) {
        this.eb2 = eb2;
    }

    public String getEb3() {
        return eb3;
    }

    public void setEb3(String eb3) {
        this.eb3 = eb3;
    }

    public String getEb4() {
        return eb4;
    }

    public void setEb4(String eb4) {
        this.eb4 = eb4;
    }

    public String getEb5() {
        return eb5;
    }

    public void setEb5(String eb5) {
        this.eb5 = eb5;
    }

    @Override
    public String toString() {
        return "S9010ManagerDBO{" +
                "puk='" + puk + '\'' +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
