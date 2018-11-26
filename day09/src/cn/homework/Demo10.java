package cn.homework;

import javafx.beans.InvalidationListener;
import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo10 {
    public static void main(String[] args) throws IOException {
        Properties pti = new Properties();
        FileReader fr = new FileReader("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt");
        pti.load(fr);
        Set<String> strings = pti.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+pti.getProperty(string));
        }


    }
}