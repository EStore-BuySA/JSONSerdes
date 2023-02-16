package io.buysa.json;

import org.json.JSONObject;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class JSONSerializer<T> implements Serializer {
    @Override
    public void configure(Map configs, boolean isKey) {

    }
    @Override
    public byte[] serialize(String topic, Object data) {
        if (data.getClass() == JSONObject.class){
            String jsonString = data.toString();

            return jsonString.getBytes();

        }else{
            return data.toString().getBytes();
        }

    }

    @Override
    public void close() {
        Serializer.super.close();
    }
}
