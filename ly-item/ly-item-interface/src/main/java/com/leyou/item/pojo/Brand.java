package com.leyou.item.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * description       ：
 *
 * @author ：lvhan
 * @version ：1.0
 * @date ：2019/11/22 20:53
 */
@Data
@AllArgsConstructor
public class Brand implements Serializable {

    private static final long serialVersionUID = -3654937955389767268L;
    private String name;
}
