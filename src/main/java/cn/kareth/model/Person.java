package cn.kareth.model;

/**
 * Created by Kareth on 2019/4/20.
 */
public class Person {
    private String name;
    private int age;
    private String sex;
    private String telPhoneNumber;
    private String fixedTelPhoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelPhoneNumber() {
        return telPhoneNumber;
    }

    public void setTelPhoneNumber(String telPhoneNumber) {
        this.telPhoneNumber = telPhoneNumber;
    }

    public String getFixedTelPhoneNumber() {
        return fixedTelPhoneNumber;
    }

    public void setFixedTelPhoneNumber(String fixedTelPhoneNumber) {
        this.fixedTelPhoneNumber = fixedTelPhoneNumber;
    }
}
