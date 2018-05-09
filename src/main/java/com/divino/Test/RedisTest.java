package com.divino.Test;

import redis.clients.jedis.Jedis;

public class RedisTest {
	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis("192.168.142.131");
		System.out.println("Connection to server sucessfully");
		// 设置 redis 字符串数据
		jedis.set("runoobkey", "Redis tutorial");
		// 获取存储的数据并输出
		System.out.println("Stored string in redis:: " + jedis.get("runoobkey"));
	}
}