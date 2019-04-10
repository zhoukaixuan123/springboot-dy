package cn.itcast.user.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/10$
 * @description 实体类$
 */
@Table(name="user_login")
@Data
public class User {

    @Id
    @PrimaryKeyJoinColumn
    public String user_id;
    public String user_name;
    public String school ;
}
