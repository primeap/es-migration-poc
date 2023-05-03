# Elastic search migration

### Elastic search V1.5
* docker pull devdb/elasticsearch:1.5.0
* docker run -d --name elasticsearch -p 9200:9200 devdb/elasticsearch



### Elastic search V7.17
* docker pull docker.elastic.co/elasticsearch/elasticsearch:7.17.10
* docker run -p 127.0.0.1:9200:9200 -p 127.0.0.1:9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.17.10



###Create index old

```curl --location --request PUT 'http://localhost:9200/products' \
--header 'Content-Type: text/plain' \
--data '{
"mappings": {
"book": {
"properties": {
"ISBN": {"type": "string", "index": "not_analyzed"},
"title": {"type": "string", "index": "analyzed"},
"author": {"type": "string", "index": "analyzed"},
"publisher": {"type": "string", "index": "analyzed"},
"publication_date": {"type": "date", "format": "dateOptionalTime"},
"genre": {"type": "string", "index": "not_analyzed"},
"language": {"type": "string", "index": "not_analyzed"},
"format": {"type": "string", "index": "not_analyzed"},
"narrator": {"type": "string", "index": "analyzed"},
"length": {"type": "string", "index": "analyzed"},
"pages": {"type": "integer"},
"available_copies": {"type": "integer"},
"price": {"type": "float"}
}
}
}
}
'
```

### Create document OLD
```curl --location 'http://localhost:9200/products/book' \
--header 'Content-Type: application/json' \
--data '{
"ISBN": "9781501173219",
"title": "The Tricon trail",
"author": "Mark Manson",
"publisher": "HarperOne",
"publication_date": "2016-09-13",
"genre": "Self-help",
"language": "English",
"format": "Ebook",
"narrator": "None",
"length": "224 pages",
"available_copies": 2,
"price": 9.99
}
'
```

### Create mapping new 
```curl --location --request PUT 'http://localhost:9200/products' \
--header 'Content-Type: application/json' \
--data '{
"mappings": {
"properties": {
"isbn": {
"type": "keyword"
},
"title": {
"type": "text",
"analyzer": "english"
},
"author": {
"type": "text",
"analyzer": "english"
},
"publisher": {
"type": "text",
"analyzer": "english"
},
"price": {
"type": "float"
}
}
}
}
'
```


### Create document New
```curl --location 'http://localhost:9200/products/_doc' \
--header 'Content-Type: application/json' \
--data '{
"ISBN": "9781501173265",
"title": "Mastering liux",
"author": "Arvind",
"publisher": "HarperOne",
"publication_date": "2016-09-13",
"genre": "Self-help",
"language": "English",
"format": "Ebook",
"narrator": "None",
"length": "284 pages",
"available_copies": 2,
"price": 25.99
}
'
```
