package SpaceInvaders;

public class �÷��̾� extends ���� {
	public int ���� = 2;
	public int score = 0;
	�� �̷���ġ;
	public int �̵��ӵ� = 400;
	
	public void �̵�(char direction, �� current_pos, �� right, �� left) {
		if(direction == 'a' || direction == 'A' || direction == '��') {
			if(left.��.������� != ����.���) {
				�̷���ġ = left;
				this.�̵�(current_pos, �̷���ġ);
			}
		}
		if(direction == 'd' || direction == 'D' || direction == '��') {
			if(right.��.������� != ����.���) {
				�̷���ġ = right;
				this.�̵�(current_pos, �̷���ġ);
			}
		}
	}
	
	public void �̵�(�� current_pos, �� next_pos) {
		�ʵ���(next_pos);
		�ʳ�����(current_pos);
	}
	
	public void �ʵ���(�� pos) {
		pos.player = this;
		this.������ġ = pos;		
	}
	
	public void �ʳ�����(�� pos) {
		pos.player = null;
	}
	
	Runnable �̻��� = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			�� pos = ������ġ.��;
			boolean flag = true;
			while(pos.��.������� != ����.���) {
				if(pos.invader != null) {
					pos.invader.����();
					score = score + pos.invader.����;
					return;
				}
				if(pos.wall != null) {
					pos.wall.�ı�();
					return;
				}
				if(pos.��.������� == ����.���̻���) {
					pos.��.������� = ����.����;
					return;
				}
				
				pos.������� = ����.�̻���;
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				pos.������� = pos.��������;
				pos = pos.��;
			}
			return;
		}
	};
	
	public void �̻��Ϲ߻�() {
		Thread launch = new Thread(�̻���);
		launch.start();
	}
	
	public void ����() {
		����--;
		if(����<0) {
			�ý���.���ӿ���();
		} else {
		}
		
	}
	public void ���() {
		System.out.print("��");
	}

}