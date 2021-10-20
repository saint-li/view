package com.saint.lib.widget.expandable;

/**
 * 为ExpandableTextView添加展开和收回状态的记录
 */
public interface ExpandableStatusFix {
    void setStatus(StatusType status);

    StatusType getStatus();
}
