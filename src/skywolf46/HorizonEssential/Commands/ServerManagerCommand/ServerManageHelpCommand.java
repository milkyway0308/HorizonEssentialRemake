package skywolf46.HorizonEssential.Commands.ServerManagerCommand;

import skywolf46.CommandAnnotation.v1_1.Data.CommandArgument;
import skywolf46.HorizonEssential.Commands.Abstract.AbstractPermissionRequireCommand;

public class ServerManageHelpCommand extends AbstractPermissionRequireCommand {
    @Override
    protected boolean onPermissionAllowed(CommandArgument args) {
        return false;
    }

    @Override
    protected boolean onPermissionDenied(CommandArgument args) {
        return false;
    }

    @Override
    public int getCommandPriority() {
        return 0;
    }
}
