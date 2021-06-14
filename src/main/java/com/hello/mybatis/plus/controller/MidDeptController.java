package com.hello.mybatis.plus.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.hello.mybatis.plus.service.MidDeptService;
import com.hello.mybatis.plus.entity.MidDept;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 同步广阳岛组织中间表 前端控制器
 * </p>
 *
 * @author Liuyongtao
 * @since 2021-03-24
 */
@Api(tags = "部门信息")
@RestController
@RequestMapping("/midDept")
public class MidDeptController {

    @Autowired
    private MidDeptService midDeptService;

    @GetMapping(value = "/")
    public ResponseEntity<Page<MidDept>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<MidDept> aPage = midDeptService.page(new Page<>(current, pageSize));
        return new ResponseEntity<>(aPage, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MidDept> getById(@PathVariable("id") String id) {
        return new ResponseEntity<>(midDeptService.getById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody MidDept params) {
        midDeptService.save(params);
        return new ResponseEntity<>("created successfully", HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        midDeptService.removeById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Object> update(@RequestBody MidDept params) {
        midDeptService.updateById(params);
        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<MidDept>> getAll() {
        return new ResponseEntity<>(midDeptService.getAll(), HttpStatus.OK);
    }

}
