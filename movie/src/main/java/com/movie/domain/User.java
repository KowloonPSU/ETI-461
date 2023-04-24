package com.movie.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * user对象 User
 * 
 * @author movie
 * @date 2023-04-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String userId;

    /** $column.columnComment */
    private String userEmail;

    /** $column.columnComment */
    private String userPassword;

    /** $column.columnComment */
    private String userName;

    /** $column.columnComment */
    private String billingDate;

    /** $column.columnComment */
    private String userPlan;

    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setUserEmail(String userEmail) 
    {
        this.userEmail = userEmail;
    }

    public String getUserEmail() 
    {
        return userEmail;
    }
    public void setUserPassword(String userPassword) 
    {
        this.userPassword = userPassword;
    }

    public String getUserPassword() 
    {
        return userPassword;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setBillingDate(String billingDate) 
    {
        this.billingDate = billingDate;
    }

    public String getBillingDate() 
    {
        return billingDate;
    }
    public void setUserPlan(String userPlan) 
    {
        this.userPlan = userPlan;
    }

    public String getUserPlan() 
    {
        return userPlan;
    }

}
