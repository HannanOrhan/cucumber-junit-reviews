package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
  public static Properties properties = new Properties();
  static {
      try {
          FileInputStream file = new FileInputStream("configuration.properties");
          properties.load(file);
          file.close();
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
  }

  public static String getProperty(String keyword){
      return properties.getProperty(keyword);
  }
}
