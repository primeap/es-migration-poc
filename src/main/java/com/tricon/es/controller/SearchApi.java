package com.tricon.es.controller;


import com.tricon.es.service.ESSearchService;
import com.tricon.es.service.EsSearchServiceNew7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//OLD
//import com.google.gson.JsonObject;


import java.util.List;

@RestController
public class SearchApi {

//    @Autowired
//    private ESSearchService serachServince;

    @Autowired
    private EsSearchServiceNew7 serachServinceNew;

    @GetMapping("api")
    public String search() throws Exception{
//        return serachServince.search().toString();
        return serachServinceNew.searchNew();
    }

}
