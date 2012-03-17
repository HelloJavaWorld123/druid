package com.alibaba.druid.bvt.filter.wall;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.druid.filter.wall.WallConfig;
import com.alibaba.druid.filter.wall.WallUtils;

/**
 * 这个场景测试访问Oracle系统对象
 * 
 * @author admin
 */
public class OracleWallPermitVariantTest extends TestCase {

    public void test_permitTable() throws Exception {
        WallConfig config = new WallConfig();
        config.setVariantCheck(false);
        
        Assert.assertTrue(WallUtils.isValidateOracle("select UID from dual"));
        Assert.assertTrue(WallUtils.isValidateOracle("select USER from dual"));
        Assert.assertTrue(WallUtils.isValidateOracle("select user from dual"));
    }
    
}
