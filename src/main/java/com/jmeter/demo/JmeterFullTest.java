package com.jmeter.demo;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.Random;

/**
 *  实现接口
 * */
public class JmeterFullTest implements JavaSamplerClient {

    private static final String URLMARK = "url";

    private static final String DEFAULTURL = "http://www.sina.com.cn";

    private String inputInfo;

    /**
     *  最先运行获取默认参数方法
     * */
    public Arguments getDefaultParameters() {
        System.out.println("run getDefaultParameters() ...");
        Arguments arguments = new Arguments();
        arguments.addArgument(URLMARK, DEFAULTURL);
        return arguments;
    }

    /**
     *
     * @param javaSamplerContext 可接收用户输入信息
     * 运行后当前参数信息即用户输入信息，若未用输入则为默认信息
     */
    public void setupTest(JavaSamplerContext javaSamplerContext) {
        System.out.println("run setupTest() ...");
        inputInfo = javaSamplerContext.getParameter(URLMARK, DEFAULTURL);
        System.out.println("用户输入的url为： " + inputInfo);
    }

    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult sampleResult = new SampleResult();
        Integer randomNum = new Random().nextInt(100);
        System.out.println("random number is " + randomNum);
        String result = "result is " + randomNum;
        // 设置响应数据
        sampleResult.setResponseData(result, null);
        // 需设置响应结果数据格式，这里是文本
        sampleResult.setDataType(SampleResult.TEXT);
        // 告诉响应结果树结果是否正确
        sampleResult.setSuccessful(true);
        return sampleResult;
    }

    public void teardownTest(JavaSamplerContext javaSamplerContext) {
        System.out.println("--------------------teardownTest-----------------");
    }

}
