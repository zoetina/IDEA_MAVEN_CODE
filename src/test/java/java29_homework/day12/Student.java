package java29_homework.day12;

/**
 * @Project: java29_maven_base
 * @Author: zoe
 * @Create: 2021-05-27 17:19
 * @Desc：
 **/
public class Student {
    private String username;
    private String passwd;
    private String type;
    private String sex;

    public Student() {
    }

    public Student(String username, String passwd, String type, String sex) {
        this.username = username;
        this.passwd = passwd;
        this.type = type;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
