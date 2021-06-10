package java29_homework.day12;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUnderline;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Project: java29_maven_base
 * @Author: zoe
 * @Create: 2021-05-27 17:26
 * @Desc：
 **/
public class StudentTestng {
    @Test(dataProvider = "data")
    public void register(Student student) {
        System.out.println(student);
    }

    @DataProvider
    public Object[] data() {
        Student s1 = new Student("zs", "123", "a","男");
        Student s2 = new Student("ls", "123", "b","女");
        Student s3 = new Student("ww", "123", "c","男");
        Object[] arr ={s1,s2,s3};
        return arr;
    }

}
