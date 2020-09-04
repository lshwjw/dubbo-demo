package com.example.dubbo.demo.provider.filter;

import com.alibaba.dubbo.rpc.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author weijianwei
 * @date 2017/12/18 15:03
 * @description dubbo过滤器：全局异常处理
 */
public class ExceptionFilter implements Filter {

    private static Log logger = LogFactory.getLog(ExceptionFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        RpcContext context = RpcContext.getContext();
        logger.info("in log -> remoteHost: " + context.getRemoteHost() + ", service: " + invoker.getInterface().getName() +
            ", method: " + invocation.getMethodName() + ", argument: " + context.getArguments()[0]);
        Result result = invoker.invoke(invocation);
        logger.info("out log -> remoteHost: " + context.getRemoteHost() + ", service: " + invoker.getInterface().getName() +
            ", method: " + invocation.getMethodName() + ", return value: " + result.getValue());
        return result;
    }
}
