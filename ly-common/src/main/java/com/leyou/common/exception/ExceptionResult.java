package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * description       ：异常结果对象类
 *
 * @author ：lvhan
 * @version ：1.0
 * @date ：2019/11/22 20:45
 */
@Data
public class ExceptionResult {

    private int code;
    private String msg;
    private Long time;

    public ExceptionResult(ExceptionEnum exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.msg = exceptionEnum.getMsg();
        this.time = System.currentTimeMillis();
    }
}
