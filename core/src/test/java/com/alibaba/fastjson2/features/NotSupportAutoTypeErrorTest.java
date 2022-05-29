package com.alibaba.fastjson2.features;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2_vo.Int1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NotSupportAutoTypeErrorTest {
    @Test
    public void test() {
        Int1 vo = new Int1();
        String str = JSON.toJSONString(vo, JSONWriter.Feature.WriteClassName);
        assertThrows(JSONException.class, () -> JSON.parseObject(str, Object.class, JSONReader.Feature.ErrorOnNotSupportAutoType));
    }
}
