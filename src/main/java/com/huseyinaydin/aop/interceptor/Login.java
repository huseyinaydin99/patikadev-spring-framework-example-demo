package com.huseyinaydin.aop.interceptor;

@InterceptorYolKesici
public class Login {

    public String isLoginMethod(String data){
        return "isLogin: "+data;
    }
}
