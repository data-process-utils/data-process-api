package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Base64;

public class JsonSearchEngine extends AbstractSearchEngine {

    @Override
    public Object search(FilterInfo info) {
        try {


            byte[] fileContent = Base64.getDecoder().decode(info.getFileContent());
            String jsonStr = new String(fileContent);

            ObjectMapper mapper = new ObjectMapper();
            Object targetValue = mapper.readValue(jsonStr, Object.class);
//            jsonNode.isArray()


            System.out.println(jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "teste";
    }
}
