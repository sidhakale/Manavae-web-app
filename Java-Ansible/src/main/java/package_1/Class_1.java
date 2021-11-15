package package_1;

import java.net.InetAddress;

public class Class_1 {
	public static String mainn(){  
		   
		 return "Hi Accenture";  
		  
		}   
	public static String main(){  
		   
		 return "Good Day!!";  
		  
		}   
	public static String IP() throws Exception
    {
        InetAddress IP = InetAddress.getLocalHost();
       
        return IP.getHostAddress();
    }
}
