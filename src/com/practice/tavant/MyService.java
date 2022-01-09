package com.practice.tavant;
/**
 *  Programme to create service accepting amount as input
 *  if input > 0 , print Success else print Failed
 */
/*@RestController
@ReqeuestMapping("/myservice")*/
public class MyService {

   // @PostMapping("/confirmPayment")
    public ResponseEntity confirmPayment(/*@RequstBody*/ TransferDto transferDto){
        Boolean result = false;
        if(transferDto.getAmount() > 0){
            result = true;
        }else{
            result = false;
        }
        return new ResponseEntity("Ok",result,200);
    }
}
