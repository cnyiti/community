package life.majiang.community.controller;

import com.aliyun.oss.OSSClient;
import life.majiang.community.dto.FileDto;
import life.majiang.community.util.aliyunoss.AliyunOSSClientUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@Controller
public class FileController {

    @RequestMapping("/file/upload")
    @ResponseBody
    public FileDto upload(HttpServletRequest request){

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile multipartFile = multipartRequest.getFile("editormd-image-file");

        String url = "";
        //初始化OSSClient
        OSSClient ossClient= AliyunOSSClientUtil.getOSSClient();
        //上传文件

        String fileName=AliyunOSSClientUtil.uploadObject2OSS(multipartFile, ossClient, AliyunOSSClientUtil.BACKET_NAME, AliyunOSSClientUtil.FOLDER);
        //String url = AliyunOSSClientUtil.getImgUrl(AliyunOSSClientUtil.FOLDER);

         url+= "http://fitzzz.oss-cn-shenzhen.aliyuncs.com/images/" + fileName;


        File filess=new File(url);
        FileDto fileDto = new FileDto();
        fileDto.setSuccess(1);
        fileDto.setUrl(url);




        return fileDto;
    }
}
