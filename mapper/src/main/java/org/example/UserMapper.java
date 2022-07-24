package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public interface UserMapper
{

    void insertUser(User user);
    List<User>   selectUsers();
}
