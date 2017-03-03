package cn.codingstar.model.persistent;

import java.util.Date;

/**
 * Description: BaseModel
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    BaseModel.java
 *          Create at:   2017/3/3
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/3           iCodingStar       1.0       1.0 Version
 */
public abstract class BaseModel {

    private Integer id;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
