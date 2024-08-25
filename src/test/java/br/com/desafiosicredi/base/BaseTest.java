package br.com.desafiosicredi.base;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.BeforeClass;

public class BaseTest {


    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://dummyjson.com/";
    }
}
