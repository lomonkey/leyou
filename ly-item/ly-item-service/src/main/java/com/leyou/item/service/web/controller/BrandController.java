package com.leyou.item.service.web.controller;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.pojo.Brand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description       ：
 *
 * @author ：lvhan
 * @version ：1.0
 * @date ：2019/11/22 20:56
 */
@RestController
@RequestMapping("brand")
public class BrandController {

    @GetMapping("{id}")
    public ResponseEntity<Brand> queryById(@PathVariable Integer id) {
        if (id % 2 == 0) {
//            throw new LyException(ExceptionEnum.BRAND_NOT_FOND);
            throw new LyException(ExceptionEnum.BRAND_NOT_FOND);
        }
        return ResponseEntity.ok(new Brand("测试"));
    }
}
