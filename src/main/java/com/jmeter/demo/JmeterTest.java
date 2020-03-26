package com.jmeter.demo;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.Random;

/**
 *  Jmeter二开测试类
 * */
public class JmeterTest extends AbstractJavaSamplerClient {
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        Integer randomNum = new Random().nextInt();
        System.out.println(randomNum);
        System.out.println("---------运行结束------------");
        return null;
    }
}
