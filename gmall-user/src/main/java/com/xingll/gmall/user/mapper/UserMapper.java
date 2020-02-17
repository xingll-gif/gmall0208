package com.xingll.gmall.user.mapper;

import com.xingll.gmall.user.bean.UmsMember;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-02-10 19:52
 */
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
