package no.runsafe.science;

import no.runsafe.framework.RunsafePlugin;
import no.runsafe.framework.features.Commands;

public class Plugin extends RunsafePlugin
{
	@Override
	protected void pluginSetup()
	{
		// Framework features
		addComponent(Commands.class);

		// Plugin components
		addComponent(TestPacketCommand.class);
	}
}
