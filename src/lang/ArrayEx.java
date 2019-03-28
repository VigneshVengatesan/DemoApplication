package lang;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*int count=0,k=0;
			
				String c[]=new String[]{"1","5","8","7","1","8"};
				
				String b[]=new String[c.length];
				for(int i=0;i<c.length;i++){				
					
					for(int j=0;j<k;j++){ 
						
						if(b[j]==c[i]){
							count++;							
						}
					}
					
					if(count==0){
						b[k]=c[i];
						k++;
					}
				}				
				
				for(int i=0;i<k;i++){
					System.out.println(b[i]);
				}*/
		
		
		
		//*****************************************************************
		
		
		
		int k=0;
		String c[]=new String[]{"A","S","C","A","G","C"};
		
			String b[]=new String[c.length];
			
			for(int i=0;i<c.length;i++){
				int count=0;
				
				for(int j=0;j<k;j++){ 
					
					if(b[j]==c[i]){
						count++;							
					}
				}
				
				if(count==0){
					b[k]=c[i];
					k++;
				}
			}				
			
			for(int i=0;i<k;i++){
				System.out.println(b[i]);
			}
				
	}
}
				
				



