package com.tricon.es.service;


import com.tricon.es.model.Product;
import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.ElasticsearchClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Service;
import org.elasticsearch.client.*;

@Service
public class EsSearchServiceNew7 {

    public String searchNew() throws Exception {

        // Create a RestHighLevelClient instance
        RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));

        // Define a search request
        SearchRequest searchRequest = new SearchRequest("products");
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.termQuery("format", "ebook"));
        searchRequest.source(searchSourceBuilder);

// Execute the search request
        SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);

// Process the search response
        SearchHits hits = searchResponse.getHits();
        for (SearchHit hit : hits.getHits()) {
            String title = hit.getSourceAsMap().get("title").toString();
            String author = hit.getSourceAsMap().get("author").toString();
            System.out.println(title + " by " + author + " ==> " + hit.toString());
        }

// Close the client
        client.close();


        return "";
    }
}