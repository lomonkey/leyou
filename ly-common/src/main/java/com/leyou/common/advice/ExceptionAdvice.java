package com.leyou.common.advice;

import com.leyou.common.exception.ExceptionResult;
import com.leyou.common.exception.LyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * description       ：用于拦截所有 Controller的异常处理类
 *
 * @author ：lvhan
 * @version ：1.0
 * @date ：2019/11/22 20:23
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> lyExceptionHandler(LyException e) {
        return ResponseEntity.status(e.getExceptionEnum().getCode()).body(new ExceptionResult(e.getExceptionEnum()));
    }
}
