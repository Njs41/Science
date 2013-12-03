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
		Random random = new Random(1337733171); // Random seed!

		for (int x = 0; x < 200; x++)
			for (int z = 0; z < 200; z++)
				for (int y = 0; y < 100; y++)
					runBlockTest(random, x, y, z);

		write("Counted: " + countedBlocks);
	}

	private void runBlockTest(Random random, int x, int y, int z)
	{
		countedBlocks++;

		int xc = x + random.nextInt(8) - random.nextInt(8);
		int yc = y + random.nextInt(4) - random.nextInt(4);
		int zc = z + random.nextInt(8) - random.nextInt(8);

		write(String.format("X: %s, Y, %s, Z: %s", xc, yc, zc));
	}

	private void write(Object thing)
	{
		output.write(thing.toString());
	}

	private int countedBlocks = 0;
	private int hitBlocks = 0;
	private IOutput output;
}
