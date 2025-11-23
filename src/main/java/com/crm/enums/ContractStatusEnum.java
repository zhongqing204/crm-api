package com.crm.enums;

public enum ContractStatusEnum {
    DRAFT("DRAFT", "草稿"),
    PENDING_AUDIT("PENDING_AUDIT", "待审核"),
    AUDIT_PASSED("AUDIT_PASSED", "审核通过"),
    AUDIT_REJECTED("AUDIT_REJECTED", "审核驳回");

    private final String code;
    private final String label;

    ContractStatusEnum(String code,String  label){
        this.code = code;
        this.label = label;
    }

    public static String getLabelByCode(String code){
        for(ContractStatusEnum value : ContractStatusEnum.values()){
            if(value.code.equals(code)){
                return value.label;
            }
        }
        return "未知状态";
    }
}
