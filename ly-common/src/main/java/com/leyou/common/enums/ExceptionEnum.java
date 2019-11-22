package com.leyou.common.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 异常的枚举类
 *
 * @date 2019年11月22日20:16:57
 * @author Lvdoudou
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ExceptionEnum {
    /** 品牌没有找到, 返回 400 错误代码*/
    BRAND_NOT_FOND(400, "品牌没有查询到")

    ;
    private int code;
    private String msg;
}
