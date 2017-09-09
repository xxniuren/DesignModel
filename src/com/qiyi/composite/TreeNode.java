package com.qiyi.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by yushuang on 2017/9/9.
 */
public class TreeNode {
    private String name;
    private TreeNode parents;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name){
        this.name = name;
    }

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public TreeNode getParents(){return parents;}

    public void setParents(TreeNode parents){this.parents = parents;}

    //添加子孩子节点
    public void add(TreeNode node){children.add(node);}

    //获取子孩子节点
    public Enumeration<TreeNode> getChildrenNode(){ return children.elements();}

}
