package com.william.services;

import com.william.pojo.User;

public interface UserServices {

    User getUserById(String id);

    // 根據用戶名稱來查找指定用戶對象
    User queryUserNameIsExist(String username);
}
