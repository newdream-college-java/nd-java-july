package chapter13;

import java.util.Random;
import java.util.Scanner;

public class PushBox {
	public static void main(String[] args) {
		System.out.println("************************\n\n");
		System.out.println("         欢迎来到推箱子游戏                     \n");
		System.out.println("************************\n\n");
		Scanner input = new Scanner(System.in);
		// 1.绘制地图
		String[][] map = new String[10][10];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = " 口 ";
			}
		}
		// 绘制地图
		// drawMap(map);
		// 2.确定目标位置
		int mx = (0 + map.length) / 2 - 1;
		int my = (0 + map.length) / 2 - 1;
		map[my][mx] = " ⭐️ ";
		// 3.确定箱子位置
		Random rd = new Random();
		int bx = rd.nextInt(8) + 1;// 1~8
		int by = rd.nextInt(8) + 1;
		// 不能等于目标位置
		while (mx == bx && my == by) {
			bx = rd.nextInt(8) + 1;// 1~8
			by = rd.nextInt(8) + 1;
		}
		map[by][bx] = " ▉ ";

		// 4.确定人的位置
		int rx = rd.nextInt(10);
		int ry = rd.nextInt(10);
		// 人与箱子位置 以及目标位置不能重合
		while ((rx == mx && ry == my) || (rx == bx && ry == by)) {
			rx = rd.nextInt(10);
			ry = rd.nextInt(10);
		}
		map[ry][rx] = " ♞ ";

		// 5.增加模块：添加障碍
		int zx = 0;
		int zy = 0;
		for (int i = 0; i < 20; i++) {
			zx = rd.nextInt(10);
			zy = rd.nextInt(10);
			while ((zx == mx && zy == my) || (zx == bx && zy == by)
					|| (zx == rx && zy == ry)) {
				zx = rd.nextInt(10);
				zy = rd.nextInt(10);
			}
			map[zy][zx] = " ☠ ";

		}

		// 5.绘制地图
		drawMap(map);

		while (true) {
			System.out.println("移动(w-上;s-下;a-左;d-右)");
			String answer = input.next();
			System.out.println(answer);
			if (answer.equalsIgnoreCase("w")) {
				// 情况一：人前面没有箱子 并且人前面没有目标和障碍物
				if (!(ry - 1 == by && rx == bx) && !(ry - 1 == my && rx == mx)
						 && ry != 0&& !map[ry - 1][rx].equals(" ☠ ")) {
					// 1.清空人原来原值
					map[ry][rx] = " 口 ";
					// 2.人y轴向上移动1
					ry = ry - 1;
					map[ry][rx] = " ♞ ";
					// 情况二：人前面有箱子
				} else if (ry - 1 == by && rx == bx) {
					//1.箱子前面有障碍物
					if(map[by - 1][bx].equals(" ☠ ")){
						map[by][bx] = " ▉ ";
						map[ry][rx] = " ♞ ";
					}else{
						// 2.向上移动箱子和人的位置
						map[ry][rx] = " 口 ";
						ry = ry - 1;
						by = by - 1;
						map[by][bx] = " ▉ ";
						map[ry][rx] = " ♞ ";
					}
					// 情况三：人的前面有目标
				} else if (ry - 1 == my && rx == mx) {
					// 1.目标前面有箱子
					if (my - 1 == by && mx == bx) {
						//（1）箱子前面有障碍物
						if(map[by - 1][bx].equals(" ☠ ")){
							map[by][bx] = " ▉ ";
							map[ry][rx] = " ♞ ";
						// 否则箱子向上移动一格，人向上移动两格
						}else{
							map[ry][rx] = " 口 ";
							ry = ry - 2;
							by = by - 1;
							map[by][bx] = " ▉ ";
							map[ry][rx] = " ♞ ";
						}
						// 2.目标前面没有箱子
					} else {
						// 人向上移动两格
						map[ry][rx] = " 口 ";
						ry = ry - 2;
						map[ry][rx] = " ♞ ";
					}
				}
				} else if (answer.equalsIgnoreCase("s")) {
					// 情况一：人后面没有箱子 并且人后面没有目标
					if (!(ry + 1 == by && rx == bx)
							&& !(ry + 1 == my && rx == mx) && ry != 9&& !map[ry + 1][rx].equals(" ☠ ")) {
						// 1.清空人原来原值
						map[ry][rx] = " 口 ";
						// 2.人y轴向下移动1
						ry = ry + 1;
						map[ry][rx] = " ♞ ";
						// 情况二：人后面有箱子
					} else if (ry + 1 == by && rx == bx) {
						//箱子后面有障碍物
						if(map[by + 1][bx].equals(" ☠ ")){
							map[by][bx] = " ▉ ";
							map[ry][rx] = " ♞ ";
						}else{
						// 向下移动箱子和人的位置
							map[ry][rx] = " 口 ";
							ry = ry + 1;
							by = by + 1;
							map[by][bx] = " ▉ ";
							map[ry][rx] = " ♞ ";
						}
						// 情况三：人的后面有目标
					} else if (ry + 1 == my && rx == mx) {
						// 1.目标后面有箱子
						if (my + 1 == by && mx == bx) {
							//箱子后面有障碍物
							if(map[by + 1][bx].equals(" ☠ ")){
								map[by][bx] = " ▉ ";
								map[ry][rx] = " ♞ ";
							}else{
							// 箱子向下移动一格，人向下移动两格
								map[ry][rx] = " 口 ";
								ry = ry + 2;
								by = by + 1;
								map[by][bx] = " ▉ ";
								map[ry][rx] = " ♞ ";
							}
							// 2.目标后面没有箱子
						} else {
							// 人向下移动两格
							map[ry][rx] = " 口 ";
							ry = ry + 2;
							map[ry][rx] = " ♞ ";
						}
					}
				} else if (answer.equalsIgnoreCase("a")) {
					// 情况一：人左边没有箱子 并且人左边没有目标
					if (!(ry == by && rx - 1 == bx)
							&& !(ry == my && rx - 1 == mx) && rx != 0&& !map[ry ][rx-1].equals(" ☠ ")) {
						// 1.清空人原来原值
						map[ry][rx] = " 口 ";
						// 2.人y轴向左移动1
						rx = rx - 1;
						map[ry][rx] = " ♞ ";
						// 情况二：人左边有箱子
					} else if (rx - 1 == bx && ry == by) {
						//箱子左边有障碍物
						if(map[by][bx-1].equals(" ☠ ")){
							map[by][bx] = " ▉ ";
							map[ry][rx] = " ♞ ";
						}else{
						// 向左移动箱子和人的位置
							map[ry][rx] = " 口 ";
							rx = rx - 1;
							bx = bx - 1;
							map[by][bx] = " ▉ ";
							map[ry][rx] = " ♞ ";
						}
						// 情况三：人的左边有目标
					} else if (rx - 1 == mx && ry == my) {
						// 1.目标左边有箱子
						if (mx - 1 == bx && my == by) {
							//箱子左边有障碍物
							if(map[by][bx-1].equals(" ☠ ")){
								map[by][bx] = " ▉ ";
								map[ry][rx] = " ♞ ";
							}else{
							// 箱子向左移动一格，人向左移动两格
								map[ry][rx] = " 口 ";
								rx = rx - 2;
								bx = bx - 1;
								map[by][bx] = " ▉ ";
								map[ry][rx] = " ♞ ";
							}
							// 2.目标左边没有箱子
						} else {
							// 人向左移动两格
							map[ry][rx] = " 口 ";
							rx = rx - 2;
							map[ry][rx] = " ♞ ";
						}
					}
				} else if (answer.equalsIgnoreCase("d")) {
					// 情况一：人右边没有箱子 并且人右边没有目标
					if (!(ry == by && rx + 1 == bx)
							&& !(ry == my && rx + 1 == mx) && rx != 9&& !map[ry][rx+1].equals(" ☠ ")) {
						// 1.清空人原来原值
						map[ry][rx] = " 口 ";
						// 2.人y轴向右移动1
						rx = rx + 1;
						map[ry][rx] = " ♞ ";
						// 情况二：人右边有箱子
					} else if (rx + 1 == bx && ry == by) {
						//箱子右边有障碍物
						if(map[by][bx+1].equals(" ☠ ")){
							map[by][bx] = " ▉ ";
							map[ry][rx] = " ♞ ";
						}else{
						// 向右移动箱子和人的位置
							map[ry][rx] = " 口 ";
							rx = rx + 1;
							bx = bx + 1;
							map[by][bx] = " ▉ ";
							map[ry][rx] = " ♞ ";
						}
						// 情况三：人的右边有目标
					} else if (rx + 1 == mx && ry == my) {
						// 1.目标右边有箱子
						if (mx + 1 == bx && my == by) {
							//箱子右边有障碍物
							if(map[by][bx+1].equals(" ☠ ")){
								map[by][bx] = " ▉ ";
								map[ry][rx] = " ♞ ";
							}else{
							// 箱子向右移动一格，人向右移动两格
								map[ry][rx] = " 口 ";
								rx = rx + 2;
								bx = bx + 1;
								map[by][bx] = " ▉ ";
								map[ry][rx] = " ♞ ";
							}
							// 2.目标右边没有箱子
						} else {
							// 人向右移动两格
							map[ry][rx] = " 口 ";
							rx = rx + 2;
							map[ry][rx] = " ♞ ";
						}
					}
				} else {
					System.out.println("你有病！！！");
				}

				// 重绘制地图
				drawMap(map);
				if (by == my && bx == mx) {
					System.out.println("游戏胜利！！！");
					break;
				} else if (bx == 0 || bx == 9 || by == 0 || by == 9) {
					System.out.println("箱子已推到边缘处，游戏结束！！");
					break;
				}

			
		}
	}

	// 绘制
	public static void drawMap(String[][] map) {
		// 绘制
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}
