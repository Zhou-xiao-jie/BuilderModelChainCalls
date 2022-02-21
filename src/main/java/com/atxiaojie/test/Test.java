package com.atxiaojie.test;

import com.atxiaojie.pojo.Student;
import com.atxiaojie.service.School;

import java.util.Date;
import java.util.UUID;

/**
 * @ClassName: Test
 * @Description: 测试类,学习使用链式调用
 * @author: zhouxiaojie
 * @date: 2022/2/19 8:55
 * @Version: V1.0.0
 */
public class Test {
    public static void main(String[] args) {
        String stuNo = UUID.randomUUID().toString().replaceAll("-", "");
        Student stu = Student.newBuilder()
                .stuNo(stuNo)
                .stuName("小华")
                .age(26)
                .birthday(new Date())
                .school(new School() {
                    public String toSchool() {
                        return "读大学中";
                    }
                }).build();
        System.out.println(stu.toString());

    }
}
