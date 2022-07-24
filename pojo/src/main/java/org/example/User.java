package org.example;

/**
 * Hello world!
 *
 */
public class User
{

     private String userName;
     private Integer  userAga;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAga() {
        return userAga;
    }

    public void setUserAga(Integer userAga) {
        this.userAga = userAga;
    }
}
