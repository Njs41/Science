package no.runsafe.science;

import no.runsafe.framework.api.IConsole;
import no.runsafe.framework.api.IOutput;
import no.runsafe.framework.api.event.IServerReady;

import java.util.Random;

public class RandomSeed implements IServerReady
{
	public RandomSeed(IOutput output)
	{
		this.output = output;
	}

	@Override
	public void OnServerReady()
	{
		Random random = new Random(1337733171); // Random seed!

		write(random.nextInt(8));
		write(random.nextInt(4));
		write(random.nextInt(8) - random.nextInt(8));
	}

	private void write(Object thing)
	{
		output.logInformation(thing.toString());
	}

	private int countedBlocks = 0;
	private int hitBlocks = 0;
	private IConsole output;
}
