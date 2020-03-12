package cn.gdpu.newretail.mapper;

import cn.gdpu.newretail.entity.StoreCategory;
import cn.gdpu.newretail.entity.StoreCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreCategoryMapper {
    long countByExample(StoreCategoryExample example);

    int deleteByExample(StoreCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StoreCategory record);

    int insertSelective(StoreCategory record);

    List<StoreCategory> selectByExample(StoreCategoryExample example);

    StoreCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StoreCategory record, @Param("example") StoreCategoryExample example);

    int updateByExample(@Param("record") StoreCategory record, @Param("example") StoreCategoryExample example);

    int updateByPrimaryKeySelective(StoreCategory record);

    int updateByPrimaryKey(StoreCategory record);
}