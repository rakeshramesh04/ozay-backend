package com.ozay.web.rest.dto.page;

import com.ozay.model.Permission;
import com.ozay.web.rest.dto.OrganizationUserDTO;
import com.ozay.web.rest.dto.UserDTO;

import java.util.List;

/**
 * Created by naofumiezaki on 10/3/15.
 */
public class OrganizationUserPage {
    private List<Permission> permissions;
private OrganizationUserDTO organizationUserDTO;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public OrganizationUserDTO getOrganizationUserDTO() {
        return organizationUserDTO;
    }

    public void setOrganizationUserDTO(OrganizationUserDTO organizationUserDTO) {
        this.organizationUserDTO = organizationUserDTO;
    }
}
