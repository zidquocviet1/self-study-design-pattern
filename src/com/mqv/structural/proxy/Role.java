package com.mqv.structural.proxy;

/**
 * @author VietMai - Initial contribution
 */
public record Role(RoleType role) {
    public enum RoleType {
        MANAGER,
        CASHIER
    }
}
