// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rooina.addons.standalone.jmxexample.model;

import java.lang.String;

privileged aspect Blog_Roo_JavaBean {
    
    public String Blog.getTitle() {
        return this.title;
    }
    
    public void Blog.setTitle(String title) {
        this.title = title;
    }
    
    public String Blog.getEntry() {
        return this.entry;
    }
    
    public void Blog.setEntry(String entry) {
        this.entry = entry;
    }
    
}
