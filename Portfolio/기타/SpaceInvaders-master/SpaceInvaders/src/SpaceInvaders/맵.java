package SpaceInvaders;

// ��� = '��' ����= ' ' �̻��� = '!' ������� = '-' ���̻��� = ':'
enum ����{
	���, ����, �̻���, �������, ���̻���;
	
} 

public class �� {
	public int x��ǥ;
	public int y��ǥ;
	���� �������;
	���� ��������;
	
	���� invader = null;
	�÷��̾� player = null;
	�� wall = null;
	
	//���� ���� �����¿츦 ����ŵ�ϴ�.
	�� ��;
	�� ��;
	�� ��;
	�� ��; 
	��() {
		������� = ����.����;
	}
	
	public ��(int x, int y) {
		x��ǥ = x;
		y��ǥ = y;
		������� = ����.����;
	}
	
	public void �ʼ���(String status) {
		switch (status) {
		case "boundary"	: this.�������� = this.������� = ����.���;
		break;
		case "space"	: this.�������� = this.������� = ����.����;
		break;
		//case "object"	: this.status = component.object;
		case "missile"	: this.�������� = this.������� = ����.�̻���;
		break;
		case "deadline"	: this.�������� = this.������� = ����.�������;
		break;
		default			: System.out.println("There are no such status.");
		}
	}
	
	public void ���() {
		boolean flag = true;
		if(this.invader != null && this.player != null) {
			player.����();
		}			
		if(this.invader != null) {
			if(������� == ����.�������) {
				player.����(); 
				return;
			}
			if(������� == ����.�̻���) {
				System.out.print('#');
				invader.����();
				return;
			}
			if(this.wall != null) {
				this.wall = null;
			}
			invader.���();
			flag = false;
			return;
		}
		if(this.wall != null) {
			wall.���();
			return;
		}
		if(this.player != null) {
			if(������� == ����.�̻���) {
				System.out.print('#');
				player.����();
				return;
			}
			player.���();
			flag = false;
		}
		if(��.player != null) {
			System.out.print("(");
			flag = false;
		}
		if(��.player != null) {
			System.out.print(")");
			flag = false;
		}
		if(flag) {
			if(������� == ����.���) {
				System.out.print("��");
			} else if(������� == ����.����) {
				System.out.print(" ");
			} else if(������� == ����.�̻���) {
				System.out.print("!");
			} else if(������� == ����.�������) {
				System.out.print("-");
			} else if(������� == ����.���̻���) {
				System.out.print(":");
			}
		}
		return;
	}

}
