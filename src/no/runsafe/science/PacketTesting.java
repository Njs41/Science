package no.runsafe.science;

import no.runsafe.framework.api.player.IPlayer;
import no.runsafe.framework.minecraft.WorldEffect;
import no.runsafe.framework.minecraft.packets.PacketWorldParticles;
import no.runsafe.framework.minecraft.packets.WorldParticleOffset;

public class PacketTesting
{
	public void runTests(IPlayer player)
	{
		PacketWorldParticles packet = new PacketWorldParticles(WorldEffect.HEART, player.getLocation(), new WorldParticleOffset(), 1, 10);
		packet.send(player); // Send the test packet to the player.
	}
}
