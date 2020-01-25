package skywolf46.HorizonEssential.Commands.Abstract;

import org.bukkit.command.CommandSender;
import skywolf46.CommandAnnotation.v1_1.API.MinecraftAbstractCommand;
import skywolf46.CommandAnnotation.v1_1.Data.CommandArgument;

public abstract class AbstractPermissionRequireCommand extends MinecraftAbstractCommand {
    private String[] permission;

    public AbstractPermissionRequireCommand(String... perms) {
        this.permission = perms;
    }

    @Override
    public boolean onCommand(CommandArgument commandArgument) {
        CommandSender target = commandArgument.get(CommandSender.class);
        if (permission.length == 0)
            return onPermissionAllowed(commandArgument);
        else {
            if (target.isOp())
                return onPermissionAllowed(commandArgument);
            for (String n : permission) {
                if(!target.hasPermission(n))
                    return onPermissionDenied(commandArgument);
            }
            return onPermissionAllowed(commandArgument);
        }
    }

    protected abstract boolean onPermissionAllowed(CommandArgument args);

    protected abstract boolean onPermissionDenied(CommandArgument args);
}
