
public class Bodega {
	
	private int capacidadM;
	private int capacidadoOcupada;
	private int cantA1;
	private int cantA2;

	public Bodega(){
		
		capacidadM=200;
		capacidadoOcupada=0;
		cantA1=0;
		cantA2=0;
			}
	public void descargarArticulo(int tipo){
			if (tipo==1){
				while(capacidadM<capacidadoOcupada+10);
				capacidadoOcupada+=10;
				System.out.println("SE HA AGREGADO UN ARTICULO DE 10");
				cantA1++;
			
			} if (tipo==2){
				
				while(capacidadM<capacidadoOcupada+15);
				capacidadoOcupada+=15;
				System.out.println("SE HA AGREGADO UN ARTICULO DE 15");
				cantA2++;
			}
			
			
			
			
			}
	public void crearPaquete(){
		
		if(cantA1==3&&cantA2==4)
		{
			cantA1-=3;
			cantA2-=4;
			capacidadoOcupada-=10*cantA1;
			capacidadoOcupada-=15*cantA2;
			System.out.println("PAQUETE CREADO");
		}else
		{
			
			System.out.println("NO SE HA PODIDO CREAR EL PAQUETE");
		}
		
		
			
}
	

}
