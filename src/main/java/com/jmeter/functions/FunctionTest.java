package com.jmeter.functions;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *  自定义函数助手类
 *  必须放在functions目录下，否则函数助手无法被识别
 */
public class FunctionTest extends AbstractFunction {

    /**
     *  执行方法
     * @param sampleResult
     * @param sampler
     * @return
     * @throws InvalidVariableException
     */
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {
        System.out.println("run execute()...");
        return null;
    }

    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {
        System.out.println("run setParameters()...");
    }

    /**
     *  功能名称
     *  ps：必须为 __name 规则
     * @return
     */
    public String getReferenceKey() {
        System.out.println("run getReferenceKey()...");
        return "__TestFunc";
    }

    /**
     *  参数描述
     * @return
     */
    public List<String> getArgumentDesc() {
        List<String> argsDesc = new ArrayList<String>();
        argsDesc.add("参数描述内容");
        System.out.println("run getArgumentDesc()...");
        return argsDesc;
    }
}
