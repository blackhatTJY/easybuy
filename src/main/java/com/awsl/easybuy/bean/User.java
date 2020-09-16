package com.awsl.easybuy.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @author tjy
 */

@Data
@Table(name = "easybuy_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "loginName")

    private String loginName;
    @Column(name = "userName")

    private String userName;

    @Column(name = "password")

    private String password;
    @Column(name = "sex")

    private Integer sex;
    @Column(name = "identityCode")

    private String identityCode;
    @Column(name = "email")

    private String email;
    @Column(name = "mobile")

    private String mobile;
    @Column(name = "type")

    private Integer type;
}
