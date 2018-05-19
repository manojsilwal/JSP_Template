package com.javainuse.model;


import java.util.List;

public class Role {
    private Type type;
    private List<Permission> permissionList;

    public Role(Type type, List<Permission> permissionList) {
        this.type = type;
        this.permissionList = permissionList;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }
    public String toString(){
        return "type";
    }

}
