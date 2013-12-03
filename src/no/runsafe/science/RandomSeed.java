package no.runsafe.science;

import net.minecraft.server.v1_6_R3.MathHelper;
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
		Random random = new Random(1337);
		runRandomTest(random);
		runRandomTest(random);
		runRandomTest(random);
	}

	private void runRandomTest(Random random)
	{
		float randomInt = random.nextFloat();
		write(randomInt);

		float randomIntPied = randomInt * (float) Math.PI;
		write(randomIntPied);

		double randomIntPiedSin = MathHelper.sin(randomIntPied);
		write(randomIntPiedSin);

		double randomIntPiedCos = MathHelper.cos(randomIntPied);
		write(randomIntPiedCos);
	}

	private void write(Object thing)
	{
		output.write(thing.toString());
	}

	private IOutput output;
}
