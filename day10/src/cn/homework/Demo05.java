package cn.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("day10\\src\\cn\\homework\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\src\\cn\\homework\\b.txt"));
        String line;
        while ((line=br.readLine())!=null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        Set<String> strings = map.keySet();
        for (String key: strings) {
            String value = map.get(key);
          line = key+"."+value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
