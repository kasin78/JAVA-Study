package SpaceInvaders;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class �ý��� {

	public static �� ������ġ_�÷��̾� = null;
	public static �� ������ġ_�κ��̴� = null;

	public static void ȭ�����ȭ() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}

	public static void ����() {
		for (int i = 3; i > 0; i--) {
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!");
			System.out.println("             " + i + "�� �� �����մϴ�!\n\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ȭ�����ȭ();
		}
	}

	public static void ���ӿ���() {
		ȭ�����ȭ();
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");
		System.out
				.println("    GAME OVER   GAME OVER   GAME OVER   GAME OVER   GAME OVER   ");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void Ŭ����() {
		ȭ�����ȭ();
		Runnable bgm = new Runnable() {
			public void run() {
				try {
//					// ���� �ȳ���
//					Clip clip = AudioSystem.getClip();
//					File file = new File("");
//					System.out.println(file.exists());
//					clip.open(AudioSystem.getAudioInputStream(file));
//					clip.start();
				} catch (Exception e) {
				}
			}
		};
		
		
		
		Thread clear = new Thread(bgm);
		clear.start();
		System.out.println("�����������������������������������");
		System.out.println("�����������������������������������");
		System.out.println("���ᦣ������  ��     ��������   ����   ������ ����");
		System.out.println("���ᦢ     ��     ��     ��  ��  ��  ������");
		System.out.println("���ᦢ     ��     ��������  ��������  ������������");
		System.out.println("���ᦢ     ��     ��     ��  ��  �� \\ ����");
		System.out.println("���ᦦ������  ��������  ��������  ��  ��  ��  \\����");
		System.out.println("�����������������������������������");
		System.out.println("�����������������������������������");
	}
}
