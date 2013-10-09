package com.tappsi.calculador;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class MyFileParser {

	public MyFileParser( InputStream in ) throws Exception{
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int ctr;
        try {
            ctr = in.read();
            while (ctr != -1) {
                byteArrayOutputStream.write(ctr);
                ctr = in.read();
            }
            in.close();
        } catch (IOException e) {
            new IOException("file not there");
        }
        try {
            JSONObject jObject = new JSONObject(byteArrayOutputStream.toString());
            JSONArray jObjectResult = jObject.getJSONArray("services");

        } catch (Exception e) {
            new Exception("parser error");
        }
	}

}