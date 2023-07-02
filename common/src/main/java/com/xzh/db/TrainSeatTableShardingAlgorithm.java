package com.xzh.db;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

public class TrainSeatTableShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {
    private final static String PREFIX = "train_seat_";

    private String determineDB(int val) {
        int table = val % 10;
        if (table == 0) {
            table = 10;
        }
        return PREFIX + table;
    }
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
        String actualTableName = determineDB(preciseShardingValue.getValue());
        if (collection.contains(actualTableName)){
            return actualTableName;
        }
        throw new IllegalArgumentException();
    }
}
