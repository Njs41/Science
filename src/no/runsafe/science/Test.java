package no.runsafe.science;

import no.runsafe.framework.api.command.player.PlayerCommand;
import no.runsafe.framework.api.player.IPlayer;
import no.runsafe.framework.minecraft.WorldEffect;
import no.runsafe.framework.minecraft.item.meta.RunsafeMeta;
import no.runsafe.framework.minecraft.networking.PacketWorldParticle;
import no.runsafe.framework.minecraft.networking.WorldParticleOffset;

import java.util.Map;

public class Test extends PlayerCommand
{
	public Test()
	{
		super("test", "Delete test", "runsafe.science");
	}

	@Override
	public String OnExecute(IPlayer executor, Map<String, String> parameters)
	{
		executor.sendPacket(new PacketWorldParticle(WorldEffect.MAGIC_CRIT, executor.getLocation(), new WorldParticleOffset(0, 0, 0), 1, 20));
		return "Done";
	}
}
