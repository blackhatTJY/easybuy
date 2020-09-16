package com.awsl.easybuy.service.imp;

import com.awsl.easybuy.bean.Product;
import com.awsl.easybuy.common.BaseDao;
import com.awsl.easybuy.common.BaseServiceImpl;
import com.awsl.easybuy.mapper.ProductMapper;
import com.awsl.easybuy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tjy
 */
@Service
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public BaseDao<Product> getBaseDao() {
        return productMapper;
    }
}
