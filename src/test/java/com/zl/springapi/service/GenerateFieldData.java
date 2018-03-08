package com.zl.springapi.service;

import com.alibaba.fastjson.JSONObject;

public class GenerateFieldData {
    public static void main(String[] args){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("IPPROVINCELOCATION_NUM", "广东省_2,湖北省_3");
        jsonObject.put("GPSPROVINCELOCATION_NUM", "江西省_12,四川省_34");
        jsonObject.put("CERTNOPROVINCELOCATION_NUM", "广西壮族自治区_1,台湾省_65");
        jsonObject.put("MOBILELOCATION_NUM", "泰州市_2,运城市_12");
        jsonObject.put("IPLOCATION_NUM", "广州市_1,深圳市_2");
        jsonObject.put("CERTNOLOCATION_NUM", "重庆市_2,梧州市_1");
        jsonObject.put("GPSLOCATION_NUM", "哈尔滨_23,株洲_12,湘潭_43,长沙_0,永州市_32");
        jsonObject.put("MOBILEPROVINCELOCATION_NUM", "江苏省_33,陕西省_78,山西省_98");

        String result = JSONObject.toJSONString(jsonObject);

        System.out.println(result);

    }
}
