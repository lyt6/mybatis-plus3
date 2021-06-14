package com.hello.mybatis.plus.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeException;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 二维码
 */
@Slf4j
@Api(tags = "二维码")
@RestController
@RequestMapping("/qrcode")
public class QRCodeController {

    @GetMapping(value = "/gen")
    @ApiOperation(value = "生成二维码")
    public void image(String content, HttpServletResponse response) {
        createQRCode2Stream(content,response);
    }

    /**
     * 生成到文件
     * @param content
     * @param filepath
     */
    public void createQRCode2File(String content, String filepath) {
        try {
            QrCodeUtil.generate(content, QrConfig.create().setImg("C:\\Users\\Pictures\\aaa.jpg"), FileUtil.file(filepath));
            log.info("生成二维码成功, 位置在：{}", filepath);
        } catch (QrCodeException e) {
            log.error("发生错误", e);
        }
    }

    /**
     * 自定义参数，这部分是Hutool工具封装的
     */
    private static QrConfig initQrConfig() {
        QrConfig config = new QrConfig(300, 300);
//        // 设置边距，既二维码和背景之间的边距
//        config.setMargin(3);
//        // 设置前景色，既二维码颜色（青色）
//        config.setForeColor(Color.CYAN);
//        // 设置背景色（灰色）
//        config.setBackColor(Color.GRAY);
        return config;
    }

    /**
     * 生成到流
     *
     * @param content
     * @param response
     */
    public void createQRCode2Stream(String content, HttpServletResponse response) {
        try {
            QrCodeUtil.generate(content, initQrConfig(), "png", response.getOutputStream());
        } catch (QrCodeException | IOException e) {
            log.error("生成二维码错误", e);
        }
    }

}
