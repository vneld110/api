package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	/*
	 �޼ҵ帶�� �����ϴ� �ټ��� ��(�л��� ������) �� �ʿ��ѵ�,
    �� ������ ������ �÷����� �ʵ忡 �����ؾ߰ڴ�.
    �ʵ忡 �����ؾ� �޼ҵ���� ���� ������ �� �����ϱ�.
	 */
	private Vector<GradeVO> vc = new Vector<GradeVO>();
									// GradeVO �� getter ���� Ÿ���� ��� ����.
	GradeVO grade = new GradeVO();
	
	/*
	 input()
	 �л����� ������ �Է� �޴� ���ΰ�.. 
	 �Է¹����� ������ ������ �ʿ���
	 �迭�� ���� ������ �����ؾ��ϴµ� �߰��� �÷��� �ϴϱ�
	 �������� Ȯ���ϴ� �÷����� �����ؾ߰ڱ�. ���Ϳ� �־����.
	 */
	@Override
	public void input(GradeVO vo) {
		vc.add(vo);
	}
	/*
	 print()
	 ����ϴ� ���ΰ�? �׷� vo��ü�� toString()�� �����;���.
	 */
	@Override
	public void print() {
		System.out.println(vc.toString());
		
	}
	/*
	 searchGradeByHak()  
	 �й����� ������ ��ȸ�ϴ� ����̱�
     �й��� ���� �� �л����Ը� �����ϹǷ� ���ϰ��� String���״�
     ������ for loop ���ο� if�� �غ��߰ڴ�.
	 */
	@Override
	public String searchGradeByHak(String hak) {
		String msg = ""; // �������� �ʱ�ȭ, if�������� �޽��� ���.
		for(int i=0; i<vc.size(); i++){
			/*
			 myHak �� ���Ϳ��� i��° ����� �й��� �����Ͽ� ���� ����.
			 String Ÿ���̴�.
			 */
			String myHak = vc.elementAt(i).getHak();
		    /*	
		     �Ķ���ͷ� �޾ƿ� hak �� ���Ϳ��� ���Ϲ��� myHak��
			 ��ġ�ϴ� �� ���θ� üũ�ϴ� ����.
		     */
			if(hak.equalsIgnoreCase(myHak)){
				msg = hak;
				break;
			}else{
				msg = "��ȸ�� �й��� �����ϴ�.";

			}
		}
		return msg;
	}
	/*
	 searchGradeByName()
	 �̸����� ������ȸ�ε� ���ϰ��� �����ΰ��� ����
     ���� ���� String �� ó���ϰԲ� ����Ǿ���.
     ���ϰ��� �ϳ��� �������� for loop + if �������� 
     ���Ϳ�� ��� ���� ��߰ڴ�.
	 */
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> local = new Vector<String>(); // ����Ÿ�� �ٸ��Ƿ� ��������.
		for(int i=0; i<vc.size(); i++){
			/*
			 myHak �� ���Ϳ��� i��° ����� �й��� �����Ͽ� ���� ����.
			 String Ÿ���̴�.
			 */
			String myName = vc.elementAt(i).getName();
		    /*	
		     �Ķ���ͷ� �޾ƿ� name �� ���Ϳ��� ���Ϲ��� myName��
			 ��ġ�ϴ� �� ���θ� üũ�ϴ� ����.
		     */
			if(name.equalsIgnoreCase(myName)){
				local.add(name); // ���Ϳ� �����.
			
			}else{
				local.add("");
			
			}
		}
		
		return local;
	}
	/*
	 descGradeTotal() 	
	 ���������ΰ�����. Collections.sort ���� �ȴٴµ� ��������
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 ascGradeTotal()	 
	 ���������̸� Arrays.sort�� ����ǰڱ�
	 */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

}
