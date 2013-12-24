package no.runsafe.science;

import no.runsafe.framework.api.command.player.PlayerCommand;
import no.runsafe.framework.api.player.IPlayer;
import no.runsafe.framework.minecraft.item.meta.RunsafeMeta;

import java.util.Map;

public class DeleteTest extends PlayerCommand
{
	public DeleteTest()
	{
		super("deletetest", "Delete test", "runsafe.science");
	}

	@Override
	public String OnExecute(IPlayer executor, Map<String, String> parameters)
	{
		RunsafeMeta handItem = executor.getItemInHand();
		executor.getInventory().getRaw().remove(handItem.getRaw());
		return "Done";
	}
}
