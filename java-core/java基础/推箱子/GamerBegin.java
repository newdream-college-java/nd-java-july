import java.util.Random;
import java.util.Scanner;

public class GamerBegin {
	int xx;
	int xy;
	int mx;
	int my;
	int rx;
	int ry;
	Scanner sc = new Scanner(System.in);

	/**
	 * 1.绘制除出一个10X10的初始地图
	 */
	public String[][] oldMap(String[][] map) {

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[j][i] = " 口 ";
			}
		}
		return map;
	}

	/**
	 * 2.绘制地图
	 */
	public void drawMap(String[][] map) {
		System.out.println("人-玩家的位置，箱-箱子的位置，标-目标的位置");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * 3.目标的初始位置
	 */
	public String[][] casePlace(String[][] map) {
		Random ran = new Random();
		mx = ran.nextInt(10);
		my = ran.nextInt(10);
		map[my][mx] = " 标 ";
		return map;
	}

	/**
	 * 5.箱子的初始位置
	 */
	public String[][] boxPlace(String[][] map) {
		Random ran = new Random();
		xx = ran.nextInt(8) + 1;
		xy = ran.nextInt(8) + 1;
		while (xx == mx && xy == my) {
			xx = ran.nextInt(8) + 1;
			xy = ran.nextInt(8) + 1;
		}
		map[xy][xx] = " 箱 ";
		return map;
	}

	/**
	 * 6.玩家的初始位置
	 */
	public String[][] heroPlace(String[][] map) {
		Random ran = new Random();
		rx = ran.nextInt(10);
		ry = ran.nextInt(10);
		while ((rx == mx && ry == my) || (rx == xx && ry == xy)) {
			rx = ran.nextInt(10);
			ry = ran.nextInt(10);
		}
		map[ry][rx] = " 人 ";
		return map;
	}

	/**
	 * 7.游戏开始时的地图
	 */
	public void beginMap(String[][] map) {
		oldMap(map);
		casePlace(map);
		boxPlace(map);
		heroPlace(map);
		drawMap(map);
	}

	/**
	 * 1.玩家选择上下左右移动
	 */
	public void heroMove(String[][] map) {
		beginMap(map);
		System.out.print("请选择你的移动(w-上，s-下，a-左，d-右，t-结束游戏)：");
		char ans = sc.next().charAt(0);
		while (ans != 't') {
			switch (ans) {
			case 'w':
				drawMap(upMove(map));
				break;
			case 'a':
				drawMap(leftMove(map));
				break;
			case 's':
				drawMap(downMove(map));
				break;
			case 'd':
				drawMap(rightMove(map));
				break;
			default:
				System.out.println("滚！");
				break;
			}
			if (xx == mx && xy == my) {// 如果箱子的位置与目标的位置相同，则表示赢了
				System.out.println("恭喜你，你赢了！");
				break;
			} else if ((xx == 0 && mx != 0) || (xx == 9 && mx != 9) || (xy == 0 && my != 0) || (xy == 9 && my != 9)) {// 如果箱子在四个角的位置，则表示输了
				System.out.println("挑战失败，继续努力哦！");
				break;
			} else {
				System.out.print("请选择你的移动(w-上，s-下，a-左，d-右，t-结束游戏)：");
				ans = sc.next().charAt(0);
			}
		}
		System.out.println("游戏结束！");
		System.out.print("继续游戏？(y/n)");
		char a = sc.next().charAt(0);
		if (a == 'y') {
			heroMove(map);
		} else {
			System.out.println("谢谢使用！");
		}
	}

	/**
	 * 2.上移
	 */
	public String[][] upMove(String[][] map) {
		if (ry - 1 == xy && rx == xx && xy > 0) {// 1.人的上面有箱子并且箱子不在上边界：先将箱子与其上一个口换位置，再将人与这个口换位置
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.令箱子的位置为人
			ry = xy;
			map[ry][xx] = " 人 ";
			// 3.箱子y轴上移一个位置
			xy = xy - 1;
			map[xy][xx] = " 箱 ";
		} else if ((ry - 1 == my && rx == mx) && !(my - 1 == xy && mx == xx) && my > 0) {// 2.人的前面有目标物但没有箱子并且标不在上边界：将人直接与目标的上一个口换位置，跳过目标
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.人跳过目标上移1
			ry = my - 1;
			map[ry][mx] = " 人 ";
		} else if ((ry - 1 == xy && rx == xx) && (my - 1 == xy && mx == xx) && xy > 0) {// 3.人的上面有目标物并且目标物的前面有箱子并且箱子不在下边界：将箱子与上面口换位置，然后将人与目标上一个口换位置，跳过目标
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.令箱子的位置为人
			ry = xy;
			map[ry][xx] = " 人 ";
			// 3.箱子上移1
			ry = xy - 1;
			map[ry][xx] = "箱";
		} else if (ry <= 0) {
			return map;
		} else if ((ry - 1 == xy && rx == xx && xy <= 0)
				|| ((ry - 1 == xy && rx == xx) && (my - 1 == xy && mx == xx) && xy <= 0)
				|| ((ry - 1 == my && rx == mx) && !(my - 1 == xy && mx == xx) && my <= 0)) {
			return map;
		} else {
			// 1.清空人原来原值
			map[ry][rx] = " 口 ";
			// 2.人y轴向上移动1
			ry = ry - 1;
			map[ry][rx] = " 人 ";
		}
		if (xx == mx && xy == my) {
			map[xy][xx] = " 赢 ";
		}
		return map;
	}

	/**
	 * 2.左移
	 */
	public String[][] leftMove(String[][] map) {
		if (ry == xy && rx - 1 == xx && xx > 0) {// 1.人的左边有箱子并且箱子不在左边界：先将箱子与其左边口换位置，再将人与这个口换位置
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.令箱子的位置为人
			rx = xx;
			map[ry][rx] = " 人 ";
			// 3.箱子x轴左移一个位置
			xx = xx - 1;
			map[xy][xx] = " 箱 ";
		} else if ((ry == my && rx - 1 == mx) && !(my == xy && mx - 1 == xx) && mx > 0) {// 2.人的左边有目标物但没有箱子并且目标不在左边界：将人直接与目标的左边一个口换位置，跳过目标
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.人跳过目标左移1
			rx = mx - 1;
			map[ry][rx] = " 人 ";
		} else if ((ry == xy && rx - 1 == xx) && (my == xy && mx - 1 == xx) && xx > 0) {// 3.人的左边有目标物并且目标物的左面有箱子并且箱子不在左边界：将箱子与左边口换位置，然后将人与目标左边一个口换位置，跳过目标
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.令箱子的位置为人
			rx = xx;
			map[ry][rx] = " 人 ";
			// 3.箱子左移1
			rx = xx - 1;
			map[ry][xx] = " 箱 ";
		} else if (rx <= 0) {// 如果人已经移动到左边界，则不能移动了
			return map;
		} else if (((ry == xy && rx - 1 == xx) && (my == xy && mx - 1 == xx) && xx <= 0)
				|| (ry == xy && rx - 1 == xx && xx <= 0)
				|| ((ry == my && rx - 1 == mx) && !(my == xy && mx - 1 == xx) && mx <= 0)) {
			return map;
		} else {
			// 1.清空人原来原值
			map[ry][rx] = " 口 ";
			// 2.人y轴向上移动1
			rx = rx - 1;
			map[ry][rx] = " 人 ";
		}
		if (xx == mx && xy == my) {
			map[xy][xx] = " 赢 ";
		}
		return map;
	}

	/**
	 * 2.下移
	 */
	public String[][] downMove(String[][] map) {
		if (ry + 1 == xy && rx == xx && xy < 9) {// 1.人的下面有箱子并且箱子不在下边界：先将箱子与其下一个口换位置，再将人与这个口换位置
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.令箱子的位置为人
			ry = xy;
			map[ry][xx] = " 人 ";
			// 3.箱子y轴下移一个位置
			xy = xy + 1;
			map[xy][xx] = " 箱 ";
		} else if ((ry + 1 == my && rx == mx) && !(my + 1 == xy && mx == xx) && my < 9) {// 2.人的下面有目标物但没有箱子并且标不在下边界：将人直接与目标的下一个口换位置，跳过目标
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.人跳过目标下移1
			ry = my + 1;
			map[ry][mx] = " 人 ";
		} else if ((ry + 1 == xy && rx == xx) && (my + 1 == xy && mx == xx) && xy < 9) {// 3.人的下面有目标物并且目标物的下面有箱子并且箱子不在下边界：将箱子与下面口换位置，然后将人与目标下一个口换位置，跳过目标
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.令箱子的位置为人
			ry = xy;
			map[ry][xx] = " 人 ";
			// 3.箱子下移1
			xy = xy + 1;
			map[xy][xx] = " 箱 ";
		} else if (ry >= 9) {
			return map;
		} else if (((ry + 1 == xy && rx == xx) && (my + 1 == xy && mx == xx) && xy >= 9)
				|| (ry + 1 == xy && rx == xx && xy >= 9)
				|| ((ry + 1 == my && rx == mx) && !(my + 1 == xy && mx == xx) && my >= 9)) {
			return map;
		} else {
			// 1.清空人原来原值
			map[ry][rx] = " 口 ";
			// 2.人y轴向下移动1
			ry = ry + 1;
			map[ry][rx] = " 人 ";
		}
		if (xx == mx && xy == my) {
			map[xy][xx] = " 赢 ";
		}
		return map;
	}

	/**
	 * 2.右移
	 */
	public String[][] rightMove(String[][] map) {
		if (ry == xy && rx + 1 == xx && xx < 9) {// 1.人的右边有箱子并且箱子不在右边界：先将箱子与其右边口换位置，再将人与这个口换位置
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.令箱子的位置为人
			rx = xx;
			map[ry][rx] = " 人 ";
			// 3.箱子x轴右移一个位置
			xx = xx + 1;
			map[xy][xx] = " 箱 ";
		} else if ((ry == my && rx + 1 == mx) && !(my == xy && mx + 1 == xx) && mx < 9) {// 2.人的右边有目标物但没有箱子并且右边界没有标：将人直接与目标的右边一个口换位置，跳过目标
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.人跳过目标右移1
			rx = mx + 1;
			map[ry][rx] = " 人 ";
		} else if ((ry == xy && rx + 1 == xx) && (my == xy && mx + 1 == xx) && xx < 9) {// 3.人的右边有目标物并且目标物的右边有箱子并且箱子不在右边界：将箱子与右边口换位置，然后将人与目标右边一个口换位置，跳过目标
			// 1.清空人原来的位置
			map[ry][rx] = " 口 ";
			// 2.令箱子的位置为人
			rx = xx;
			map[ry][rx] = " 人 ";
			// 3.箱子右移1
			rx = xx + 1;
			map[ry][xx] = " 箱 ";
		} else if (rx >= 9) {
			return map;
		} else if ((ry == xy && rx + 1 == xx && xx >= 9)
				|| (ry == xy && rx + 1 == xx) && (my == xy && mx + 1 == xx) && xx >= 9
				|| ((ry == my && rx + 1 == mx) && !(my == xy && mx + 1 == xx) && mx >= 9)) {
			return map;
		} else {
			// 1.清空人原来原值
			map[ry][rx] = " 口 ";
			// 2.人y轴向右移动1
			rx = rx + 1;
			map[ry][rx] = " 人 ";
		}
		if (xx == mx && xy == my) {
			map[xy][xx] = " 赢 ";
		}
		return map;
	}
}
