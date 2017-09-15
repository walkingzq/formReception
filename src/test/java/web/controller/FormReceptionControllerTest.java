package web.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import web.controller.http.HttpRequest;


/**
 * Created by qaa on 2017/9/9.
 */
public class FormReceptionControllerTest {
    private static String baseUrl = "http://localhost:8080";

    @Before
    public void setUp() throws Exception{
    }

    @After
    public void tearDown() throws Exception{
    }

    @Test
    public void hello() throws Exception {
        String url = baseUrl + "/hello";
        String response = HttpRequest.sendGet(url,"");
        System.out.println(response);
    }

    @Test
    public void formReceive() throws Exception {
        String url = baseUrl + "/formSubmitting";
        String jsonData = "{\"date\":\"2017-09-11\",\"department\":\"计算机学院\",\"name\":\"周周\",\"reason\":\"微信小程序制作\",\"duration\":\"3\",\"place\":\"四川大学望江校区\"}";
        System.out.println(jsonData);
        String response = HttpRequest.sendPost(url,jsonData);
        System.out.println(response);
    }

}