package com.awsl.easybuy.mapper;

import com.awsl.easybuy.bean.Product;
import com.awsl.easybuy.common.BaseDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseDao<Product> {
    Product findItemByUserNameAndPassword();

}
