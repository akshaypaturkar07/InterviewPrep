public class IpAddressCheck {
    public static void main(String[] args) {
        String str = "123.125.126.128";
        Boolean isInValid =  false;
        String[] strs =  str.split(".");
        if(strs.length <4){
            System.out.println("Invalid Ip provided");
        }
        for(String s: strs){
            if(Integer.valueOf(s) > 255){
                isInValid = true;
            }else{
                continue;
            }
        }
        if(isInValid){
            System.out.println("Invalid Ip provided");
        }else{
            System.out.println("Valid Ip provided");
        }
    }
}
