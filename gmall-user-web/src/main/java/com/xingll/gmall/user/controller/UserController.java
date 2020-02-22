package com.xingll.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xingll.gmall.beans.UmsMember;
import com.xingll.gmall.beans.UmsMemberReceiveAddress;
import com.xingll.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-02-10 19:43
 */
@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("getReceiveAddressByMemerId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemerId(String memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemerId(memberId);

        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){

        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }

    @RequestMapping("getOneUser")
    @ResponseBody
    public UmsMember getOneUser(@RequestParam("username") String username,@RequestParam("password") String password){
        UmsMember umsMember = new UmsMember();
        umsMember.setUsername(username);
        umsMember.setPassword(password);
        UmsMember umsMembers = userService.getOneUser(umsMember);

        return umsMembers;
    }

    @RequestMapping("addOneUser")
    @ResponseBody
    public boolean addOneUser(UmsMember umsMember){
        boolean userFlag = userService.addOneUser(umsMember);

        return userFlag;
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public boolean updateUser(UmsMember umsMember){
        boolean userFlag = userService.updateUser(umsMember);

        return userFlag;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
