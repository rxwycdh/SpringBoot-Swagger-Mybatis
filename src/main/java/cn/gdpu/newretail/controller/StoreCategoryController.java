package cn.gdpu.newretail.controller;

import cn.gdpu.newretail.common.api.CommonResult;
import cn.gdpu.newretail.dto.param.StoreCategoryParam;
import cn.gdpu.newretail.entity.StoreCategory;
import cn.gdpu.newretail.service.StoreCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @FileName GoodCategoryController
 * @Description
 * @Author jiuhao
 * @Date 2020/3/12 10:17
 * @Modified
 * @Version 1.0
 */
@Api(value = "/storeCategory", tags = "门店分类管理模块")
@CrossOrigin
@RequestMapping("/storeCategory")
@RestController
public class StoreCategoryController {

    @Autowired
    private StoreCategoryService storeCategoryService;

    @ApiOperation("添加门店分类")
    @RequestMapping(value = "/insertStoreCategory", method = RequestMethod.POST)
    public CommonResult insertGoodCategory(@RequestBody StoreCategoryParam param) {

        if(param.getStatus() > 2 || param.getSort() > 100) {
            return CommonResult.validateFailed("参数错误!");
        }
        int count = storeCategoryService.insertStoreCategory(param);

        if ( count > 0) {
            return CommonResult.success(count);
        }

        return CommonResult.failed("服务器错误,请联系管理员!");
    }

    @ApiOperation("查看门店分类")
    @RequestMapping(value = "/getStoreCategory/{id}", method = RequestMethod.GET)
    public CommonResult<StoreCategory> getGoodCategory(@PathVariable("id")Integer id) {
        return CommonResult.success(storeCategoryService.getStoreCategory(id));
    }

    @ApiOperation("更新门店分类")
    @RequestMapping(value = "/updateStoreCategory/{id}", method = RequestMethod.PUT)
    public CommonResult updateStoreCategory(@PathVariable("id")Integer id, @RequestBody StoreCategoryParam param) {

        if(storeCategoryService.countStoreCategory(id) == 0) {
            return CommonResult.failed("数据不存在");
        }

        if(param.getStatus() > 2 || param.getSort() > 100) {
            return CommonResult.validateFailed("参数错误!");
        }

        int count = storeCategoryService.updateStoreCategory(id, param);

        if(count > 0) {
            return CommonResult.success(count);
        }

        return CommonResult.failed("服务器错误,请联系管理员!");
    }

    @ApiOperation("删除门店分类")
    @RequestMapping(value = "/deleteStoreCategory/{id}", method = RequestMethod.DELETE)
    public CommonResult deleteStoreCategory(@PathVariable("id")Integer id) {

        if(storeCategoryService.countStoreCategory(id) == 0) {
            return CommonResult.failed("数据不存在");
        }

        int count = storeCategoryService.deleteStoreCategory(id);

        if(count > 0) {
            return CommonResult.success(count);
        }

        return CommonResult.failed("服务器错误,请联系管理员!");
    }




}
