package com.hello.mybatis.plus.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hello.mybatis.plus.common.ResultVO;
import com.hello.mybatis.plus.dto.UserDTO;
import com.hello.mybatis.plus.query.UserQuery;
import com.hello.mybatis.plus.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "用户信息")
@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/list")
    @ApiOperation(value = "分页查询")
    public ResultVO pageUser(@RequestParam(required = false,defaultValue = "1") Long page,
                             @RequestParam(required = false,defaultValue = "20") Long size,
                             UserQuery query){
        return ResultVO.success(userService.pageUser(new Page(page,size),query));
    }

    @GetMapping("/listXml")
    @ApiOperation(value = "分页查询 xml")
    public ResultVO listXml(@RequestParam(required = false,defaultValue = "1") Long page,
                            @RequestParam(required = false,defaultValue = "20") Long size,
                            UserQuery query){
        return ResultVO.success(userService.pageUserXml(new Page(page,size),query));
    }

    @ResponseBody
    @GetMapping("/{id}")
    @ApiOperation(value = "id查询")
    public ResultVO pageUser(@PathVariable("id") Long id){
        return ResultVO.success(userService.getUser(id));
    }

    @PostMapping("")
    @ApiOperation(value = "添加")
    public ResultVO addUser(UserDTO dto){
        userService.addUser(dto);
        return ResultVO.success();
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "更新")
    public ResultVO updateUser(@PathVariable("id") Long id , UserDTO dto){
        userService.updateUserById(id,dto);
        return ResultVO.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public ResultVO delUser(@PathVariable("id") Long id){
        userService.delUser(id);
        return ResultVO.success();
    }

}
