package no.runsafe.science;

import no.runsafe.framework.RunsafePlugin;
import no.runsafe.framework.features.Commands;

public class Science extends RunsafePlugin
{
	@Override
	protected void pluginSetup()
	{
		// Framework features
		addComponent(Commands.class);
	}
}
