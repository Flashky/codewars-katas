package com.codewars.katas.kyu4.sortbinarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/52bef5e3588c56132c0003bc/train/java">Sort binary tree by levels</a>
 */
public class Kata {
	public static List<Integer> treeByLevels(Node node) {
		
		List<Integer> result = new LinkedList<>();
			
		Queue<Node> nodesToTraverse = new LinkedList<>();

		if(node != null) {
			nodesToTraverse.add(node);
		}
		
		while(!nodesToTraverse.isEmpty()) {
			Node currentNode = nodesToTraverse.poll();
			result.add(currentNode.value);
			
			if(currentNode.left != null) {
				nodesToTraverse.add(currentNode.left);
			}
			
			if(currentNode.right != null) {
				nodesToTraverse.add(currentNode.right);
			}
		}
		
		return result;
	}

}
