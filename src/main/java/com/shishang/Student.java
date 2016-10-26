package com.shishang;

import com.defineconstrain.CaseMode;
import com.defineconstrain.CheckCase;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Student implements Serializable {


    @NotNull(message = "名字不能为空")
    private String name;

    @Size(min = 6,max = 30,message = "地址应该在6-30字符之间")
    private String address;

    @DecimalMax(value = "100.00",message = "体重有些超标哦")
    @DecimalMin(value = "60.00",message = "多吃点饭吧")
    private BigDecimal weight;

    private String friendName;
    @AssertTrue
    private Boolean isHaveFriend(){
        return friendName != null?true:false;
    }

    @Future(message = "生日必须在当前时间之前")
    private Date birthday;

    @Pattern(regexp = "^(.+)@(.+)$",message = "邮箱的格式不合法")
    private String email;

    @CheckCase(value = CaseMode.LOWER,message = "名字的拼音需要小写")
    private String spellName;


    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
