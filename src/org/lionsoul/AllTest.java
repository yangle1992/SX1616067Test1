package org.lionsoul;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.lionsoul.tankwar.map.MapTest;
import org.lionsoul.tankwar.tank.TankTest;

@RunWith(Suite.class)
@SuiteClasses({
	MapTest.class,
	TankTest.class
}
		)
public class AllTest {

	}
