package SpaceInvaders;

import SpaceInvaders.����;

public class ���� extends ����{

	public �� �κ��̴�_���ۿ�_�ʺ��� = null;
	public int ���� = 100;
	public void ���() {
		System.out.print("��");
	}

	public void ����() {
//		this.current_position.invader = null;
//		if(this.buffer.invader == this)
//		this.buffer.invader = null;
		����Ȯ�� = true;
	}
	public void �ʵ���(�� pos) {
		pos.invader = this;
		this.������ġ = pos;		
	}

	public void �ʳ�����(�� pos) {
		pos.invader = null;
	}
	public void �̵�(�� current_pos, �� next_pos) {
		
		�ʳ�����(current_pos);
		�ʵ���(next_pos);
	}
}
