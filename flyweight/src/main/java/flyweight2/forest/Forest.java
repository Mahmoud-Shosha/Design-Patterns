package flyweight2.forest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import flyweight2.trees.Tree;
import flyweight2.trees.TreeFactory;
import flyweight2.trees.TreeType;

public class Forest extends JFrame {

	private static final long serialVersionUID = 1L;
	private List<Tree> trees = new ArrayList<>();

	public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
		TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
		Tree tree = new Tree(x, y, type);
		trees.add(tree);
	}

	@Override
	public void paint(Graphics graphics) {
		for (Tree tree : trees) {
			tree.draw(graphics);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
