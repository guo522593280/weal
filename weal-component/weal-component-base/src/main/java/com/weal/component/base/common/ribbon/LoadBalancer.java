package com.weal.component.base.common.ribbon;

import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: guogchao
 * @create: 2018-09-03 16:22
 **/
@Slf4j
@Component
public class LoadBalancer {
    public Server chooseServer(String uri) {
        // 创建负载均衡器
        ILoadBalancer iLoadBalancer = new BaseLoadBalancer();

        List<Server> serverList = getServers(uri);
        if (serverList != null && serverList.size() > 0) {
            iLoadBalancer.addServers(serverList);
            List<Server> servers = iLoadBalancer.getReachableServers();
            if (servers != null && servers.size() > 0) {
                Server server = getRandomServer(servers);
                return server;
            }
        }
        return null;
    }

    /**
     * 得到服务
     *
     * @param uri
     * @return
     */
    private List<Server> getServers(String uri) {
        List<Server> serverList = new ArrayList<>();

        String[] urls = uri.split(",");
        for (int i = 0; i < urls.length; i++) {
            Server server = getServer(urls[i]);
            if (server != null) {
                serverList.add(server);
            }
        }
        return serverList;
    }

    private Server getServer(String url) {
        try {
            if (url.indexOf(":") != -1) {
                String[] ipPort = url.split(":");
                if (ipPort.length == 2) {
                    String ip = ipPort[0];
                    int port = Integer.parseInt(ipPort[1]);
                    Server server = new Server(ip, port);
                    return server;
                }
            } else {
                Server server = new Server(url);
                return server;
            }

        } catch (Exception e) {
            log.error("========================> 为URL创建ribbon负载均衡错误，url [{}]", url);
        }
        return null;
    }

    private Server getRandomServer(List<Server> servers) {
        int randomNumber = new Random().nextInt(servers.size());
        return servers.get(randomNumber);
    }

    public static void main(String[] args) {
        LoadBalancer loadBalancer = new LoadBalancer();
        Server server = loadBalancer.chooseServer("www.json.cn");
        System.out.print("");
    }
}
