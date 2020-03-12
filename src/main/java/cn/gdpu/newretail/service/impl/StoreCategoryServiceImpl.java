package cn.gdpu.newretail.service.impl;

import cn.gdpu.newretail.dto.param.StoreCategoryParam;
import cn.gdpu.newretail.entity.StoreCategory;
import cn.gdpu.newretail.entity.StoreCategoryExample;
import cn.gdpu.newretail.mapper.StoreCategoryMapper;
import cn.gdpu.newretail.service.StoreCategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @FileName GoodCategoryServiceImpl
 * @Description
 * @Author jiuhao
 * @Date 2020/3/12 10:50
 * @Modified
 * @Version 1.0
 */
@Service
public class StoreCategoryServiceImpl implements StoreCategoryService {

    @Autowired
    private StoreCategoryMapper storeCategoryMapper;

    @Override
    public int insertStoreCategory(StoreCategoryParam param) {

        StoreCategory storeCategory = new StoreCategory();

        BeanUtils.copyProperties(param, storeCategory);

        storeCategory.setModifiedTime(new Date());
        storeCategory.setCreateTime(new Date());

        return storeCategoryMapper.insertSelective(storeCategory);
    }

    @Override
    public StoreCategory getStoreCategory(Integer id) {
        return storeCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public Long countStoreCategory(Integer id) {
        StoreCategoryExample example = new StoreCategoryExample();
        example.createCriteria()
                .andIdEqualTo(id);
        return storeCategoryMapper.countByExample(example);
    }

    @Override
    public int updateStoreCategory(Integer id, StoreCategoryParam param) {

        StoreCategory storeCategory = new StoreCategory();

        BeanUtils.copyProperties(param, storeCategory);

        storeCategory.setId(id);
        storeCategory.setModifiedTime(new Date());

        return storeCategoryMapper.updateByPrimaryKeySelective(storeCategory);
    }

    @Override
    public int deleteStoreCategory(Integer id) {
        return storeCategoryMapper.deleteByPrimaryKey(id);
    }
}
