package java;

import java.io.File;

public class Test
{
    
    public static void main(String[] args)
    {
        if (args==null || args.length==0)
        {
            System.out.println("无参数");
            return;
            
        }
        File file=new File("args[0]");
        
        System.out.println(file.exists());
        
//        if (file.exists())
//        {
//            if (file.isFile())
//            {
//                System.out.println("文件存在");
//            }
//            else
//            {
//                System.out.println("文件夹存在");
//            }
//            
//        }
//        else {
//            System.out.println("文件"+file.getAbsolutePath());
//        }
        
        
//        System.out.println("pathSeparator:"+File.pathSeparator);
//        System.out.println("separator:"+File.separator);
//        File []roots=File.listRoots();
//        System.out.println(Arrays.toString(roots));
    }
}
