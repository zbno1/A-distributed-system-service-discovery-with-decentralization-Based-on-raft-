package org.pojo;

public class Node {
    private Long nodeId;
    private String nodeName;
    private String nodeLocation;
    private Integer nodeAbility;
    private Integer nodeCPUCore;
    private Integer nodeCPUFrequency;
    private Integer nodeRAM;
    private Integer nodeROM;
    private String IP;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeLocation() {
        return nodeLocation;
    }

    public void setNodeLocation(String nodeLocation) {
        this.nodeLocation = nodeLocation;
    }

    public Integer getNodeAbility() {
        return nodeAbility;
    }

    public void setNodeAbility(Integer nodeAbility) {
        this.nodeAbility = nodeAbility;
    }

    public Integer getNodeRAM() {
        return nodeRAM;
    }

    public void setNodeRAM(Integer nodeRAM) {
        this.nodeRAM = nodeRAM;
    }

    public Integer getNodeROM() {
        return nodeROM;
    }

    public void setNodeROM(Integer nodeROM) {
        this.nodeROM = nodeROM;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public Integer getNodeCPUCore() {
        return nodeCPUCore;
    }

    public void setNodeCPUCore(Integer nodeCPUCore) {
        this.nodeCPUCore = nodeCPUCore;
    }

    public Integer getNodeCPUFrequency() {
        return nodeCPUFrequency;
    }

    public void setNodeCPUFrequency(Integer nodeCPUFrequency) {
        this.nodeCPUFrequency = nodeCPUFrequency;
    }
}
