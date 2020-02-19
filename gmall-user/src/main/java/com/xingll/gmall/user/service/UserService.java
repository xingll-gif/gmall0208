package com.xingll.gmall.user.service;

import com.xingll.gmall.user.bean.UmsMember;
import com.xingll.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-02-10 19:51
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemerId(String memberId);
}
