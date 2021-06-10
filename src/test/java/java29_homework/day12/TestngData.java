package java29_homework.day12;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Project: java29_maven_base
 * @Author: zoe
 * @Create: 2021-05-27 17:03
 * @Desc：
 **/
public class TestngData {
    @Test(dataProvider = "data")
    public void register(String username, String password, String type, String sex) {
        System.out.println("username = " + username + ", password = " + password + ", type = " + type + ", sex = " + sex);
    }

    @DataProvider
    public Object[][] data() {
        Object[][] arr = {
                {"zs", "123", "a","男"},
                {"ls", "12sd3", "b","女"},
                {"ww", "123sd","c", "男"},
                {"wsw", "123sd","d", "男"},
                {"gs", "123sd","e", "男"},
        };
        return arr;
    }
}
