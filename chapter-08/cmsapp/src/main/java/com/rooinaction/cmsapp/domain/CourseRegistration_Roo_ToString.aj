// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.rooinaction.cmsapp.domain;

import java.lang.String;

privileged aspect CourseRegistration_Roo_ToString {
    
    public String CourseRegistration.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Name: ").append(getName()).append(", ");
        sb.append("StudentId: ").append(getStudentId()).append(", ");
        sb.append("CourseId: ").append(getCourseId());
        return sb.toString();
    }
    
}
