package com.thealgorithms.datastructures.trees;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadTreeTest {
    int quadTreeCapacity = 4;
    BoundingBox boundingBox = new BoundingBox(new Point(0, 0), 500);
    QuadTree quadTree = new QuadTree(boundingBox, quadTreeCapacity);

    @Test
    public void testInsertIntoQuadTree() {
        Assertions.assertTrue(quadTree.insert(new Point(10, -10)));
        Assertions.assertTrue(quadTree.insert(new Point(-10, 10)));
        Assertions.assertTrue(quadTree.insert(new Point(-10, -10)));
        Assertions.assertTrue(quadTree.insert(new Point(10, 10)));
        Assertions.assertFalse(quadTree.insert(new Point(1050, 1050)));
    }

    @Test
    public void testQueryInQuadTree() {
        quadTree.insert(new Point(10, -10));
        quadTree.insert(new Point(-10, 10));
        quadTree.insert(new Point(-10, -10));
        quadTree.insert(new Point(10, 10));

        List<Point> points = quadTree.query(new BoundingBox(new Point(0, 0), 100));
        Assertions.assertEquals(4, points.size());

        points = quadTree.query(new BoundingBox(new Point(5, 5), 5));
        Assertions.assertEquals(1, points.size());
    }
}
