package com.ec.springcloudcontract.controller;

import com.alibaba.fastjson.JSONObject;
import com.ec.springcloudcontract.response.GetNumberResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProviderController
 *
 * @author HeXiangBin
 * @date 2019-09-10
 */
@RestController
public class ProviderController {

    @RequestMapping("/get/number")
    public JSONObject getNumber() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("msg", "操作成功");
        GetNumberResponse response = new GetNumberResponse();
        response.setId(1);
        jsonObject.put("data", response);
        return jsonObject;
    }
}
