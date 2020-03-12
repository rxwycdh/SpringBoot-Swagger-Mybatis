package cn.gdpu.newretail.dto.param;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class StoreCategoryParam implements Serializable {
    /**
     * 分类logo
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "分类logo")
    private String logo;

    /**
     * 排序
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * 状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "状态")
    private Integer status;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}