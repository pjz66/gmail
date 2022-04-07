package com.atguigu.gmail.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmail.bean.UmsMember;
import com.atguigu.gmail.bean.UmsMemberReceiveAddress;
import com.atguigu.gmail.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference
    UserService userService;
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello";
    }
    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> findAllMenber(){
        List<UmsMember> umsMember = userService.getAllUser();
        return umsMember;
    }
    @RequestMapping("/getReceiveAddressesByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressMenbenId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses= userService.getReceiveAddressesByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }
}
