package br.com.desafiosicredi.tests.auth.payloads;

import org.json.JSONObject;

public class AuthPayloads {

    public JSONObject bodyLoginok(String nome,String senha){
        JSONObject payload = new JSONObject();

        payload.put("username",nome);
        payload.put("password",senha);

        return payload;
    }



}
