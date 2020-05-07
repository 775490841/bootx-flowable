
package com.bootx.controller;

import org.flowable.idm.api.User;
import org.flowable.idm.engine.impl.persistence.entity.UserEntity;
import org.flowable.idm.engine.impl.persistence.entity.UserEntityImpl;
import org.flowable.ui.common.model.UserRepresentation;
import org.flowable.ui.common.security.SecurityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bootx/app")
public class BootXRemoteAccountResource {

    /**
     * GET /rest/account -> get the current user.
     */
    @GetMapping(value = "/rest/account", produces = "application/json")
    public UserRepresentation getAccount() {
      User user = new UserEntityImpl();
      user.setId("bootx_id");
      SecurityUtils.assumeUser(user);
        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setId("bootx_111");
        userRepresentation.setFirstName("bootx");
        List<String> privileges = new ArrayList<>();
        privileges.add("flowable-idm");
        privileges.add("flowable-admin");
        privileges.add("flowable-modeler");
        privileges.add("flowable-task");
        privileges.add("flowable-rest");
        userRepresentation.setPrivileges(privileges);
        return userRepresentation;
    }

}
