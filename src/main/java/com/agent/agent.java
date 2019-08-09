package com.agent;

import java.lang.instrument.Instrumentation;

/**
 * Created by demo on 2019/8/6.
 */
public class agent {
    public static void premain(String agentArgs, Instrumentation inst) {
        inst.addTransformer(new AgentTransform());
        System.out.println("=======this is agent premain function=======");
    }
}

