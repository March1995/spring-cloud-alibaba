package com.tuling.seata.vo;

import lombok.Data;

/**
 * Created by wyb on 2019/12/9.
 */
@Data
public class ResultVo {
    private boolean success;
    private String msg;
    private Object data;
}
