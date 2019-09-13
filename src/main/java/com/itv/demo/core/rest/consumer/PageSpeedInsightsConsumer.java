package com.itv.demo.core.rest.consumer;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@PropertySource(
        {
                "classpath:/application.properties"
        })
public class PageSpeedInsightsConsumer {

    @Value("${app.google.pageSpeedInisght}")
    private String pagespeedApi;

    public JSONObject consumrPagSpeedInsight(String url){
        try {
            log.info("Calling Page speed Inisght google Api ..");
            return Unirest.get(pagespeedApi)
                        .queryString("url",url)
                        .asObject(JSONObject.class).getBody();
        } catch (UnirestException e) {
            log.error("Error Calling Api");
            return null;
        }
    }
}
