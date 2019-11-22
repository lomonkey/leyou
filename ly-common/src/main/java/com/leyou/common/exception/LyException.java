package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * description       ：
 *
 * @author ：lvhan
 * @version ：1.0
 * @date ：2019/11/22 20:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LyException extends RuntimeException{
    private static final long serialVersionUID = 5027161430423050535L;
    private ExceptionEnum exceptionEnum;
}
