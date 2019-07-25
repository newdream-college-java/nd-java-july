import java.util.Random;

public class Map {
	// 目标✪
	int aimi;
	int aimj;
	int boxi;
	int boxj;
	int reni;
	int renj;
	boolean flag = true;
	String ai = " ⊠ ";
	String bi = " ⦾ ";
	String ci = " ✪ ";
	String win = " ⚫ ";
	String[][] a = new String[9][9];

	public void inputMap() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = ai;
				// System.out.print(a[i][j]);
			}
			System.out.println();
		}
		aimAdd();
		boxAdd();
		ren();
		showMap();

	}

	public void aimAdd() { // 添加目标
		System.out.println();
		Random rd = new Random();
		aimi = rd.nextInt(8) + 1;
		aimj = rd.nextInt(8) + 1;
		a[aimi][aimj] = ci;

	}

	public void boxAdd() { // 添加箱子
		Random rd = new Random();
		while (true) {
			boxi = rd.nextInt(7) + 1;
			boxj = rd.nextInt(7) + 1;
			if (boxi != aimi && boxj != aimj) {
				a[boxi][boxj] = bi;
				return;
			}

		}

	}

	public void ren() { // 添加人
		Random rd = new Random();
		while (true) {
			reni = rd.nextInt(9);
			renj = rd.nextInt(9);

			if (reni != aimi && renj != aimj && reni != boxi && renj != boxj) {
				a[reni][renj] = " ▲ ";
				return;
			}
		}
	}

	public void showMap() { // 打印地图
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {

				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	public void toW(String s) {
		String temp;
		if (s.equals("w") && reni - 1 >= 0) {
			// System.out.println(a[reni-1][renj]);
			if (a[reni - 1][renj] == ai) {
				temp = a[reni][renj];
				a[reni][renj] = a[reni - 1][renj];
				a[reni - 1][renj] = temp;
				reni--;
				showMap();
			} else if (a[reni - 1][renj] == bi && boxi - 1 >= 0
					|| a[reni - 2][renj] == ci) {
				if (a[boxi - 1][boxj] == ci) {
					temp = a[reni][renj];
					a[reni][renj] = a[reni - 1][renj];
					a[reni - 1][renj] = temp;
					a[reni][renj] = ai;
					reni--;
					a[boxi - 1][boxj] = win;
					showMap();
					flag = false;
					System.out.println("游戏结束！！！你赢了");
				} else {
					temp = a[boxi][boxj];
					a[boxi][boxj] = a[boxi - 1][boxj];
					a[boxi - 1][boxj] = temp;
					boxi--;
					temp = a[reni][renj];
					a[reni][renj] = a[reni - 1][renj];
					a[reni - 1][renj] = temp;
					reni--;
					showMap();
					if (boxi == 0) {
						System.out.println("游戏结束，死局！");
						flag = false;
						return;

					}
				}

			} else {
				System.out.println("到顶了，推不动了");
				showMap();
			}

		} else {
			System.out.println("走不动了");
			showMap();
		}
	}

	public void toS(String s) {
		String temp;
		if (s.equals("s") && reni + 1 <= 8) {
			if (a[reni + 1][renj] == ai) {
				temp = a[reni][renj];
				a[reni][renj] = a[reni + 1][renj];
				a[reni + 1][renj] = temp;
				reni++;

				showMap();
			} else if (a[reni + 1][renj] == bi && boxi + 1 <= 8
					|| a[reni + 2][renj] == ci) {
				if (a[boxi + 1][boxj] == ci) {
					temp = a[reni][renj];
					a[reni][renj] = a[reni + 1][renj];
					a[reni + 1][renj] = temp;
					a[reni][renj] = ai;
					reni++;
					a[boxi + 1][boxj] = win;
					showMap();
					flag = false;
					System.out.println("游戏结束！！！你赢了");

				} else {
					temp = a[boxi][boxj];
					a[boxi][boxj] = a[boxi + 1][boxj];
					a[boxi + 1][boxj] = temp;
					boxi++;
					temp = a[reni][renj];
					a[reni][renj] = a[reni + 1][renj];
					a[reni + 1][renj] = temp;
					reni++;
					showMap();
					if (boxi == 8) {
						System.out.println("游戏结束，死局！");
						flag = false;
						return;
					}
				}
			} else {
				System.out.println("到顶了，推不动了");
				showMap();
			}

		} else {
			System.out.println("走不动了!");
			showMap();
		}
	}

	public void toD(String s) {
		String temp;
		if (s.equals("d") && renj + 1 <= 8) {
			// System.out.println(a[reni-1][renj]);
			if (a[reni][renj + 1] == ai) {
				temp = a[reni][renj];
				a[reni][renj] = a[reni][renj + 1];
				a[reni][renj + 1] = temp;
				renj++;

				showMap();
				// System.out.println(a[reni-1][renj]);
			} else if (a[reni][renj + 1] == bi && boxj + 1 <= 8
					|| a[reni][renj + 2] == ci) {
				if (a[reni][renj + 2] == ci) {
					temp = a[reni][renj];
					a[reni][renj] = a[reni][renj + 1];
					a[reni][renj + 1] = temp;
					a[reni][renj] = ai;
					renj++;
					a[boxi][boxj + 1] = win;
					showMap();
					flag = false;
					System.out.println("游戏结束！！！你赢了");

				} else {
					temp = a[boxi][boxj];
					a[boxi][boxj] = a[boxi][boxj + 1];
					a[boxi][boxj + 1] = temp;
					boxj++;
					temp = a[reni][renj];
					a[reni][renj] = a[reni][renj + 1];
					a[reni][renj + 1] = temp;
					renj++;
					showMap();
					if (boxj == 8) {
						System.out.println("游戏结束，死局！");
						flag = false;
						return;
					}
				}
			} else {
				System.out.println("到顶了，推不动了");
				showMap();
			}

		} else {
			System.out.println("走不动了!");
			showMap();
		}
	}

	public void toA(String s) {
		String temp;
		if (s.equals("a") && renj - 1 >= 0) {
			if (a[reni][renj - 1] == ai) {
				temp = a[reni][renj];
				a[reni][renj] = a[reni][renj - 1];
				a[reni][renj - 1] = temp;
				renj--;

				showMap();
				// System.out.println(a[reni-1][renj]);
			} else if (a[reni][renj - 1] == bi && boxj - 1 >= 0
					|| a[reni][renj - 2] == ci) {
				if (a[reni][renj - 2] == ci) {
					temp = a[reni][renj];
					a[reni][renj] = a[reni][renj - 1];
					a[reni][renj - 1] = temp;
					a[reni][renj] = ai;
					renj--;
					a[boxi][boxj - 1] = win;
					showMap();
					flag = false;
					System.out.println("游戏结束！！！你赢了");
				} else {

					temp = a[boxi][boxj];
					a[boxi][boxj] = a[boxi][boxj - 1];
					a[boxi][boxj - 1] = temp;
					boxj--;
					temp = a[reni][renj];
					a[reni][renj] = a[reni][renj - 1];
					a[reni][renj - 1] = temp;
					renj--;

					showMap();
					if (boxj == 0) {
						System.out.println("游戏结束，死局！");
						flag = false;
						return;
					}
				}
			} else {
				System.out.println("到顶了，推不动了");
				showMap();
			}

		} else {
			System.out.println("走不动了!");
			showMap();
		}
	}
}
