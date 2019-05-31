package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 *
 * 业务层的接口
 * @return
 */
public interface BrandService {

    List<TbBrand> findAll();
}
