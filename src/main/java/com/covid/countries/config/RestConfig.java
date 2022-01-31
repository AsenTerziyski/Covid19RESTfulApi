package com.covid.countries.config;

import com.covid.countries.repository.CountriesCovidInfoRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.modelmapper.ModelMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    @Bean
    public RestTemplate createRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

//    @Bean
//    public Gson gson() {
//        Gson gson = new GsonBuilder()
//                .excludeFieldsWithoutExposeAnnotation().setLenient()
//                .setPrettyPrinting().create();
//        return gson;
//    }

    @Bean
    public ModelMapper modelMapper () {
        return new ModelMapper();
    }
}
