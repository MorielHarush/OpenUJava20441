package Poly2022a74;

public class AAA {
		private int _val;
		public AAA() {
		_val = 1;
		}
		public AAA(int val) {
		_val = val;
		}
		public int getVal() {
		return _val;
		}
		public void setVal (int val) {
		_val = val;
		}
		public String toString() {
		return "_val=" + _val;
		}
		
		public boolean equals (Object obj) {
			_val++;
			AAA a = (AAA) obj;
			return a._val == (_val - 1);
			}
		
		public boolean eq(AAA a) {
			return super.equals(a);
			}
			
	} //end of class AAA

