package com.company.companyWise.expedia;

public class validateIpaddress {

     String NEITHER ="Neither";
     String IPV4 = "IPv4";
     String IPV6 = "IPv6";

    public   String validIPAddress(String queryIP) {
        if(queryIP==null ) return NEITHER;
        String[] v4= queryIP.split("\\.", -1);
        String[] v6= queryIP.split("\\:", -1);
        if(v4.length!=4 && v6.length!=8)
        {
            return NEITHER;
        }
        if(v4.length==4)
        {
             return isIPV4(v4);
        }
       else {
            return isIPV6(v6);
        }




    }

    private  String  isIPV6(String [] queryIP) {
        for(String str: queryIP)
        {
            if(str.length()==0 || str.length()>4) return NEITHER;
            if(!isHexadecimal(str)) return NEITHER;
        }
        return IPV6;

    }

    public   boolean isHexadecimal (String  queryIp)
    {

        try{
            int n = Integer.parseInt(queryIp, 16);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    private   String  isIPV4(String [] queryIP) {
        for(String str: queryIP)
        {
            if(str.length()==0)
                return NEITHER;
            if(!checkRangeForIpv4(str))
                return NEITHER;
            if(str.charAt(0)=='0' && str.length()>1)
                return NEITHER;

        }
     return IPV4;




    }

    private  boolean checkRangeForIpv4(String str)
    {
        try{
            int n = Integer.parseInt(str);
            if(n>=0 && n<=255) return true;

        } catch(Exception e) {
            return false;
        }
        return false;
    }


    public static void main(String[] args) {
        String queryIP ="1.0.1.";
     //   validIPAddress(queryIP);

    }
}
