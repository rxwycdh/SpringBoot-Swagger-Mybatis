package cn.gdpu.newretail.service;

import cn.gdpu.newretail.dto.param.StoreCategoryParam;
import cn.gdpu.newretail.entity.StoreCategory;
import org.springframework.transaction.annotation.Transactional;

/**
 * @FileName GoodCategoryService
 * @Description
 * @Author jiuhao
 * @Date 2020/3/12 10:31
 * @Modified
 * @Version 1.0
 */
public interface StoreCategoryService {


    /**
     * 添加门店分类信息
     * @param param 门店分类信息参数
     * @return 结果数
     */
    @Transactional
    int insertStoreCategory(StoreCategoryParam param);

    /**
     * 获取门店分类
     * @param id 门店分类id
     * @return {@link StoreCategory}
     */
    StoreCategory getStoreCategory(Integer id);

    Long countStoreCategory(Integer id);


    int updateStoreCategory(Integer id, StoreCategoryParam param);

    int deleteStoreCategory(Integer id);

}
