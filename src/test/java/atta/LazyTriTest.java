import org.junit.Test;
import static org.junit.Assert.*;

import atta.LazyTri;

public class LazyTriTest {
	@Test
	public void zeroLazy() {
		assertEquals(LazyTri.lazySeq(0), 1);
	}

	@Test
	public void zeroTri() {
		assertEquals(LazyTri.triangleSeq(0), 0);
	}

	@Test
	public void threeLazy() {
		assertEquals(LazyTri.lazySeq(3), 7);
	}

	@Test
	public void threeTri() {
		assertEquals(LazyTri.triangleSeq(3), 6);
	}

	@Test
	public void tenLazy() {
		assertEquals(LazyTri.lazySeq(10), 56);
	}

	@Test
	public void tenTri() {
		assertEquals(LazyTri.triangleSeq(10), 55);
	}
}