package Ex;

public interface Diagonal{
		
	
		public default double calculaDiagonal(){ 
		return (Math.sqrt((this.getBase(),2) + (this.getAltura(),2)));
		}
}
