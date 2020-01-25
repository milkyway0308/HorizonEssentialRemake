package skywolf46.HorizonEssential.Modules;

public abstract class AbstractModule {
    private boolean isActive = true;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean b) {
        this.isActive = b;
    }

    protected abstract void onEnable();

    protected abstract void onDisable();
}
