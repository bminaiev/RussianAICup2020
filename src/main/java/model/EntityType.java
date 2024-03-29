package model;

public enum EntityType {
    WALL(0),
    HOUSE(1),
    BUILDER_BASE(2),
    BUILDER_UNIT(3),
    MELEE_BASE(4),
    MELEE_UNIT(5),
    RANGED_BASE(6),
    RANGED_UNIT(7),
    RESOURCE(8),
    TURRET(9);
    public int tag;

    EntityType(int tag) {
        this.tag = tag;
    }

    public boolean isBuilding() {
        return this == HOUSE || this == BUILDER_BASE || this == MELEE_BASE || this == RANGED_BASE || this == TURRET || this == WALL;
    }
}
