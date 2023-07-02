package com.xzh.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author name
 * @Date 2023/6/21 18:16
 * @Version 1.0
 * @Description:
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test1() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList1.add("张三,23");
        arrayList1.add("李他四,22");
        arrayList1.add("王の五,26");
        arrayList1.add("陈阿留,27");
        arrayList1.add("刘俄意,21");
        arrayList1.add("张三,23");

        arrayList2.add("杨立梅,23");
        arrayList2.add("李他四,22");
        arrayList2.add("杨大赛,26");
        arrayList2.add("杨的时,27");
        arrayList2.add("刘俄意,21");
        arrayList2.add("张三,23");

        System.out.println("严".length());

        List<Actor> actors = Stream.concat(
                        arrayList1.stream().filter(s -> s.split(",")[0].length() == 3).limit(2),
                        arrayList2.stream().filter(s -> s.startsWith("杨")).skip(1))
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(actors);
    }

    @org.junit.jupiter.api.Test
    public void test2() {

        String B = "𝄞"; // 这个就是那个音符字符，只不过由于当前的网页没支持这种编码，所以没显示。
        String C = "\uD834\uDD1E";// 这个就是音符字符的UTF-16编码
        System.out.println(C);
        System.out.println(B.length());


    }

}
