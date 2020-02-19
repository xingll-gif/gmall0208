package com.xingll.gmall.user.mapper;

import com.xingll.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-02-10 19:52
 */
//extends Mapper<UmsMember>
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
