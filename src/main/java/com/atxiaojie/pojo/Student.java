package com.atxiaojie.pojo;

import com.atxiaojie.service.School;

import java.util.Date;

/**
 * @ClassName: User
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2022/2/19 8:30
 * @Version: V1.0.0
 */
public class Student {

    private String stuNo;
    private String stuName;
    private int age;
    private Date birthday;
    private School school;

    private Student(Builder builder) {
        stuNo = builder.stuNo;
        stuName = builder.stuName;
        age = builder.age;
        birthday = builder.birthday;
        school = builder.school;
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return stuNo + "-" + stuName + "-" + age + "-" + birthday + "-" + school.toSchool();
    }

    public static final class Builder{
        private String stuNo;
        private String stuName;
        private int age;
        private Date birthday;
        private School school;

        public Builder() {
        }

        public Builder stuNo(String val){
            this.stuNo = val;
            return this;
        }

        public Builder stuName(String val){
            this.stuName = val;
            return this;
        }

        public Builder age(int val){
            this.age = val;
            return this;
        }

        public Builder birthday(Date val){
            this.birthday = val;
            return this;
        }

        public Builder school(School val){
            this.school = val;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }

}
