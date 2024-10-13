package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TelegramApiException {

        new NasaTelegramBot("Nasa_Image_Of_Day",
                GitIgnore.TG_TOKEN);

        /*String url = "https://api.nasa.gov/planetary/apod?api_key=e3WKCW4dbZVCg8zGjYAjrKcCUTmfeUlWKhA9OYcY" +
                "&date=2024-05-18";

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(url);
        CloseableHttpResponse response =  client.execute(request);

        *//*Scanner scanner = new Scanner(response.getEntity().getContent());
        System.out.println(scanner.nextLine());*//*

        ObjectMapper mapper = new ObjectMapper();
        NasaAnswer answer = mapper.readValue(response.getEntity().getContent(), NasaAnswer.class);
        String urlImage = answer.url;
        String[] separatedimage = urlImage.split("/");
        String imageName = separatedimage[separatedimage.length - 1];


        HttpGet requestImage = new HttpGet(urlImage);
        CloseableHttpResponse image =  client.execute(requestImage);

        FileOutputStream fos = new FileOutputStream(imageName);
        image.getEntity().writeTo(fos);*/



    }
}