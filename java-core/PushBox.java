package com.java3.job1;

import java.util.Random;
import java.util.Scanner;

public class PushBox {

	/**
	 * @param args
	 */
	public static void drawMap(String[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[][] map = new String[10][10];
		// 初始化地图
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = " □ ";
			}
		}
		// 确认目标位置
		int targetx = map.length / 2 - 1;
		int targety = map.length / 2 - 1;
		map[targetx][targety] = " ☺ ";
		// 确认箱子位置
		Random rd = new Random();
		int bx = rd.nextInt(8) + 1;
		int by = rd.nextInt(8) + 1;
		while (bx == targetx && by == targety) {
			bx = rd.nextInt(8) + 1;
			by = rd.nextInt(8) + 1;
		}
		map[bx][by] = " ■ ";
		// 确认人的位置
		int px = rd.nextInt(10);
		int py = rd.nextInt(10);
		while ((px == bx && py == by) || (px == targetx && py == targety)) {
			px = rd.nextInt(10);
			py = rd.nextInt(10);
		}
		map[px][py] = " ♀ ";
		// 打印地图
		drawMap(map);
		while (true) {
			System.out.println("移动（w-上；s-下；a-左；d-右）");
			char order = input.next().charAt(0);
			
			switch (order) {
			case 'w':
				if (px == 0) {
					System.out.println("无法继续往上！"); // 人在顶部位置
				} else if (map[px - 1][py] != " ■ " && map[px - 1][py] != " ☺ ") {
					map[px][py] = " □ "; // 人前面没有障碍物
					px = px - 1;
					map[px][py] = " ♀ ";
				} else if (map[px - 1][py] == " ■ " && map[px - 2][py] == " □ ") {

					bx = bx - 1;
					map[bx][by] = " ■ ";
					map[px][py] = " □ "; // 人前面是箱子箱子前面有空位
					px = px - 1;
					map[px][py] = " ♀ ";
				} else if (map[px - 1][py] == " ☺ " && map[px - 2][py] == " □ ") {
					map[px][py] = " □ "; // 人前面是目标而且目标前有空位
					px = px - 2;
					map[px][py] = " ♀ ";
				} else if (map[px - 1][py] == " ☺ " && map[px - 2][py] == " ■ ") {
					map[px][py] = " □ "; // 人前是目标，目标前是箱子
					px = px - 2;
					map[px][py] = " ♀ ";
					bx = bx - 1;
					map[bx][by] = " ■ ";
				} else {
					map[px][py] = " □ ";
					px = px - 1; // 人前面是箱子，箱子前面是目标
					map[px][py] = " ♀ ";
					bx = bx - 1;
					map[bx][by] = " ■ ";
				}
				break;
			case 's':
				if (px == 9) {
					System.out.println("无法继续往下！"); // 人在顶部位置
				} else if (map[px + 1][py] != " ■ " && map[px + 1][py] != " ☺ ") {
					map[px][py] = " □ "; // 人前面没有障碍物
					px = px + 1;
					map[px][py] = " ♀ ";
				} else if (map[px + 1][py] == " ■ " && map[px + 2][py] == " □ ") {

					bx = bx + 1;
					map[bx][by] = " ■ ";
					map[px][py] = " □ "; // 人前面是箱子箱子前面有空位
					px = px + 1;
					map[px][py] = " ♀ ";
				} else if (map[px + 1][py] == " ☺ " && map[px + 2][py] == " □ ") {
					map[px][py] = " □ "; // 人前面是目标而且目标前有空位
					px = px + 2;
					map[px][py] = " ♀ ";
				} else if (map[px + 1][py] == " ☺ " && map[px + 2][py] == " ■ ") {
					map[px][py] = " □ "; // 人前是目标，目标前是箱子
					px = px + 2;
					map[px][py] = " ♀ ";
					bx = bx + 1;
					map[bx][by] = " ■ ";
				} else {
					map[px][py] = " □ ";
					px = px + 1; // 人前面是箱子，箱子前面是目标
					map[px][py] = " ♀ ";
					bx = bx + 1;
					map[bx][by] = " ■ ";
				}
				break;
			case 'a':
				if (py == 0) {
					System.out.println("无法继续往左！"); // 人在顶部位置
				} else if (map[px][py - 1] != " ■ " && map[px][py - 1] != " ☺ ") {
					map[px][py] = " □ "; // 人前面没有障碍物
					py = py - 1;
					map[px][py] = " ♀ ";
				} else if (map[px][py - 1] == " ■ " && map[px][py - 2] == " □ ") {

					by = by - 1;
					map[bx][by] = " ■ ";
					map[px][py] = " □ "; // 人前面是箱子箱子前面有空位
					py = py - 1;
					map[px][py] = " ♀ ";
				} else if (map[px][py - 1] == " ☺ " && map[px][py - 2] == " □ ") {
					map[px][py] = " □ "; // 人前面是目标而且目标前有空位
					py = py - 2;
					map[px][py] = " ♀ ";
				} else if (map[px][py - 1] == " ☺ " && map[px][py - 2] == " ■ ") {
					map[px][py] = " □ "; // 人前是目标，目标前是箱子
					py = py - 2;
					map[px][py] = " ♀ ";
					by = by - 1;
					map[bx][by] = " ■ ";
				} else {
					map[px][py] = " □ ";
					py = py - 1; // 人前面是箱子，箱子前面是目标
					map[px][py] = " ♀ ";
					by = by - 1;
					map[bx][by] = " ■ ";
				}
				break;
			case 'd':
				if (py == 9) {
					System.out.println("无法继续往右！"); // 人在顶部位置
				} else if (map[px][py + 1] != " ■ " && map[px][py + 1] != " ☺ ") {
					map[px][py] = " □ "; // 人前面没有障碍物
					py = py + 1;
					map[px][py] = " ♀ ";
				} else if (map[px][py + 1] == " ■ " && map[px][py + 2] == " □ ") {

					by = by + 1;
					map[bx][by] = " ■ ";
					map[px][py] = " □ "; // 人前面是箱子箱子前面有空位
					py = py + 1;
					map[px][py] = " ♀ ";
				} else if (map[px][py + 1] == " ☺ " && map[px][py + 2] == " □ ") {
					map[px][py] = " □ "; // 人前面是目标而且目标前有空位
					py = py + 2;
					map[px][py] = " ♀ ";
				} else if (map[px][py + 1] == " ☺ " && map[px][py + 2] == " ■ ") {
					map[px][py] = " □ "; // 人前是目标，目标前是箱子
					py = py + 2;
					map[px][py] = " ♀ ";
					by = by + 1;
					map[bx][by] = " ■ ";
				} else {
					map[px][py] = " □ ";
					py = py + 1; // 人前面是箱子，箱子前面是目标
					map[px][py] = " ♀ ";
					by = by + 1;
					map[bx][by] = " ■ ";
				}
				break;

			default:
				System.out.println("输入错误");
				break;
			}
			drawMap(map);
			if (bx == 0 || bx == 9 || by == 0 || by == 9) {
				System.out.println("很遗憾，游戏结束了");// 箱子在边界
				return;
			}
			if (bx == targetx && by == targety) {
				System.out.println("恭喜通关");
				return;
			}

		}
	}
}
