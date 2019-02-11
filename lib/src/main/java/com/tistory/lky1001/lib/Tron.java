package com.tistory.lky1001.lib;

/**
 * https://github.com/tronprotocol/tron-web/blob/master/src/lib/transactionBuilder.js
 */
public class Tron {

    private String fullNodeHost;
    private String solidityNodeHost;
    private String eventServerHost;
    private String privateKey;

    public Tron(String fullNodeHost, String solidityNodeHost, String eventServerHost, String privateKey) {
        this.fullNodeHost = fullNodeHost;
        this.solidityNodeHost = solidityNodeHost;
        this.eventServerHost = eventServerHost;
        this.privateKey = privateKey;
    }

}
