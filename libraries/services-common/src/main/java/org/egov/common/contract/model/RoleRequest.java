package org.egov.common.contract.model;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@EqualsAndHashCode(of = {"code", "tenantId"})
public class RoleRequest {

    private String code;
    private String name;
    private String tenantId;

    public RoleRequest(Role domainRole) {
        this.code = domainRole.getCode();
        this.name = domainRole.getName();
        this.tenantId = domainRole.getTenantId();
    }

    public Role toDomain() {
        return Role.builder()
                .code(code)
                .name(name)
                .tenantId(tenantId)
                .build();
    }
}
