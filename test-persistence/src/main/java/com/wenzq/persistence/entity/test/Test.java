package com.wenzq.persistence.entity.test;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.wenzq.persistence.entity.BaseModel;

/**
 * <p>
 * 
 * </p>
 *
 * @author wenzq
 * @since 2018-11-26
 */
public class Test extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 名称
     */
    @TableField("name")
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
        ", id=" + id +
        ", name=" + name +
        "}";
    }
}
