package com.rooinaction.cmsapp.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEntity
public class CourseRegistration {

    private Long id;

    @NotNull
    @Size(min = 2)
    private String name;

    private Integer studentId;

    private Integer courseId;
}
