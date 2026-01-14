package pkg.accessSpecifier;

class WithinThePackage {
		public void pub() {
			System.out.println("I'm Public Access Specifier");
		}
		
		protected void protect(){
			System.out.println("I'm Protected Access Specifier");
		}
		
		void defo(){
			System.out.println("I'm Default/Package Access Specifier");
		}
		
		private void priv(){
			System.out.println("I'm Private Access Specifier");
		}
	
	public static void main(String[] args) {
		WithinTheClass w = new WithinTheClass();
		w.pub();
		w.protect();
		w.defo();
		w.priv();
	}
}

