package no.runsafe.science;

import no.runsafe.framework.api.command.argument.RequiredArgument;
import no.runsafe.framework.api.command.player.PlayerCommand;
import no.runsafe.framework.api.player.IPlayer;
import no.runsafe.framework.minecraft.packets.PacketPlayerInfo;

import java.util.Map;

public class TestPacketCommand extends PlayerCommand
{
	public TestPacketCommand()
	{
		super("testpacket", "Runs a packet test.", "runsafe.test", new RequiredArgument("playerName"), new RequiredArgument("flag"), new RequiredArgument("i"));
	}

	@Override
	public String OnExecute(IPlayer executor, Map<String, String> parameters)
	{
		String playerName = parameters.get("playerName");
		boolean flag = Boolean.parseBoolean(parameters.get("flag"));
		int i = Integer.parseInt(parameters.get("i"));

		PacketPlayerInfo infoPacket = new PacketPlayerInfo(playerName, flag, i);
		infoPacket.send(executor);

		return "Done";
	}
}
