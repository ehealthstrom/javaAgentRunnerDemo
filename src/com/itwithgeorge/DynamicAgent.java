package com.itwithgeorge;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

public class DynamicAgent {

    // Attach agent to the running process
    public static void main(String[] args) throws IOException, AttachNotSupportedException {
        VirtualMachine vm = VirtualMachine.attach("10476");
        try {
            vm.loadAgent("C:\\src\\Frontend\\TestNavigator\\projects\\javaAgentDemo\\target\\javaAgentDemo-1.0-DemoAgent.jar");
        } catch (AgentLoadException e) {
            e.printStackTrace();
        } catch (AgentInitializationException e) {
            e.printStackTrace();
        } finally {
            System.out.println("DynamicAgent detached");
            vm.detach();
        }
    }
}
