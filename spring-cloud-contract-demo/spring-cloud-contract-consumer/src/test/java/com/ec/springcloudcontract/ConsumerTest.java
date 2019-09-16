package com.ec.springcloudcontract;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ec.springcloudcontract.response.GetNumberResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;


/**
 * ConsumerTest
 *
 * @author HeXiangBin
 * @date 2019-09-11
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
// repositoryRoot = "http://192.168.1.30:8081/nexus/content/repositories/snapshots/"
@AutoConfigureStubRunner(ids = {"com.ec.springcloud.contract:spring-cloud-contract-provider:+:8080"}, workOffline = true)
public class ConsumerTest {

    @Test
    public void consumerTest() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<JSONObject> exchange = restTemplate.exchange("http://localhost:8080/get/number", HttpMethod.GET, null, JSONObject.class);
        JSONObject body = exchange.getBody();
        Assert.assertNotNull(body);
        GetNumberResponse response = JSONObject.toJavaObject(body.getJSONObject("data"), GetNumberResponse.class);
        Assert.assertEquals(1, (int) response.getId());
        System.out.println(response);
    }
}
