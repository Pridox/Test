

public class ProTester {
String[][] s;
	
	public ProTester(String[][] s) {
		this.s = s;
	}
	
	public boolean isWellSorted(String[] sequence) {
		int pos1=0;
		int pos2=0;
		for(int i=0;i<s.length;i++) {
			for(int a=0; a<sequence.length; a++) {
				if(sequence[a].equals(s[i][0])) {
				pos1=a;
				}
			}
			for(int b=0; b<sequence.length; b++) {
				if(sequence[b].equals(s[i][1])) {
					pos2=b;
				}
			}
		}
		if(pos1<pos2) {
			return true;
		}
		else {
			return false;
		}
	}
}
