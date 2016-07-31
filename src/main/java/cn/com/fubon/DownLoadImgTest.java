package cn.com.fubon;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class DownLoadImgTest 
{
    public static void main( String[] args ) throws Exception
    {
    	URL url = new URL("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo_top_ca79a146.png");
        byte[] arr = IOUtils.toByteArray(url);
        
        FileUtils.writeByteArrayToFile(new File("d:/baidu.jpg"), arr);
    }
}
