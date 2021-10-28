package com.javasec.exam01.entity;

import java.util.List;

public class Menu {
    private int access;             //权限
    private String menuid;          //每项菜单的ID
    private String menuname;        //每项菜单的名称
    private String location;        //菜单所处左侧导航还是顶部ToolBar
    private String menutype;        //菜单类型，区分子菜单归属的上一级父菜单
    private String menulevel;       //菜单等级，区分父菜单还是子菜单
    private String url;             //菜单跳转URL
    private List<Menu> secondMenus; //二级目录集合List
}
