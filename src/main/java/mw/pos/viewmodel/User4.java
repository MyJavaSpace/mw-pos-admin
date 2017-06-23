package mw.pos.viewmodel;


import javax.validation.constraints.*;
import java.util.Date;

public class User4 {

    private long id;


    private String name;


    private String password;


    private String email;

    @NotNull(message="{valid.required}")
    private boolean married;

    @Min(value=18, message="{valid.ageMin}")
    @Max(value=100, message="{valid.ageMax}")
    private int age;

    @NotNull(message="{valid.required}")
    @Past(message="{valid.birthday}")
    private Date birthday;

    @Pattern(regexp="^[a-zA-Z]{2,}$", message="{valid.address}")
    private String address;

    @Size(min=1, message="{valid.likesMin}")
    private String[] likes;

    @mw.pos.validation.Tel(message="{valid.tel}", min=3)
    private String tel;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isMarried() {
        return married;
    }
    public void setMarried(boolean married) {
        this.married = married;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String[] getLikes() {
        return likes;
    }
    public void setLikes(String[] likes) {
        this.likes = likes;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

}