package com.ndangducbn.statepattern.enums;

public enum DocumentState {
    NEW("NEW", "Tài liệu tạo mới"),
    SUBMITTED("SUBMITTED", "Tài liệu trình phê duyệt"),
    APPROVED("APPROVED", "Tài liệu được phê duyệt"),
    REJECTED("REJECTED", "Tài liệu từ chối phê duyệt");

    String stateName;
    String stateDescription;

    DocumentState(String stateName, String stateDescription) {
        this.stateName = stateName;
        this.stateDescription = stateDescription;
    }

    public String getStateName() {
        return stateName;
    }

    public String getStateDescription() {
        return stateDescription;
    }
}
