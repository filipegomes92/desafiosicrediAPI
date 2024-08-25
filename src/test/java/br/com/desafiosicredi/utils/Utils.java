package br.com.desafiosicredi.utils;

public class Utils {

    public static String retornacaminhoschema(String funcionalidade, String nomeschema){
        return System.getProperty("user.dir")
                +"/src/test/java/br/com/desafiosicredi/tests/"
                +funcionalidade
                +"/schema/"
                +nomeschema
                +".json";
    }
}
