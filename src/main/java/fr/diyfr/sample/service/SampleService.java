package fr.diyfr.sample.service;

/*
 * 2017- diyfr
 */


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SampleService {


    @Value("${myapp.url}")
    private String URL = null;

    public String getURL(){
        return URL;
    }
}
