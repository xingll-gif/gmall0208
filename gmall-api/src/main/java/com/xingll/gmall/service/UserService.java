package com.xingll.gmall.service;


import com.xingll.gmall.beans.UmsMember;
import com.xingll.gmall.beans.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-02-10 19:51
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemerId(String memberId);

    UmsMember getOneUser(UmsMember umsMember);

    boolean addOneUser(UmsMember umsMember);

    boolean updateUser(UmsMember umsMember);
}
