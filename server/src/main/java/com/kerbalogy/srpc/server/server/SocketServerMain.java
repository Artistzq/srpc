package com.kerbalogy.srpc.server.server;

import com.kerbalogy.srpc.core.config.RpcServiceConfig;
import com.kerbalogy.srpc.core.transport.server.socket.SocketRpcServer;
import com.kerbalogy.srpc.server.service.TestService;
import com.kerbalogy.srpc.server.service.TestServiceImpl;

/**
 * @Author : Artis Yao
 */
public class SocketServerMain {

    public static void main(String[] args) {
        SocketRpcServer socketRpcServer = initServices();
        socketRpcServer.start();
    }

    public static SocketRpcServer initServices() {

        TestService helloService = new TestServiceImpl();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        // config是对service的封装
        RpcServiceConfig config = new RpcServiceConfig();
        config.setService(helloService);
        socketRpcServer.registerService(config);

        return socketRpcServer;
    }

}
