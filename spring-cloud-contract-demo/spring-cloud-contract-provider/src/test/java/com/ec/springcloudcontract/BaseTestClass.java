package com.ec.springcloudcontract;

import com.ec.springcloudcontract.controller.ProviderController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

/**
 * BaseTestClass
 *
 * @author HeXiangBin
 * @date 2019-09-10
 */
public class BaseTestClass {
    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new ProviderController());
    }
}
