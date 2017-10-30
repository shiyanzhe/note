package com.syz.excel.pojo;

import java.math.BigDecimal;

public class User {
    private String name;

    private BigDecimal money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}