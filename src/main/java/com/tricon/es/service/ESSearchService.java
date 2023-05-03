package com.tricon.es.service;

import org.springframework.stereotype.Service;

/*--- Old import ---*/
//import org.elasticsearch.index.query.QueryBuilders;
//import org.elasticsearch.search.builder.SearchSourceBuilder;
//import org.elasticsearch.search.sort.SortOrder;
//import io.searchbox.client.JestClient;
//import io.searchbox.client.JestClientFactory;
//import io.searchbox.client.config.HttpClientConfig;
//import io.searchbox.client.JestClient;
//import io.searchbox.client.JestResult;
//import io.searchbox.core.Search;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.elasticsearch.search.builder.SearchSourceBuilder;
//import org.elasticsearch.search.sort.SortOrder;
//import java.io.IOException;
//import java.util.List;
//import com.google.gson.JsonObject;


@Service
public class ESSearchService {

//    public List<JsonObject>  search() throws  Exception{
//
//        JestClient jestClient = getJestClient();
//
//
//        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
//        searchSourceBuilder.query(
//
//                   QueryBuilders.boolQuery()
//                        //.must(QueryBuilders.termQuery("_type", "taxonomy"))
////                        .must(QueryBuilders.termQuery("ISBN", "9783161484102"))
//                        .must(QueryBuilders.termQuery("format", "Ebook"))
//                )
//                //.sort("price", SortOrder.ASC)
//        ;
//        Search search = new Search.Builder(searchSourceBuilder.size(5000)
//                .toString()).addIndex("products").build();
//
//        JestResult result = jestClient.execute(search);
//        List<JsonObject> resultList = result.getSourceAsObjectList(JsonObject.class);
//        System.out.println("\n\n=====================================>>> "+resultList.size());
//        System.out.println(resultList);
//        return resultList;
//
//    }
//
//
//
//    public static JestClient getJestClient() {
//        JestClient jestClient = null;
//        try {
//            HttpClientConfig clientConfig = new HttpClientConfig.Builder(
//                    "http://localhost:9200").build();
//            JestClientFactory factory = new JestClientFactory();
//            factory.setHttpClientConfig(clientConfig);
//            jestClient = factory.getObject();
//            return jestClient;
//        } catch (Exception e) {
//            System.err.println("Error while getting JestClient : "+ e);
//        }
//        return jestClient;
//    }

}
