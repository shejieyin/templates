package utils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogUtils {

    public static final String ERROR_LOGGER = "error";

    public static Logger getLogger(String loggerName){
        return LoggerFactory.getLogger(loggerName);
    }


    /**
     * Debug 输出
     * @param logger  	日志logger
     * @param message	输出信息
     */
    public static void debug(Logger logger, String message){
        logger.debug(message);
    }
    /**
     * Debug 输出
     * @param logger  	日志logger
     * @param fmtString 输出信息key
     * @param value		输出信息value
     */
    public static void fmtDebug(Logger logger ,String fmtString,Object...value){
        if(StringUtils.isBlank(fmtString)){
            return ;
        }
        if(null != value && value.length != 0){
            fmtString = String.format(fmtString, value);
        }
        debug(logger,fmtString);
    }

    /**
     * Debug 输出
     * @param logger  	日志logger
     * @param message	输出信息
     */
    public static void info(Logger logger, String message){
        logger.info(message);
    }


    public static void info(Logger logger,String fmtString,Object...value){
        logger.info(format(logger,fmtString),value);

    }

    /**
     * Info 输出
     * @param logger  	日志logger
     * @param fmtString 输出信息key
     */
    public static String format(Logger logger ,String fmtString){
        if(StringUtils.isNotEmpty(fmtString)){
            fmtString = logger.getName()+" | "+ fmtString;
        }else{
            fmtString = logger.getName()+" | ";
        }
        return fmtString;
    }

    /**
     * Warn 输出
     * @param logger  	日志logger
     * @param message	输出信息
     */
    public static void warn(Logger logger, String message){
        logger.warn(message);
    }

    public static void warn(Logger logger, String fmtString,Object...value){
//        warn(logger,format(logger,fmtString,value));
        logger.warn(format(logger,fmtString),value);
    }

    /**
     * Warn 输出
     * @param logger  	日志logger
     * @param fmtString 输出信息key
     * @param value		输出信息value
     */
    public static void fmtWarn(Logger logger ,String fmtString,Object...value){
        if(StringUtils.isBlank(fmtString)){
            return ;
        }
        if(null != value && value.length != 0){
            fmtString = logger.getName()+" | "+String.format(fmtString, value);
        }
        warn(logger,fmtString);
    }
    /**
     * Error 输出
     * @param logger  	日志logger
     * @param message	输出信息
     * @param e			异常类
     */
    public static void error(Logger logger ,String message,Exception e){
        if(null == e){
            error(logger, message);
            return ;
        }else {
            logger.error(message, e);
            getLogger(ERROR_LOGGER).error(message,e);
        }
    }


    /**
     * Error 输出
     * @param logger  	日志logger
     * @param message	输出信息
     * @param e			异常类
     */
    public static void error(Logger logger ,String message,Throwable e){
        if(null == e){
            error(logger, message);
            return ;
        }else {
            logger.error(message, e);
            getLogger(ERROR_LOGGER).error(message,e);
        }
    }

    /**
     * Error 输出
     * @param logger  	日志logger
     * @param message	输出信息
     */
    public static void error(Logger logger ,String message){
        logger.error(message);
        getLogger(ERROR_LOGGER).error(message);
    }


    public static void error(Logger logger,String fmtString,Object...value){
        logger.error(format(logger,fmtString),value);
    }

    /**
     * 异常填充值输出
     * @param logger  	日志logger
     * @param throwable  异常信息
     * @param fmtString	输出信息key
     * @param value		输出信息value
     */
    public static void fmtError(Logger logger ,Throwable throwable,String fmtString,Object...value){
        if(StringUtils.isBlank(fmtString)){
            return ;
        }
        if(null != value && value.length != 0){
            fmtString = String.format(fmtString, value);
        }
        error(logger, fmtString, throwable);
    }
    /**
     * 异常填充值输出
     * @param logger  	日志logger
     * @param fmtString 输出信息key
     * @param value		输出信息value
     */
    public static void fmtError(Logger logger , String fmtString, Object...value) {
        if(StringUtils.isBlank(fmtString)){
            return ;
        }
        if(null != value && value.length != 0){
            fmtString = logger.getName()+" | "+String.format(fmtString, value);
        }
        error(logger, fmtString);
    }
}
