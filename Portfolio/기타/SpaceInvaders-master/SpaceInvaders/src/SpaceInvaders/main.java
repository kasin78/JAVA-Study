package SpaceInvaders;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import SpaceInvaders.�ý���;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class ����������Ŭ���� {
			char move = 'T';
			char direction = 'B';
			int high_score = 1000;
			int difficulty = 0;
			int time = 60;
			boolean is_stop = false;
			boolean is_over = false;
			boolean is_clear = false;
		}
		final ����������Ŭ���� share_area = new ����������Ŭ����();

		final Scanner scan = new Scanner(System.in);

		final �÷��̾� gamer;
		final int speed_screen = 200;

		gamer = new �÷��̾�();

		System.out
				.println("����������������������������������������������������������������������");
		System.out
				.println("����������������������������������������������������������������������");
		System.out
				.println("����������������������������������������������������������������������");
		System.out
				.println("����������������������������������������������������������������������");

		System.out
				.println("                                                       88              \n"
						+ "                                                       \"\"              \n"
						+ "                                                                       \n"
						+ ",adPPYba, 8b,dPPYba,  ,adPPYYba,  ,adPPYba,  ,adPPYba, 88 8b,dPPYba,   \n"
						+ "I8[    \"\" 88P'    \"8a \"\"     `Y8 a8\"     \"\" a8P_____88 88 88P'   `\"8a  \n"
						+ " `\"Y8ba,  88       d8 ,adPPPPP88 8b         8PP\"\"\"\"\"\"\" 88 88       88  \n"
						+ "aa    ]8I 88b,   ,a8\" 88,    ,88 \"8a,   ,aa \"8b,   ,aa 88 88       88  \n"
						+ "`\"YbbdP\"' 88`YbbdP\"'  `\"8bbdP\"Y8  `\"Ybbd8\"'  `\"Ybbd8\"' 88 88       88  \n"
						+ "          88                                                           \n"
						+ "          88                                                           \n"
						+ "                                                                    \n"
						+ "                                88                                  \n"
						+ "                                88                                  \n"
						+ "                                88                                  \n"
						+ "8b       d8 ,adPPYYba,  ,adPPYb,88  ,adPPYba, 8b,dPPYba, ,adPPYba,  \n"
						+ "`8b     d8' \"\"     `Y8 a8\"    `Y88 a8P_____88 88P'   \"Y8 I8[    \"\"  \n"
						+ " `8b   d8'  ,adPPPPP88 8b       88 8PP\"\"\"\"\"\"\" 88          `\"Y8ba,   \n"
						+ "  `8b,d8'   88,    ,88 \"8a,   ,d88 \"8b,   ,aa 88         aa    ]8I  \n"
						+ "    \"8\"     `\"8bbdP\"Y8  `\"8bbdP\"Y8  `\"Ybbd8\"' 88         `\"YbbdP\"'  ");
		System.out
				.println("����������������������������������������������������������������������");
		System.out
				.println("����������������������������������������������������������������������");
		System.out
				.println("����������������������������������������������������������������������");
		System.out
				.println("����������������������������������������������������������������������");

		System.out.println("			      1. �÷���");
		System.out.println("			      2. ����");
		System.out
				.println("����������������������������������������������������������������������");
		System.out
				.println("����������������������������������������������������������������������");
		System.out
				.println("����������������������������������������������������������������������");
		System.out
				.println("����������������������������������������������������������������������");

		String selection;
		selection = scan.nextLine();
		while (!selection.equals("1") && !selection.equals("2")) {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �ȹٷ� ������!");
			selection = scan.nextLine();
		}
		if (selection.equals("1")) {
			�ý���.ȭ�����ȭ();

		} else {
			�ý���.ȭ�����ȭ();
			System.out.println("�����մϴ�.");

			scan.close();
			return;
		}

		System.out
				.println("����\n      ��	<- UFO (���߸� ���ʽ����� 500��)\n��������	<- ���� \n\n :	<- �� �̻���(������ ���ӿ���!!)\n\n\n\n��	<- ��(�̻��Ͽ� ���� �ı��˴ϴ�.)\n !	<- �̻���\n(��)	<- �÷��̾�\nŬ���� ����: ���� ��� ����!\n���۹�: A(����), S(����), D(������) �Է� �� ����.\n�̻��� �߻�: �����̽��� �Է� �� ����\n\n������ �����Ϸ��� ���͸� ��������!");
		selection = scan.nextLine();
		�ý���.ȭ�����ȭ();

		�ý���.����();

		final int size_row = 15;
		final int size_col = 25;

		final ��[][] stage = new ��[size_row][size_col];
		for (int i = 0; i < size_row; i++) {
			for (int j = 0; j < size_col; j++) {
				stage[i][j] = new ��(i, j);
			}
		}

		for (int i = 0; i < size_row; i++) {
			for (int j = 0; j < size_col; j++) {
				stage[i][j].�� = stage[(stage[i][j].x��ǥ + size_row - 1)
						% size_row][stage[i][j].y��ǥ];
				stage[i][j].�� = stage[(stage[i][j].x��ǥ + 1) % size_row][stage[i][j].y��ǥ];
				stage[i][j].�� = stage[stage[i][j].x��ǥ][(stage[i][j].y��ǥ
						+ size_col - 1)
						% size_col];
				stage[i][j].�� = stage[stage[i][j].x��ǥ][(stage[i][j].y��ǥ + 1)
						% size_col];
			}
		}

		for (int i = 0; i < size_row; i++) {
			for (int j = 0; j < size_col; j++) {
				stage[i][j].�ʼ���("boundary");
			}
		}
		for (int i = 1; i < size_row - 1; i++) {
			for (int j = 1; j < size_col - 1; j++) {
				stage[i][j].�ʼ���("space");
			}
		}
		for (int i = 1; i < size_col - 1; i++) {
			stage[size_row - 2][i].�ʼ���("deadline");
		}

		�κ��̴�[][] invaders = new �κ��̴�[2][8];
		final ��[][] buffer = new ��[2][8];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				invaders[i][j] = new �κ��̴�();
				invaders[i][j].�ʵ���(stage[i + 2][j + 3]);
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				buffer[i][j] = new ��();
				buffer[i][j].invader = invaders[i][j];
				invaders[i][j].�κ��̴�_���ۿ�_�ʺ��� = buffer[i][j];
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				stage[size_row - 5 - i][size_col / 2 + 3 + j].wall = new ��();
				stage[size_row - 5 - i][size_col / 2 + 3 + j].wall.������ġ = stage[size_row
						- 5 - i][size_col / 2 + 3 + j];
				stage[size_row - 5 - i][size_col / 2 - 3 - j].wall = new ��();
				stage[size_row - 5 - i][size_col / 2 - 3 - j].wall.������ġ = stage[size_row
						- 5 - i][size_col / 2 - 3 - j];

			}
		}

		Runnable bgm = new Runnable() {
			Clip clip;

			public void run() {
				try {
//					clip = AudioSystem.getClip();
//					// ���� �ȳ���
//					File file = new File("");
//					System.out.println(file.exists());
//					clip.open(AudioSystem.getAudioInputStream(file));
//					clip.start();
//					while (!share_area.is_clear) {
//						Thread.sleep(100);
//					}
//					clip.stop();
				} catch (Exception e) {
//					clip.stop();
				
				}
			}
		};

		final Thread bgm_start = new Thread(bgm);
		bgm_start.start();

		Runnable showScreen = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				boolean flag = true;

				while (flag) {
					if (share_area.is_over) {
						return;
					}
					flag = false;
					�ý���.ȭ�����ȭ();
					System.out.println("");
					if (gamer.score >= share_area.high_score)
						share_area.high_score = gamer.score;
					System.out.println("\t���� �ð�: " + share_area.time + "��");
					System.out.println("1P\tHIGH SCORE   LIFE");
					System.out.println("" + gamer.score + "\t"
							+ share_area.high_score + "\t     " + gamer.����);
					for (int i = 0; i < size_row; i++) {
						for (int j = 0; j < size_col; j++) {
							if (stage[i][j].invader != null
									&& stage[i][j].invader.����Ȯ��) {
								stage[i][j].invader = null;
							}
							stage[i][j].���();
							if (stage[i][j].invader != null) {
								flag = true;
								if (!share_area.is_clear
										&& stage[i][j].��.������� == ����.�������) {
									share_area.is_over = true;
									�ý���.���ӿ���();
									return;
								}
							}
							if (share_area.is_over) {
								return;
							}
						}
						System.out.println("");
					}
					System.out
							.println("����\n���۹�: A(����), S(����), D(������) �Է� �� ����.\n�̻��� �߻�: �����̽��� �Է� �� ����\n(��): �÷��̾�\n��: ����   ��: ��\nŬ���� ����: ���� ��� ����!");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (!flag) {
						bgm_start.interrupt();
						�ý���.Ŭ����();
						System.out.println("\t     óġ����: " + gamer.score + "��");
						System.out.println("\t +�ð�����: " + share_area.time * 20
								+ "��");
						gamer.score += share_area.time * 20;
						System.out.println("\n\n\t     ��������: " + gamer.score
								+ "��!!\n\n");

					}
				}
			}
		};

		Runnable invader_move = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				boolean flag = true;
				boolean direction = true; // true means right, false means left
				while (flag) {
					if (direction) {
						// move right
						for (int j = 7; j >= 0; j--) {
							// move to down if invaders counter boundary
							if ((buffer[1][j].invader != null && buffer[1][j].invader.������ġ.��.������� == ����.���)
									|| (buffer[0][j].invader != null && buffer[0][j].invader.������ġ.��.������� == ����.���)) {
								direction = !direction;
								for (int k = 7; k >= 0; k--) {
									for (int l = 1; l >= 0; l--) {
										if (buffer[l][k].invader != null) {
											if (!share_area.is_clear
													&& buffer[l][k].invader.������ġ.��.������� == ����.�������) {
												share_area.is_over = true;

												�ý���.���ӿ���();
												return;
											}
											buffer[l][k].invader
													.�̵�(buffer[l][k].invader.������ġ,
															buffer[l][k].invader.������ġ.��);
										}
									}
								}
								break;
							}
							// check is dead
							for (int i = 1; i >= 0; i--) {
								if (buffer[i][j].invader != null) {
									if (buffer[i][j].invader.����Ȯ��) {
										buffer[i][j].invader = null;
										continue;
									}
									// move to right
									buffer[i][j].invader.�̵�(
											buffer[i][j].invader.������ġ,
											buffer[i][j].invader.������ġ.��);

								}
							}
						}
					} else {
						// move left
						for (int j = 0; j < 8; j++) {
							// move to down if invaders counter boundary
							if ((buffer[1][j].invader != null && buffer[1][j].invader.������ġ.��.������� == ����.���)
									|| (buffer[0][j].invader != null && buffer[0][j].invader.������ġ.��.������� == ����.���)) {
								direction = !direction;
								for (int k = 7; k >= 0; k--) {
									for (int l = 1; l >= 0; l--) {
										if (buffer[l][k].invader != null) {
											// if they come to deadline, then
											// game over
											if (!share_area.is_clear
													&& buffer[l][k].invader.������ġ.��.������� == ����.�������) {
												share_area.is_over = true;

												�ý���.���ӿ���();
												return;
											}
											buffer[l][k].invader
													.�̵�(buffer[l][k].invader.������ġ,
															buffer[l][k].invader.������ġ.��);
										}
									}
								}
								break;
							}
							for (int i = 1; i >= 0; i--) {
								if (buffer[i][j].invader != null) {
									if (buffer[i][j].invader.����Ȯ��) {
										buffer[i][j].invader = null;
										continue;
									}
									buffer[i][j].invader.�̵�(
											buffer[i][j].invader.������ġ,
											buffer[i][j].invader.������ġ.��);

									if (!share_area.is_clear
											&& buffer[i][j].invader.������ġ.��.������� == ����.�������) {
										share_area.is_over = true;
										�ý���.���ӿ���();
										return;
									}
								}
							}
						}
					}
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		};
		Runnable attack_invader = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (!share_area.is_clear) {
					Random rand = new Random();
					for (int i = 1; i >= 0; i--) {
						for (int j = 0; j < 8; j++) {
							if (buffer[i][j].invader != null
									&& rand.nextInt(10) % 10 == 0) {
								final �� tmp = buffer[i][j];
								Runnable atk_missile = new Runnable() {

									@Override
									public void run() {
										// TODO Auto-generated method stub
										�� pos = tmp.invader.������ġ.��.��;
										while (pos.������� != ����.�������) {
											if (pos.player != null
													|| pos.��.player != null
													|| pos.��.player != null) {
												share_area.is_over = true;
												�ý���.���ӿ���();
												return;
											}
											if (pos.wall != null) {
												pos.wall.�ı�();
												return;
											}
											if (pos.������� == ����.�̻���) {
												pos.������� = ����.����;
												return;
											}

											pos.������� = ����.���̻���;

											try {
												Thread.sleep(400);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											pos.������� = pos.��������;
											pos = pos.��;
										}
										return;
									}
								};
								Thread atkk = new Thread(atk_missile);
								atkk.start();
								try {
									Thread.sleep(6000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						;
					}
				}
			}
		};

		Thread inv_atk = new Thread(attack_invader);
		inv_atk.start();

		final ���� ext = new ����();
		Runnable ufo_set = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					// TODO Auto-generated method stub

					try {
						Thread.sleep(4000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					ext.�ʵ���(stage[2][1]);
					while (ext.������ġ.��.������� != ����.���) {
						ext.�̵�(ext.������ġ, ext.������ġ.��);
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					ext.������ġ.invader = null;

				}
			}
		};

		Thread ufo_start = new Thread(ufo_set);
		ufo_start.start();

		Runnable player_move = new Runnable() {

			����������Ŭ���� shere;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int x, y;
				x = size_row - 3;
				y = size_col / 2;
				�ý���.������ġ_�÷��̾� = stage[x][y];
				gamer.�ʵ���(stage[x][y]);
				shere = share_area;
				char direction = shere.direction;

				while (true) {
					direction = shere.direction;
					gamer.�̵�(
							direction,
							gamer.������ġ,
							stage[gamer.������ġ.x��ǥ][((gamer.������ġ.y��ǥ + 1) % size_col)],
							stage[gamer.������ġ.x��ǥ][((gamer.������ġ.y��ǥ + size_col - 1) % size_col)]);
					if (shere.move == ' ') {
						shere.move = 'O';
						gamer.�̻��Ϲ߻�();
					}
					try {
						Thread.sleep(gamer.�̵��ӵ�);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};

		Runnable time_limit = new Runnable() {
			public void run() {
				while (share_area.time > 0) {
					share_area.time--;
					try {
						Thread.sleep(1000);
					} catch (Exception e2) {
						// TODO: handle exception
					}
					if (!share_area.is_clear && share_area.time == 0) {
						share_area.is_over = true;
						�ý���.���ӿ���();
					}
				}
			}
		};

		final Scanner sc = new Scanner(System.in);
		String select = "gg";

		Thread show = new Thread(showScreen);
		Thread player_thread = new Thread(player_move);
		Thread invader_thread = new Thread(invader_move);
		Thread timeout = new Thread(time_limit);

		show.start();
		player_thread.start();
		invader_thread.start();
		timeout.start();

		while (((select = sc.nextLine()) != null) && !share_area.is_stop) {
			if (!select.equals("")) {
				share_area.direction = select.charAt(0);
				if (select.contains(" ")) {
					share_area.move = ' ';
				}
			}
		}

		sc.close();
		scan.close();
		�ý���.ȭ�����ȭ();
		System.out.println("�����մϴ�!");
		return;
	}

}
