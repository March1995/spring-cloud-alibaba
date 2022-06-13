package com.tuling.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by wyb on 2019/12/29.
 */
@Data
public class OrderInfoVo {

    private String orderNo;
    private String userName;
    private Date createDt;
    private String productNo;
    private Integer productCount;
}
