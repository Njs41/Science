package no.runsafe.science;

import no.runsafe.framework.api.command.player.PlayerCommand;
import no.runsafe.framework.api.player.IPlayer;

import java.util.Map;

public class TestPacketCommand extends PlayerCommand
{
	public TestPacketCommand(PacketTesting testing)
	{
		super("testpacket", "Runs a packet test.", "runsafe.test");
		this.testing = testing;
	}

	@Override
	public String OnExecute(IPlayer executor, Map<String, String> parameters)
	{
		testing.runTests(executor);
		return "Test ran.";
	}

	private final PacketTesting testing;
}
