package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {

    Properties  properties;

    public readConfig() {

        File src = new File("./src/test/java/configs/config.properties");
        try {
            FileInputStream fileInputStream = new FileInputStream(src);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getUsername(){
        String username = properties.getProperty("username");
        return username;
    }

    public String getPassword(){
        String password = properties.getProperty("password");
        return password;
    }


}
