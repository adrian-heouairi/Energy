package fr.uparis.energy.model;

public class Connector {
    private boolean exists;
    private boolean isPowered;
    private Tile parentTile;

    private Connector neighbor;
    public boolean exists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public boolean isPowered() {
        return isPowered;
    }

    public void setPowered(boolean powered) {
        isPowered = powered;
    }
}