package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper tbBrandMapper;
    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.selectByExample(null);
    }

    @Override
    public TbBrand findById(Long id) {
        return tbBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(TbBrand tbBrand) {
        tbBrandMapper.insertSelective(tbBrand);
    }

    @Override
    public void delete(Long id) {
        tbBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(TbBrand tbBrand) {
        tbBrandMapper.updateByPrimaryKeySelective(tbBrand);
    }
}
