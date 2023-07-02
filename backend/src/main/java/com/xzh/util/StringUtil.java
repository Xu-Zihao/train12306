package com.xzh.util;

import com.google.common.base.Splitter;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {

    public static List<Long> splitToListLong(String str) {
        List<String> stringList = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(str);
        return stringList.stream().map(item -> Long.parseLong(item)).collect(Collectors.toList());
    }

    public static List<Integer> splitToListInt(String str) {
        List<String> stringList = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(str);
        return stringList.stream().map(item -> Integer.parseInt(item)).collect(Collectors.toList());
    }
}
