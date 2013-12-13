package no.runsafe.science;

import no.runsafe.framework.api.IServer;
import no.runsafe.framework.api.command.player.PlayerCommand;
import no.runsafe.framework.api.player.IPlayer;
import no.runsafe.framework.minecraft.packets.PacketPlayerInfo;

import java.util.Map;

public class TestPacketCommand extends PlayerCommand
{
	public TestPacketCommand(IServer server)
	{
		super("testpacket", "Runs a packet test.", "runsafe.test");
		this.server = server;
	}

	@Override
	public String OnExecute(IPlayer executor, Map<String, String> parameters)
	{
		String playerName = executor.getPlayerListName();
		PacketPlayerInfo infoPacket = new PacketPlayerInfo(playerName, false, 0);

		for (IPlayer player : server.getOnlinePlayers())
			if (!player.getName().equals(executor.getName()))
				infoPacket.send(player);

		return "Done";
	}

	private final IServer server;
}
