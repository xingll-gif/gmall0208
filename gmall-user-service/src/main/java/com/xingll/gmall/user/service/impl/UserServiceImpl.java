package com.xingll.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.xingll.gmall.beans.UmsMember;
import com.xingll.gmall.beans.UmsMemberReceiveAddress;
import com.xingll.gmall.service.UserService;
import com.xingll.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.xingll.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-02-10 19:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList =userMapper.selectAll();//userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemerId(String memberId) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        //UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        //umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);//umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }

    @Override
    public UmsMember getOneUser(UmsMember umsMember) {
        UmsMember umsMember1 = userMapper.selectOne(umsMember);
        return umsMember1;
    }

    @Override
    public boolean addOneUser(UmsMember umsMember) {
        int i = userMapper.insertSelective(umsMember);
        boolean flag = false;
        if(i==1) flag=true;
        return flag;
    }

    @Override
    public boolean updateUser(UmsMember umsMember) {
        Example example = new Example(UmsMember.class);
        example.createCriteria().andEqualTo(umsMember);
        userMapper.updateByExampleSelective(null,example);
        return false;
    }

}
