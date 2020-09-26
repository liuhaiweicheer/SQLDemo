package com.demo.id;

import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;

/**
 * 自定义生成主键 id
 * 1. 实现一个 ShardingKeyGenerator 实现类
 * @author lhw
 * @date 2020/9/21
 */
public class MyPositionId implements ShardingKeyGenerator {
    @Override
    public Comparable<?> generateKey() {
        //  返回主键值
        return null;
    }

    @Override
    public String getType() {
        //  主键类型
        return null;
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
