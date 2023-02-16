package io.buysa.json;

import org.json.JSONObject;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class JSONDeserializer<T> implements Deserializer {

    @Override
    public void configure(Map configs, boolean isKey) {

    }

    @Override
    public Object deserialize(String topic, byte[] data) {
        String bytestring = data.toString();
        JSONObject jsonbyte = new JSONObject(bytestring);
        return jsonbyte;
    }


    @Override
    public void close() {
        Deserializer.super.close();
    }
}
