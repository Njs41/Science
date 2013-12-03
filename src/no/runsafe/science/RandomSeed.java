package no.runsafe.science;

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
		runRandomTest();
		runRandomTest();
	}

	private void runRandomTest()
	{
		Random random = new Random(2000);
		output.write("Starting random test:");
		output.write("1: " + random.nextInt());
		output.write("2: " + random.nextInt());
		output.write("3: " + random.nextInt());
	}

	private IOutput output;
}
