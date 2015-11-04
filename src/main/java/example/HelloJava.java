package example;

import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class HelloJava {
    public String hendrixHandler(int myCount, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("v2 - received : " + myCount);
        return String.valueOf(myCount);
    }
}