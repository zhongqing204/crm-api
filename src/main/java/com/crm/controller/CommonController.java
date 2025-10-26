package com.crm.controller;

import com.crm.common.result.Result;
import com.crm.service.CommonService;
import com.crm.vo.FileUrlVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.Tag;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Api(tags = "通用模块")
@RestController
@RequestMapping("/common")
@AllArgsConstructor
public class CommonController {
    private final CommonService commonService;

    @PostMapping("/upload")
    @Operation(summary = "上传文件")
    public Result<FileUrlVO> upload(MultipartFile file){
        return Result.ok(commonService.upload(file));
    }
}
