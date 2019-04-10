package cn.itcast.user.pojo;




/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/10$
 * @description 实体类$
 */

public class User {


    public String user_id;
    public String user_name;

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getSchool() {
        return school;
    }

    public String school ;
}
