package com.hello.code.algorithm.tree;

import java.util.List;

public class TreeNode {
    private String nodeName;
    private List<TreeNode> children;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
