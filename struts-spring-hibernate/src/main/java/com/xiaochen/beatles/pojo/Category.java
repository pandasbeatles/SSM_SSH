package com.xiaochen.beatles.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author xiaochen
 */
@Data
@Component("category")
public class Category {
    private int id;
    private String name;
}
