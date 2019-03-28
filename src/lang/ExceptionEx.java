package lang;

public class ExceptionEx {

	public void view()throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Drivers");
		}catch(Exception e){
			//System.out.println(e);
			throw new Exception(e);
		}
		System.out.println("**********");
		try{
			int a=10/0;
			
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx e=new ExceptionEx();
		try{
			e.view();
		}catch(Exception e1){
			System.out.println(e1);
		}
		
	}

}
