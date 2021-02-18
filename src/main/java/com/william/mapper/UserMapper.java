package com.william.mapper;

import com.william.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    // 根據用戶名稱來查找指定用戶對象
    User queryUserNameIsExist(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}