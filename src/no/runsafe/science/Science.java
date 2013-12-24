package no.runsafe.science;

import no.runsafe.framework.RunsafePlugin;

public class Science extends RunsafePlugin
{
	@Override
	protected void pluginSetup()
	{
		addComponent(DeleteTest.class);
	}
}
