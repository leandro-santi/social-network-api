package com.solitudeworks.weeabu.models;

import lombok.Data;

@Data
public class UserFeatures {

    private Boolean emailValidation;
    private Boolean canCreateContent;
    private Boolean sessionStatus;
    private Boolean editContent;
    private Boolean editUser;
    private Boolean deleteContent;

    public UserFeatures(Boolean emailValidation,
                        Boolean canCreateContent,
                        Boolean sessionStatus,
                        Boolean editContent,
                        Boolean editUser,
                        Boolean deleteContent) {
        this.emailValidation = emailValidation;
        this.canCreateContent = canCreateContent;
        this.sessionStatus = sessionStatus;
        this.editContent = editContent;
        this.editUser = editUser;
        this.deleteContent = deleteContent;
    }

}
