package cn.edu.yangtzeu.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 魏志文
 * @param id 角色序号
 * @param name 角色名
 * @param description 角色描述
 * @param admins 所属管理员
 * @param privileges 所拥有权限
 */
public class Role {
    private short id;
    private String name;
    private String description;

    // 实体中的对象
    private Set<Admin> admins = new HashSet<Admin>();
    private Set<Privilege> privileges = new HashSet<Privilege>();

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(Set<Admin> admins) {
        this.admins = admins;
    }

    public Set<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Set<Privilege> privileges) {
        this.privileges = privileges;
    }
}
