package com.weal.storage.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.weal.storage.entity.EventgameEu;

public interface EventgameEuRepository extends ElasticsearchRepository<EventgameEu,String> {
}