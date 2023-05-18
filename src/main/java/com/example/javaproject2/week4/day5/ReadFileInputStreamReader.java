package com.example.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class ReadFileInputStreamReader implements ReadFile{
    public static void main(String[] args) throws IOException {
        ReadFile rfe = new ReadFileInputStreamReader();
        List<String> result = rfe.getLines("C:\\Users\\나연\\Desktop\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\hospital_info.txt");
        System.out.println(result.get(1));  // 읽은 자료 중 2번째 줄 읽어오기
    }

    public List<String> getLines(String fileName) {
        List<String> lines = new LinkedList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))){

            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lines;
    }
}

