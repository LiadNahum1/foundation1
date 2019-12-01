package main;

public class Driver {
    public static Bridge getBridge(){
        ProxyBridge bridge= new ProxyBridge();
        // add when real bridge is ready
        //bridge.bridge = new RealBridge();
        return bridge;
    }
}
