package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Result;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * 表现层
 * @return
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll() {
        return brandService.findAll();
    }

    @RequestMapping("/findById")
    public TbBrand findById(Long id) {
        return brandService.findById(id);
    }

    @RequestMapping("/save")
    public Result save(@RequestBody TbBrand tbBrand) {
        try {
            brandService.save(tbBrand);
            return new Result(true, "保存成功!!!!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "保存失败!!!!");
        }
    }

    @RequestMapping("/delete")
    public Result delete(Long id) {
        try {
            brandService.delete(id);
            return new Result(true, "删除成功!!!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/update")
    public Result update(@RequestBody TbBrand tbBrand) {
        try {
            brandService.update(tbBrand);
            return new Result(true, "修改成功!!!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }

    }

}
