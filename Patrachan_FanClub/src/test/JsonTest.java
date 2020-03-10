package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.ZipcodeData;

public class JsonTest {
	public ZipcodeData ConvertTest (String zipcode) {
		try {
			//objectmapperを使った処理内容
			ObjectMapper mapper = new ObjectMapper();
			ZipcodeData newAddress = mapper.readValue(src, ZipcodeData.class);
		} catch(JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
